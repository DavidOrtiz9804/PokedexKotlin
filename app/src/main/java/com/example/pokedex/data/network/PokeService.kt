package com.example.pokedex.data.network

import com.example.pokedex.data.model.PokeModel
import com.example.pokedex.data.model.Pokemon
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject

class PokeService @Inject constructor(
    private val api: PokeApiClient
) {
    suspend fun getPokemons(): PokeModel {
        return withContext(Dispatchers.IO) {
            val response = api.getAllPokemons()
            response.body() ?: PokeModel(emptyList())
        }
    }
}