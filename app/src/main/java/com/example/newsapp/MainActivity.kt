package com.example.newsapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val bsports = findViewById<Button>(R.id.bsports)
        val bmedia = findViewById<Button>(R.id.bmedia)
        val bnational = findViewById<Button>(R.id.bnational)
        val binternational = findViewById<Button>(R.id.binternational)
        val bpolitics = findViewById<Button>(R.id.bpolitics)
        val ball = findViewById<Button>(R.id.ball)

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
            val intent = Intent(this,International::class.java)
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