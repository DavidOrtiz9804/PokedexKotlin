package com.example.pokedex.presentation

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.pokedex.data.model.Pokemon
import com.example.pokedex.domain.GetPokemonsUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class PokeViewModel @Inject constructor(
    private val getPokemonsUseCase: GetPokemonsUseCase
): ViewModel() {

    var pokemonList = MutableLiveData<Pokemon>()

    fun OnCreate() {
        viewModelScope.launch {
            val result = getPokemonsUseCase()
            if (!result.isNullOrEmpty()) {
                for (i in result) {
                    pokemonList.postValue(i)
                }
            }
        }
    }
}