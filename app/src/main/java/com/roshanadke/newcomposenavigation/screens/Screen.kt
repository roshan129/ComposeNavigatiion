package com.roshanadke.newcomposenavigation.screens

sealed class Screen(val route: String) {

    object HomeScreen: Screen("Home")
    object DetailScreen: Screen("Details")
    object LoginScreen: Screen("Login")
    object ChangePassword: Screen("ChangePassword")

    fun withArgs(vararg args: String): String {

        return buildString {
            append(route)
            args.forEach { arg ->
                append("/$arg")
            }
        }

    }

}
