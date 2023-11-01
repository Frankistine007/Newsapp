package com.example.newsapp

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso

class RVAdapterall(val context: Context,val newslist: List<Article>): RecyclerView.Adapter<RVAdapterall.RVViewHolder>() {
    inner class RVViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var title: TextView
        var image: ImageView
        var content: TextView

        init {
            title = itemView.findViewById(R.id.text)
            image = itemView.findViewById(R.id.image)
            content = itemView.findViewById(R.id.content)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RVViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_view, parent, false)
        return RVViewHolder(view)
    }

    override fun getItemCount(): Int {
        return newslist.size
    }

    override fun onBindViewHolder(holder: RVViewHolder, position: Int) {
        val currentItem = newslist[position]
        holder.title.text = currentItem.title
        holder.content.text = currentItem.content
        Picasso.get().load(currentItem.urlToImage).into(holder.image);
        holder.itemView.setOnClickListener {
            val intent = Intent(context, FullNews::class.java)

            intent.putExtra("title", currentItem.title)
            intent.putExtra("content", currentItem.content)
            intent.putExtra("image", currentItem.urlToImage)

            context.startActivity(intent)
        }
    }
}