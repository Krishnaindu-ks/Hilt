package com.ks.fieldinjection

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember


import androidx.compose.ui.tooling.preview.Preview

import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint

class MainActivity : ComponentActivity() {
    @Inject
    lateinit var greeting:String
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApp {
                GreetingView(greeting)
            }
        }
    }
}
@Composable
fun MyApp(content:@Composable () -> Unit){
    MaterialTheme {
        Column{
            content()
        }

    }
}
@Composable
fun GreetingView(greeting: String) {
    val greetingState = remember { mutableStateOf(greeting) }
    Text(text = greetingState.value)
}
@Preview
@Composable
fun PreviewGreetingView() {
    GreetingView("Hai")
}
