package com.example.pikachufinal.Pikachuapp.remoto


import com.google.gson.annotations.SerializedName

data class PokemonApiPlug(
    @SerializedName("count")
    val count: Int,
    @SerializedName("next")
    val next: String,
    @SerializedName("previous")
    val previous: Any,
    @SerializedName("results")
    val results: List<Result>
)