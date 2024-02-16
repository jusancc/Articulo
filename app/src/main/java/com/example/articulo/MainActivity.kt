package com.example.articulo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.semantics.Role.Companion.Image
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.articulo.ui.theme.ArticuloTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ArticuloTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Textos()
                }
            }
        }
    }
}

@Composable
fun Greeting(title: String,
             shortDescription: String,
             longDescription: String,
             imagePainter: Painter,
             modifier: Modifier = Modifier) {
    Image(painter = imagePainter, contentDescription = null, alignment = Alignment.BottomCenter)
    Text(text = title,
        modifier = Modifier.padding(16.dp),
        fontSize = 24.sp)
    Text(
        text = shortDescription,
        modifier = Modifier.padding(start = 16.dp, end = 16.dp),
        textAlign = TextAlign.Justify
    )
    Text(
        text = longDescription,
        modifier = Modifier.padding(16.dp),
        textAlign = TextAlign.Justify
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ArticuloTheme {
        Textos()
    }
}

@Composable
fun Textos(){
    Greeting(title = stringResource(R.string.title_jetpack_compose_tutorial),
        shortDescription = stringResource(R.string.compose_short_desc),
        longDescription = stringResource(R.string.compose_long_desc),
        imagePainter = painterResource(R.drawable.bg_compose_background))
}