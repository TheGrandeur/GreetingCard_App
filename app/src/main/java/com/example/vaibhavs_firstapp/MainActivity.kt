package com.example.vaibhavs_firstapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.foundation.Image
import com.example.vaibhavs_firstapp.ui.theme.Vaibhavs_FirstAppTheme
import androidx.compose.foundation.layout.Box
import androidx.compose.ui.layout.ContentScale

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            Vaibhavs_FirstAppTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    GreetingImage(message = "Happy Birthday Hardik Pandya!", from = " - from Natasha❤\uFE0F")
                }
            }
        }
    }
}

@Composable
fun GreetingText(message: String, from: String, modifier: Modifier = Modifier) {
    Column(verticalArrangement = Arrangement.Center,
        modifier = modifier.padding(8.dp)) {
        Text(
            text = message,
            fontSize = 90.sp,
            lineHeight = 100.sp,
            textAlign = TextAlign.Center

        )
        Text(
            text = from,
            fontSize = 36.sp,
            modifier = Modifier
                .padding(16.dp)
                .align(alignment = Alignment.CenterHorizontally),

        )
    }
}

@Preview(showBackground = true)
@Composable
fun BirthdayCardPreview() {
    Vaibhavs_FirstAppTheme {
        GreetingImage(
            message = "Happy Birthday Hardik Pandya!",
            from = "- from Natasha❤\uFE0F"
        )
    }
}
@Composable
fun GreetingImage(message: String, from: String, modifier: Modifier = Modifier ){
    val image = painterResource(R.drawable.androidparty)
    Box(modifier){
        Image(
            painter = image,
            contentDescription = null,
            contentScale = ContentScale.Crop,
            alpha = 0.8F,


        )
        GreetingText(
            message = message,
            from = from,
            modifier = modifier.fillMaxSize().padding(8.dp)
        )
    }
}