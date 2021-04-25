package com.example.funfactapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.material.Text
import androidx.compose.runtime.Composable

import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.White
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.sp
import kotlin.random.Random
import kotlin.random.nextInt

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val painter = painterResource(id = R.drawable.imagem)
            ColorBox(
                Modifier.fillMaxSize()
            )
        }
    }
}

@Composable
fun ColorBox(modifier: Modifier = Modifier){
    val texti =  mutableListOf<String>(
        "The heads on Easter Island have bodies.",
        "The moon has moonquakes.",
        "There's no such thing as pear cider.",
        "Pineapple works as a natural meat tenderizer.",
        "Humans are the only animals that blush.",
        "The hottest spot on the planet is in Libya.",
        "Your nostrils work one at a time.",
        "A chef's toque contains 100 folds",
        "Rabbits can't puke.",
        "The human body literally glows.",
        "Copper door knobs are self-disinfecting.",
        "Cotton candy was invented by a dentist.",
        "Fingernails don't grow after you die.",
        "Chewing gum boosts concentration.",
        "Superman didn't always fly.",
        "The first computer was invented in the 1940s.",
        "Space smells like seared steak.",
        "The unicorn is the national animal of Scotland.",
        "Bees sometimes sting other bees.",
        "Kids ask 300 questions a day.",
        "The healthiest place in the world is in Panama.",
    )


    var color by remember {
        mutableStateOf(Color.Red)
    }

    var phrase by remember {
        mutableStateOf(texti[0])

    }

    Box(
        modifier = modifier
            .fillMaxSize()
            .background(color)
            .clickable {
                color = Color(
                    Random.nextFloat(),
                    Random.nextFloat(),
                    Random.nextFloat(),
                    1f

                )

                phrase = texti[Random.nextInt(0 until texti.size)]
            },
        contentAlignment = Alignment.Center

    )



    {
        Text(text = phrase, fontSize = 19.sp, color = White,)


    }
    Image(
        painterResource(R.drawable.imagem),
        contentDescription = null,
        modifier = Modifier.requiredSize(400.dp)
            .height(110.dp)
            .fillMaxWidth()
            .padding(80.dp)

    )

}

