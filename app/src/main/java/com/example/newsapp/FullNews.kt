package com.example.newsapp

import android.annotation.SuppressLint
import android.content.Intent
import android.net.Uri
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
        val imgiv = findViewById<ImageView>(R.id.img)
        val tittv = findViewById<TextView>(R.id.title)
        val contv = findViewById<TextView>(R.id.content)
        val urltv = findViewById<TextView>(R.id.url)


        val title = intent.getStringExtra("title")
        val image = intent.getStringExtra("image")
        val content = intent.getStringExtra("content")
        val url = intent.getStringExtra("url")?:""

        contv.text = content
        tittv.text = title
        urltv.text = url
        Picasso.get().load(image).into(imgiv)

        urltv.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse(url)
            startActivity(intent)
        }

    }
}