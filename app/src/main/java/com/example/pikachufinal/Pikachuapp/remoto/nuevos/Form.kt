package com.example.pikachufinal.Pikachuapp.remoto.nuevos


import com.google.gson.annotations.SerializedName

data class Form(
    @SerializedName("name")
    val name: String,
    @SerializedName("url")
    val url: String
)