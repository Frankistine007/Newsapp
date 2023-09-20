package com.example.newsapp

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class RVAdapterpolitics(val newslist: List<News>): RecyclerView.Adapter<RVAdapterpolitics.RVViewHolder>()  {
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
            this.setOnClickListener {
                val intent = Intent(context, FullNews::class.java)

                intent.putExtra("title", newslist[position].title)
                intent.putExtra("content", newslist[position].content)
                intent.putExtra("image", newslist[position].image)

                context.startActivity(intent)
            }
        }
    }
}