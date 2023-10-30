package com.example.newsapp

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso

class RVAdapterpolitics(val newslist: List<Article>): RecyclerView.Adapter<RVAdapterpolitics.RVViewHolder>()  {
    inner class RVViewHolder(itemView : View): RecyclerView.ViewHolder(itemView) {
        var title: TextView
        var image: ImageView

        init {
            title = itemView.findViewById(R.id.text)
            image = itemView.findViewById(R.id.image)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RVViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_view,parent,false)
        return RVViewHolder(view)
    }

    override fun getItemCount(): Int {
        return newslist.size
    }

    override fun onBindViewHolder(holder: RVViewHolder, position: Int) {
        val currentItem = newslist[position]
        holder.title.text= currentItem.title
        Picasso.get().load(currentItem.urlToImage).into(holder.image);
//            this.setOnClickListener {
//                val intent = Intent(context, FullNews::class.java)
//
//                intent.putExtra("title", newslist[position].title)
//                intent.putExtra("content", newslist[position].content)
//                intent.putExtra("image", newslist[position].image)
//
//                context.startActivity(intent)
//            }
    }
}