package fr.epsi.android_project

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.recyclerview.widget.RecyclerView
import androidx.core.content.ContextCompat.startActivity


class CategoryAdapter(val category : ArrayList<Category>): RecyclerView.Adapter<CategoryAdapter.ViewHolder>() {

    class ViewHolder(private val context: Context, view: View) : RecyclerView.ViewHolder(view),
        View.OnClickListener {
        val button = view.findViewById<Button>(R.id.button_rayon)
        var category : Category? = null

        init {
            button.setOnClickListener(this)
        }

        override fun onClick(v: View?) {
            val newIntent = Intent(context,ProductActivity::class.java)
            newIntent.putExtra("title", category?.title)
            newIntent.putExtra("url", category?.product_url)
            startActivity(context,newIntent,null)
        }
    }


    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        val category = category.get(position)
        holder.button.text = category.title
        holder.category = category
    }

    override fun getItemCount(): Int {
        return category.size
    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(viewGroup.context)
            .inflate(R.layout.rayons, viewGroup, false)

        return ViewHolder(viewGroup.context,view)
    }
}