package com.example.flutkit.home


import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.RadioButtonChecked
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavDestination.Companion.hierarchy
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import com.example.flutkit.Greeting
import com.example.flutkit.ui.theme.Green
import com.example.flutkit.utils.Constant

@Composable
fun NavHostContainer(navController: NavHostController, padding: PaddingValues) {
    NavHost(
        navController = navController,
        modifier = Modifier.padding(padding),
        startDestination = "home",
        builder = {
            composable("home") { Greeting() }
            composable("search") { Greeting() }
            composable("cart") { Greeting() }
            composable("profile") { Greeting() }
        })
}


@Composable
fun BottomNavigationBar(navController: NavHostController) {

    BottomNavigation(modifier = Modifier.padding(8.dp,0.dp,8.dp,8.dp).clip(RoundedCornerShape(10.dp)) ,backgroundColor = Color.White) {
        val navBackStackEntry by navController.currentBackStackEntryAsState()
        val currentRoute = navBackStackEntry?.destination?.route


        Constant.ModelList.forEach { navItems ->
            val selected =
                navBackStackEntry?.destination?.hierarchy?.any { it.route == navItems.route } == true

            val contentColor = if (selected) Green else Color.Black
            BottomNavigationItem(
                selected = currentRoute == navItems.route,
                onClick = { navController.navigate(navItems.route) },
                label = { Text(text = navItems.label, color = contentColor) },
                icon = {
                    Icon(
                        imageVector = if (selected) Icons.Filled.RadioButtonChecked else navItems.icon,
                        contentDescription = navItems.label,
                        tint = contentColor
                    )
                },
                alwaysShowLabel = false
            )
        }
    }
}