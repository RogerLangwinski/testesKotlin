package com.example.quadrantescomposable

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.quadrantescomposable.ui.theme.QuadrantesComposableTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            QuadrantesComposableTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    TelaQuadrantes(tituloText = getString(R.string.textComposable),
                        tituloRow = getString(R.string.rowComposable),
                        tituloImage = getString(R.string.imageComposable),
                        tituloColumn = getString(R.string.columnComposable),
                        descricaoText = getString(R.string.textComposableDescricao),
                        descricaoRow = getString(R.string.rowComposableDescricao),
                        descricaoImage = getString(R.string.imageComposableDescricao),
                        descricaoColumn = getString(R.string.columnComposableDescricao))
                }
            }
        }
    }
}

@Composable
fun TelaQuadrantes(
    tituloText: String,
    tituloRow: String,
    tituloImage: String,
    tituloColumn: String,
    descricaoText: String,
    descricaoRow: String,
    descricaoImage: String,
    descricaoColumn: String,
    modifier: Modifier = Modifier) {
    Row(
        modifier = Modifier.padding(16.dp)
            .fillMaxSize()
    ) {
        Column(
            modifier = Modifier.fillMaxSize()
                .padding(16.dp)
                .weight(1.0f),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = tituloText,
                modifier = modifier.background(color = Color.Green)
                    .padding(bottom = 16.dp)
                    .weight(1.0f)
                    .fillMaxSize(),
                fontWeight = FontWeight.Bold
            )
            Text(
                text = descricaoText,
                modifier = modifier.background(color = Color.Green)
                    .weight(1.0f),
                textAlign = TextAlign.Justify
            )

            Text(
                text = tituloRow,
                modifier = modifier.background(color = Color.Cyan)
                    .padding(bottom = 16.dp)
                    .weight(1.0f)
                .fillMaxSize(),
                fontWeight = FontWeight.Bold
            )
            Text(
                text = descricaoRow,
                modifier = modifier.background(color = Color.Cyan)
                    .weight(1.0f),
                textAlign = TextAlign.Justify
            )
        }
        Column(
            modifier = Modifier.fillMaxSize()
                .padding(16.dp)
                .weight(1.0f),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = tituloImage,
                modifier = modifier.background(color = Color.Yellow)
                    .padding(bottom = 16.dp)
                    .weight(1.0f),
                fontWeight = FontWeight.Bold
            )
            Text(
                text = descricaoImage,
                modifier = modifier.background(color = Color.Yellow)
                    .weight(1.0f),
                textAlign = TextAlign.Justify
            )
            Text(
                text = tituloColumn,
                modifier = modifier.background(color = Color.Gray)
                    .padding(bottom = 16.dp)
                    .weight(1.0f),
                fontWeight = FontWeight.Bold
            )
            Text(
                text = descricaoColumn,
                modifier = modifier.background(color = Color.Gray)
                    .weight(1.0f),
                textAlign = TextAlign.Justify
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    QuadrantesComposableTheme {
        TelaQuadrantes("Text composable",
            "Row composable",
            "Image composable",
            "Column composable",
            "Displays text and follows Material Design guidelines.",
            "A layout composable that places its children in a horizontal sequence.",
            "Creates a composable that lays out and draws a given Painter class object.",
            "A layout composable that places its children in a vertical sequence.")
    }
}