package com.example.newsapp

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.ImageView
import android.widget.TextView
import com.squareup.picasso.Picasso

class FullNews : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_full_news)
        val img = findViewById<ImageView>(R.id.img)
        val tit = findViewById<TextView>(R.id.title)
        val con = findViewById<TextView>(R.id.content)
        val url = findViewById<TextView>(R.id.url)


        val title = intent.getStringExtra("title")
        val image = intent.getStringExtra("image")
        val content = intent.getStringExtra("content")
        val urll = intent.getStringExtra("url")

        con.text = content
        tit.text = title
        Picasso.get().load(image).into(img)


    }
}