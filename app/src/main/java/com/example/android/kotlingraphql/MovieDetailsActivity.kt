package com.example.android.kotlingraphql

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.util.Log
import com.apollographql.apollo.ApolloCall
import com.apollographql.apollo.ApolloClient
import com.apollographql.apollo.api.Response
import com.apollographql.apollo.exception.ApolloException
import kotlinx.android.synthetic.main.activity_movie_details.*
import okhttp3.OkHttpClient

class MovieDetailsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_movie_details)

        val apolloClient = ApolloClient.builder()
                .serverUrl("https://api.graph.cool/simple/v1/cjcujyx5f07p801916rjjigz7")
                .okHttpClient(OkHttpClient.Builder().build()).build()

        Log.d("TAG",intent.getStringExtra("movie_id"))
        /*apolloClient.query(ReviewQuery.builder().id(intent.getStringExtra("movie_id"))
                .build()).enqueue(object : ApolloCall.Callback<ReviewQuery.Data>() {

            override fun onResponse(response: Response<ReviewQuery.Data>) {
                Log.d("TAG", response.errors().toString())
                Log.d("TAG", response.data().toString())
                Log.d("TAG", response.data()!!.Review().toString())
                *//*runOnUiThread{
                    setupRecyclerView(response.data()!!.allReviews())
                }*//*
            }

            override fun onFailure(e: ApolloException) {
                Log.d("TAG", e.message)
            }

        })*/
    }

    /*private fun setupRecyclerView(allReviews: MutableList<ReviewQuery.Data>) {
        val adapter = MovieDetailAdapter(allReviews)
        recycler_view_reviews.layoutManager= LinearLayoutManager(this)
        recycler_view_reviews.adapter = adapter

    }*/
}
