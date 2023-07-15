package com.example.pokedex.domain

import com.example.pokedex.data.PokeRepository
import javax.inject.Inject

class GetPokemonsUseCase @Inject constructor(
    private val repository: PokeRepository
) {
    suspend operator fun invoke() = repository.getAllPokemons()
}