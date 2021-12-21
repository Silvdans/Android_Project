package fr.epsi.android_project

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import fr.epsi.android_project.CategoryAdapter.ViewHolder

class CategoryAdapter(val category : ArrayList<Category>): RecyclerView.Adapter<CategoryAdapter.ViewHolder>(){
    class ViewHolder(view:View) :RecyclerView.ViewHolder(view){
        val button = view.findViewById<Button>(R.id.button_rayon)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val category = category.get(position)
        holder.button.text = category.title
    }

    override fun getItemCount(): Int {
        return category.size
    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(viewGroup.context)
            .inflate(R.layout.rayons, viewGroup, false)

        return ViewHolder(view)
    }
}