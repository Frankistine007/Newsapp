package com.example.newsapp

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.ImageView
import android.widget.TextView

class FullNews : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_full_news)
        val img1 = findViewById<ImageView>(R.id.img)
        val con = findViewById<TextView>(R.id.content)
        val tit = findViewById<TextView>(R.id.title)

        val title = intent.getStringExtra("title")
        val content = intent.getStringExtra("content")
        val image = intent.getIntExtra("image",R.drawable.ic_launcher_background)

        con.text = content
        tit.text = title
        img1.setImageResource(image)


    }
}