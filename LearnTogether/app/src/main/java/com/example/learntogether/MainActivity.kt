package com.example.learntogether

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.learntogether.ui.theme.LearnTogetherTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LearnTogetherTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    ImagemCabecalho(texto1 = getString(R.string.texto1),
                        texto2 = getString(R.string.texto2),
                        texto3 = getString(R.string.texto3))
                }
            }
        }
    }
}

@Composable
fun ImagemCabecalho(texto1: String, texto2: String, texto3: String) {
    val imagem = painterResource(R.drawable.bg_compose_background)
    Column {
        Image(
            painter = imagem, contentDescription = null
        )
        TextosTutorial(texto1 = texto1, texto2 = texto2, texto3 = texto3)
    }
}

@Composable
fun TextosTutorial(texto1: String, texto2: String, texto3: String){
    Column {
        Text(
            text = texto1, fontSize = 24.sp, modifier = Modifier.padding(16.dp)
        )
        Text(
            text = texto2, modifier = Modifier.padding(start = 16.dp, end = 16.dp),
            textAlign = TextAlign.Justify
        )
        Text(
            text = texto3, modifier = Modifier.padding(16.dp), textAlign = TextAlign.Justify
        )

    }
}

@Preview(showBackground = true)
@Composable
fun Preview() {
    LearnTogetherTheme {
        ImagemCabecalho(texto1 = "Jetpack Compose tutorial", texto2 = "Jetpack Compose is a modern toolkit for building native Android UI.\n" +
                "Compose simplifies and accelerates UI development on Android with less code,\n" +
                "powerful tools, and intuitive Kotlin APIs.", texto3 = "In this tutorial, you build a simple UI component with\n" +
                "declarative functions. You call Compose functions to say what elements you want and\n" +
                "the Compose compiler does the rest. Compose is built around Composable functions.\n" +
                "These functions let you define your app's UI programmatically because they let you\n" +
                "describe how it should look and provide data dependencies, rather than focus on the\n" +
                "process of the UI's construction, such as initializing an element and then attaching\n" +
                "it to a parent. To create a Composable function, you add the @Composable annotation to\n" +
                "the function name.")
    }
}