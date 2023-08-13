package com.roshanadke.newcomposenavigation.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.roshanadke.newcomposenavigation.LOGIN_GRAPH_ROUTE
import com.roshanadke.newcomposenavigation.HOME_GRAPH_ROUTE
import com.roshanadke.newcomposenavigation.ROOT_GRAPH_ROUTE
import com.roshanadke.newcomposenavigation.screens.DetailScreen
import com.roshanadke.newcomposenavigation.screens.HomeScreen
import com.roshanadke.newcomposenavigation.screens.Screen


@Composable
fun Navigation(navController: NavHostController) {

    NavHost(
        navController = navController,
        startDestination = LOGIN_GRAPH_ROUTE,
        route = ROOT_GRAPH_ROUTE
    ) {

        AuthNavigation(navController = navController)

        HomeNavigation(navController = navController)
    }

}