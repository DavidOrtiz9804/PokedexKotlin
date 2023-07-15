package com.example.pokedex.data.model

import javax.inject.Inject

class PokeProvider @Inject constructor() {

    var pokemons: List<Pokemon> = emptyList()

}