package com.pmdm.actividad07pmdm

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp


@Composable
fun SuperHeroView() {
    LazyRow {
        items(getSuperHero()) {
            ItemHero(superhero = it)
        }
    }
}
@Composable
fun ItemHero(superhero: Superhero) {
    //Layout Superheroes:
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
        shape = RoundedCornerShape(8.dp),
        border = BorderStroke(2.dp, Color.Red)
    ) {
        Column(
            modifier = Modifier
                .padding(16.dp)
        ) {
            // Image with contentScale = ContentScale.Crop
            Image(
                painter = painterResource(id = superhero.photo),
                contentDescription = "SuperHero Avatar",
                modifier = Modifier
                    .fillMaxWidth()
                    .height(200.dp)
                    .clip(shape = RoundedCornerShape(8.dp)),
                contentScale = ContentScale.Crop
            )

            Spacer(modifier = Modifier.height(16.dp))

            Row() {
                Text(text = superhero.superheroName)
            }
            Row(horizontalArrangement = Arrangement.Center){
                Text(text = superhero.realName)
            }
            // Padding for the last text
            Spacer(modifier = Modifier.height(8.dp))

            Row(horizontalArrangement = Arrangement.End) {
                Text(text = superhero.publisher)
            }
        }
    }
}

fun getSuperHero(): List<Superhero> {
    return mutableListOf(
        Superhero("Spiderman", "Peter Parker", "Marvel", R.drawable.spiderman),
        Superhero("Wolverine", "James Howlett", "Marvel", R.drawable.logan),
        Superhero("Batman", "Bruce Wayne", "DC", R.drawable.batman),
        Superhero("Thor", "Thor Odinson", "Marvel", R.drawable.thor),
        Superhero("Flash", "Jay Garrick", "DC", R.drawable.flash),
        Superhero("Green Lantern", "Alan Scott", "DC", R.drawable.green_lantern),
        Superhero("Wonder Woman", "Princess Diana", "DC", R.drawable.wonder_woman)
    )
}
