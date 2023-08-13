package com.roshanadke.newcomposenavigation.navigation

import androidx.navigation.NavHostController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.roshanadke.newcomposenavigation.LOGIN_GRAPH_ROUTE
import com.roshanadke.newcomposenavigation.screens.ChangePasswordScreen
import com.roshanadke.newcomposenavigation.screens.LoginScreen
import com.roshanadke.newcomposenavigation.screens.Screen


fun NavGraphBuilder.AuthNavigation(
    navController: NavHostController
) {

    navigation(
        startDestination = Screen.LoginScreen.route,
        route = LOGIN_GRAPH_ROUTE
    ) {
        composable(route = Screen.LoginScreen.route) {
            LoginScreen(navController = navController)
        }
        composable(route = Screen.ChangePassword.route) {
            ChangePasswordScreen(navController = navController)
        }
    }

}
