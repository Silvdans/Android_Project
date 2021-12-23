package fr.epsi.android_project

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast
import androidx.core.view.get
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import okhttp3.*
import org.json.JSONObject
import java.io.IOException

class CategoryActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_category)
        setHeaderTitle("Rayons")
        showBack();

        val categories = arrayListOf<Category>()

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerViewCategory)
        recyclerView.layoutManager = LinearLayoutManager(this)
        val categoryAdapter = CategoryAdapter(categories)
        recyclerView.adapter=categoryAdapter

        val okHttpClient: OkHttpClient = OkHttpClient.Builder().build()
        val mRequestURL="https://djemam.com/epsi/categories.json"
        val request = Request.Builder()
            .url(mRequestURL)
            .get()
            .cacheControl(CacheControl.FORCE_NETWORK)
            .build()

        okHttpClient.newCall(request).enqueue(object : Callback {
            override fun onFailure(call: Call, e: IOException) {
                Log.d("zzzz","CA A CRASH BG")
            }

            override fun onResponse(call: Call, response: Response) {
                val data = response.body?.string()

                if(data!=null){
                    val jsCategories = JSONObject(data)
                    val jsArrayCategory = jsCategories.getJSONArray("items")
                    for(i in 0 until jsArrayCategory.length()){
                        val jsCategory = jsArrayCategory.getJSONObject(i)
                        val category = Category(jsCategory.optString("category_id",""),
                            jsCategory.optString("title",""),
                            jsCategory.optString("products_url",""))
                        categories.add(category)
                    }
                }
                runOnUiThread(Runnable {
                    categoryAdapter.notifyDataSetChanged()
                })
            }
        })

    }
}