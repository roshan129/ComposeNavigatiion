package com.roshanadke.newcomposenavigation.navigation

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.roshanadke.newcomposenavigation.HOME_GRAPH_ROUTE
import com.roshanadke.newcomposenavigation.LOGIN_GRAPH_ROUTE
import com.roshanadke.newcomposenavigation.screens.ChangePasswordScreen
import com.roshanadke.newcomposenavigation.screens.DetailScreen
import com.roshanadke.newcomposenavigation.screens.HomeScreen
import com.roshanadke.newcomposenavigation.screens.LoginScreen
import com.roshanadke.newcomposenavigation.screens.Screen


fun NavGraphBuilder.HomeNavigation(
    navController: NavHostController
) {

    navigation(
        startDestination = Screen.HomeScreen.route,
        route = HOME_GRAPH_ROUTE
    ) {
        composable(route = Screen.HomeScreen.route) {
            HomeScreen(navController = navController)
        }
        composable(route = Screen.DetailScreen.route) {
            DetailScreen(navController = navController)
        }
    }

}
