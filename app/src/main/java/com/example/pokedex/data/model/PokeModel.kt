package com.example.pokedex.data.model

import com.google.gson.annotations.SerializedName

data class PokeModel(
    @SerializedName("results") val results: List<Pokemon>
)
