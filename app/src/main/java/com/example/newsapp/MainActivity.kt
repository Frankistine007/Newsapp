package com.example.newsapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val bsports = findViewById<ImageButton>(R.id.bsports)
        val bmedia = findViewById<ImageButton>(R.id.bmedia)
        val bnational = findViewById<ImageButton>(R.id.bnational)
        val binternational = findViewById<ImageButton>(R.id.bbusiness)
        val bpolitics = findViewById<ImageButton>(R.id.bpolitics)
        val ball = findViewById<ImageButton>(R.id.ball)

        bsports.setOnClickListener {

            val intent = Intent(this,Sports::class.java)
            startActivity(intent)
        }

        bmedia.setOnClickListener {
            val intent = Intent(this,Media::class.java)
            startActivity(intent)
        }

        bnational.setOnClickListener {
            val intent = Intent(this,National::class.java)
            startActivity(intent)
        }
        binternational.setOnClickListener {
            val intent = Intent(this,Business::class.java)
            startActivity(intent)
        }
        bpolitics.setOnClickListener {
            val intent = Intent(this,Politics::class.java)
            startActivity(intent)
        }
        ball.setOnClickListener {
            val intent = Intent(this,All::class.java)
            startActivity(intent)
        }


    }

}