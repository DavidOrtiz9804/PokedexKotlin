package com.example.pokedex.data.network

import com.example.pokedex.data.model.PokeModel
import retrofit2.Response
import retrofit2.http.GET

interface PokeApiClient {
    @GET("pokemon?limit=151")
    suspend fun getAllPokemons(): Response<PokeModel>
}