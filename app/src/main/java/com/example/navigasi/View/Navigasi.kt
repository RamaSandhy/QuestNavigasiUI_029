package com.example.navigasi.View

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController

enum class Navigasi {
    Formulirku,
    Detail
}
@Composable
fun DataApp(
    navController: NavHostController = rememberNavController()
) {
