package com.example.pokedex.presentation.view

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardColors
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import com.example.pokedex.data.model.Pokemon

@Composable
fun PokemonCard(pokemon: Pokemon) {
    Card(
        shape = RoundedCornerShape(30.dp),
        elevation = CardDefaults.cardElevation(10.dp),
        modifier = Modifier
            .padding(8.dp)
    ) {
        //var brush = Brush.verticalGradient(listOf(Color(0xFFE74C3C), Color(0xFFFFFFFF)))
        var brush = Brush.verticalGradient(listOf(Color(0xFF34495E), Color(0xFFF8F9F9)))
        Column(
            modifier = Modifier
                .background(brush)
                .padding(35.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            AsyncImage(
                model = pokemon.imgFront,
                contentDescription = null
            )
            Text(
                text = pokemon.name.replaceFirstChar { it.uppercase() },
                color = Color.Black
            )
        }
    }
}