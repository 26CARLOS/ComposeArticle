package com.example.composearticle

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composearticle.ui.theme.ComposeArticleTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeArticleTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                   ArticleImage(stringResource(R.string.ArticleTitle), stringResource(R.string.paragraph1), stringResource(R.string.paragraph2))
                }
            }
        }
    }
}

@Composable
fun ArticleText(title: String,paragrapgh1: String, paragraph2: String, modifier: Modifier = Modifier) {
    Column() {

        Text(
            text = "$title",
            modifier = modifier
                .padding(16.dp,16.dp,16.dp,16.dp),
            fontSize = 24.sp,
        )
        Text(
            text = "$paragrapgh1",
            modifier = modifier.padding(16.dp,16.dp,16.dp,16.dp),
        )
        Text(
            text = "$paragraph2",
            modifier = modifier.padding(16.dp,16.dp,16.dp,16.dp),
        )
    }
}

@Composable
fun ArticleImage(title: String,paragrapgh1: String, paragraph2: String,modifier: Modifier = Modifier)
{
    val image = painterResource(R.drawable.bg_compose_background)
    Box(){
    Column() {
        Image(painter = image, contentDescription = null)
        ArticleText(title = title , paragrapgh1 = paragrapgh1 , paragraph2 = paragraph2)
        
    }}
}

@Preview(
    showBackground = true,
    showSystemUi = true,
            )
@Composable
fun GreetingPreview() {
    ComposeArticleTheme {
        ArticleImage(stringResource(R.string.ArticleTitle), stringResource(R.string.paragraph1),stringResource(R.string.paragraph2))
    }
}