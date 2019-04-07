package com.example.tugasretrofit.model

import com.google.gson.annotations.SerializedName

data class Movie(
    @SerializedName("original_title") val originalTitle: String?,
    @SerializedName("homepage") val homepage: String?,
    @SerializedName("overview") val overview: String?,
    @SerializedName("poster_path") val posterPath: String?
)