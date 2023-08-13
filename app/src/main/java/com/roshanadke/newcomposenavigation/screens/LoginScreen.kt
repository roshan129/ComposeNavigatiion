package com.roshanadke.newcomposenavigation.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.roshanadke.newcomposenavigation.LOGIN_GRAPH_ROUTE
import com.roshanadke.newcomposenavigation.HOME_GRAPH_ROUTE

@Composable
fun LoginScreen(navController: NavController) {

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier.fillMaxSize()
    ) {
        Text(text = "Login Screen")
        Spacer(modifier = Modifier.height(40.dp))
        Button(onClick = {
            navController.navigate(route = Screen.ChangePassword.route)
        }) {
            Text(text = "Change Password")
        }
        Spacer(modifier = Modifier.height(80.dp))
        Button(onClick = {
            navController.navigate(route = HOME_GRAPH_ROUTE) {
                popUpTo(route = LOGIN_GRAPH_ROUTE) {
                    inclusive = true
                }
            }
        }) {
            Text(text = "Login")
        }
    }

}