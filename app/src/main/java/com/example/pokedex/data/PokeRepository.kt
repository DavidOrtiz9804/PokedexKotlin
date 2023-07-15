package com.example.pokedex.data

import com.example.pokedex.data.model.PokeProvider
import com.example.pokedex.data.model.Pokemon
import com.example.pokedex.data.network.PokeService
import javax.inject.Inject

class PokeRepository @Inject constructor(
    private val api: PokeService,
    private val pokeProvider: PokeProvider
) {
    suspend fun getAllPokemons(): List<Pokemon> {
        val response = api.getPokemons().results
        pokeProvider.pokemons = response
        return response
    }
}