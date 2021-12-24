package fr.epsi.android_project

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.core.content.ContextCompat.startActivity
import com.squareup.picasso.Picasso
import org.w3c.dom.Text


class ProductAdapter(val product : ArrayList<Product>): RecyclerView.Adapter<ProductAdapter.ViewHolder>() {

    class ViewHolder(private val context: Context, view: View) : RecyclerView.ViewHolder(view),
        View.OnClickListener {
        val imageViewProduct = view.findViewById<ImageView>(R.id.imageViewProduct)
        var description = view.findViewById<TextView>(R.id.description)
        val name = view.findViewById<TextView>(R.id.productName)
        var product : Product? = null

        init {
            itemView.setOnClickListener(this)
        }

        override fun onClick(v: View?) {
            val newIntent = Intent(context,ProductDetailActivity::class.java)
            newIntent.putExtra("title", product?.name)
            newIntent.putExtra("url", product?.picture_url)
            newIntent.putExtra("description",product?.description)
            startActivity(context,newIntent,null)
        }
    }


    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        val product = product.get(position)
        Picasso.get().load(product.picture_url).into(holder.imageViewProduct)
        holder.description.text = product.description
        holder.name.text = product.name
        holder.product = product

    }

    override fun getItemCount(): Int {
        return product.size
    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(viewGroup.context)
            .inflate(R.layout.products, viewGroup, false)

        return ViewHolder(viewGroup.context,view)
    }
}