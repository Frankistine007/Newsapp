package com.example.newsapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class NewsAdapter(val newslist: List<News>): RecyclerView.Adapter<NewsAdapter.RVViewHolder>() {
    inner class RVViewHolder(itemView : View): RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RVViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_view,parent,false)
        return RVViewHolder(view)
    }

    override fun getItemCount(): Int {
        return newslist.size
    }

    override fun onBindViewHolder(holder: RVViewHolder, position: Int) {
        holder.itemView.apply{
            val text = findViewById<TextView>(R.id.text)
            val image = findViewById<ImageView>(R.id.image)


            text.text = newslist[position].title
            image.setImageResource(newslist[position].image)
        }
    }
}