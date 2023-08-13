package com.roshanadke.newcomposenavigation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.compose.rememberNavController
import com.roshanadke.newcomposenavigation.navigation.Navigation
import com.roshanadke.newcomposenavigation.ui.theme.NewComposeNavigationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            NewComposeNavigationTheme {

                val navController = rememberNavController()
                Navigation(navController)
            }
        }
    }
}
