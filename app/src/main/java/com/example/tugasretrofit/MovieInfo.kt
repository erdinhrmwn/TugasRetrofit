package com.example.tugasretrofit

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.movie_info.*


class MovieInfo : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.movie_info)
        val title = intent.getStringExtra("title")
        val overview = intent.getStringExtra("overview")
        val poster = intent.getStringExtra("poster")
        val imageUrl = StringBuilder()
        imageUrl.append(getString(R.string.base_path_poster)).append(poster)

        Glide.with(this).load(imageUrl.toString()).into(mvPoster)
        mvTitle.setText(title)
        mvOverview.setText(overview)
        Log.d("INFO", title + " " + overview)
    }
}