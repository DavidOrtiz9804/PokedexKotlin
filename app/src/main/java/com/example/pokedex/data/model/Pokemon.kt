package com.example.pokedex.data.model

data class Pokemon(
    val name: String,
    val url: String
) {
    val id: Int
        get() {
            val numPokemon = url.split("/")
            return numPokemon[numPokemon.size - 2].toIntOrNull() ?: 0
        }

    val imgFront: String
        get() = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/$id.png"
}
