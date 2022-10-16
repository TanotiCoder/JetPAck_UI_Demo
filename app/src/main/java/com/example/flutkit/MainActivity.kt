package com.example.flutkit

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.rememberNavController
import com.example.flutkit.home.*
import com.example.flutkit.ui.theme.FlutKitTheme

class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FlutKitTheme {
                // A surface container using the 'background' color from the theme
                val navController = rememberNavController()
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {

                    Scaffold(bottomBar = {
                        BottomNavigationBar(navController = navController)
                    },
                        content = { padding ->
                            NavHostContainer(navController = navController, padding = padding)
                        }
                    )
                    //Greeting()
                }
            }
        }
    }
}

@Composable
fun Greeting() {
    val scrollState = rememberScrollState()
    Column(
        modifier = Modifier
            .fillMaxWidth(1f)
            .verticalScroll(scrollState)
    ) {
        Intro()
        OfferCard()
        CategoryCard()
        BestsellingLazy()
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    FlutKitTheme {
        Greeting()
    }
}