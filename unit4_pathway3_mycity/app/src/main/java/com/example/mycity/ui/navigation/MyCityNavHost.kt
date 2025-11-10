package com.example.mycity.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.mycity.ui.screens.*

@Composable
fun MyCityNavHost() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "categories") {
        composable("categories") {
            CategoryListScreen(onCategoryClick = { category ->
                navController.navigate("recommendations/$category")
            })
        }

        composable(
            route = "recommendations/{category}",
            arguments = listOf(navArgument("category") { type = NavType.StringType })
        ) { backStackEntry ->
            val category = backStackEntry.arguments?.getString("category") ?: ""
            RecommendationListScreen(category, onPlaceClick = { id ->
                navController.navigate("details/$id")
            })
        }

        composable(
            route = "details/{placeId}",
            arguments = listOf(navArgument("placeId") { type = NavType.IntType })
        ) { backStackEntry ->
            val id = backStackEntry.arguments?.getInt("placeId") ?: 0
            PlaceDetailScreen(placeId = id)
        }
    }
}
