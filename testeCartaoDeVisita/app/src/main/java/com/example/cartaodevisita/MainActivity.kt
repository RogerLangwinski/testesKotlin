package com.example.cartaodevisita

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Divider
import androidx.compose.material3.Icon
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.cartaodevisita.ui.theme.CartaoDeVisitaTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CartaoDeVisitaTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize()
                ) {
                    val name: String = getString(R.string.name)
                    val cargo: String = getString(R.string.cargo)
                    val telefone: String = getString(R.string.telefone)
                    val arroba: String = getString(R.string.arroba)
                    val email: String = getString(R.string.email)

                    CartaoDeVisita(name, cargo, telefone, arroba, email)
                }
            }
        }
    }
}

@Composable
fun CartaoDeVisita(name: String, cargo: String, telefone: String, arroba: String, email: String) {
    val androidIcone = painterResource(R.drawable.android_icone)
    val telefoneIcone = painterResource(R.drawable.telefone_icone)
    val compartilharIcone = painterResource(R.drawable.compartilhar_icone)
    val emailIcone = painterResource(R.drawable.email_icone)

    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .background(CustomColors.backGroundColor)
            .fillMaxSize()
    ) {
        Image(
            painter = androidIcone, contentDescription = null,
            modifier = Modifier
                .size(120.dp)
        )
        Text(
            text = name,
            fontSize = 45.sp,
            color = CustomColors.textoBrancoColor,
            fontWeight = FontWeight.Light
        )
        Text(
            text = cargo,
            fontSize = 22.sp,
            color = CustomColors.textoVerdeColor
        )
    }

    Row (modifier = Modifier.padding(top = 650.dp)
    ) {
        CriarLinha(texto = telefone, icone = telefoneIcone)
    }

    Row (modifier = Modifier.padding(top = 695.dp)
    ) {
        CriarLinha(texto = arroba, icone = compartilharIcone)
    }

    Row (modifier = Modifier.padding(top = 740.dp)
    ) {
        CriarLinha(texto = email, icone = emailIcone)
    }
}
@Composable
fun CriarLinha (texto: String, icone: Painter){
    Column (modifier = Modifier.height(35.dp)
    ) {
        Divider (
            color = Color.Gray,
            modifier = Modifier
                .height(2.dp)
                .fillMaxWidth()
        )
        Row (
            modifier = Modifier.padding(start = 50.dp, top = 8.dp)
        ) {
            Icon(
                painter = icone,
                tint = Color.Unspecified,
                contentDescription = null,
                modifier = Modifier.size(22.dp)
            )
            Text(
                text = texto,
                fontSize = 18.sp,
                color = CustomColors.textoBrancoColor,
                modifier = Modifier.padding(start = 10.dp)
            )
        }
    }
}

@Preview
@Composable
fun CartaoDeVisitaPreview() {
    CartaoDeVisita("Roger Langwinski", "Android Developer Extraordinaire",
        "+55 (54) 9 8121 8315", "@RogerDev", "langwinskiroger@gmail.com")
}