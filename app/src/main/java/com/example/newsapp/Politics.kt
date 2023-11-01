package com.example.newsapp

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class Politics: AppCompatActivity()  {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.recyclerview)

        val recyclerView = findViewById<RecyclerView>(R.id.rvitems)


        val retrofitBuilder = Retrofit.Builder()
            .baseUrl("https://newsapi.org/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(NewsApiService::class.java)


        val country = "in"
        val category = "politics"
        val apiKey = "1b35d9408dba4c4389c5339b9416ac42"

        val retrofitData = retrofitBuilder.getnewsdata(country,category,apiKey)

        retrofitData.enqueue(object : Callback<MyData?> {
            override fun onResponse(call: Call<MyData?>, response: Response<MyData?>) {
                var responseBody = response.body()
                var newsList = responseBody?.articles!!
                recyclerView.layoutManager = LinearLayoutManager(this@Politics)
                var allAdapter = RVAdapterall(this@Politics,newsList)
                recyclerView.adapter = allAdapter

            }

            override fun onFailure(call: Call<MyData?>, t: Throwable) {
                //api call fails
                Log.d("Main Activity","on failure"+t.message)
            }
        })
    }
}