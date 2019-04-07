package com.example.tugasretrofit.model

data class MovieResponse(
    var page: Int,
    val results: ArrayList<Movie>,
    val totalResult: Int,
    val totalPage: Int
)