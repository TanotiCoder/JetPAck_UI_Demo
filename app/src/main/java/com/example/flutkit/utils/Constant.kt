package com.example.flutkit.utils

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.ShoppingCart
import com.example.flutkit.model.NavModel

object Constant {
    val ModelList = listOf(
        NavModel(Icons.Filled.Home, "Home", "home"),
        NavModel(Icons.Filled.Search, "Search", "search"),
        NavModel(Icons.Filled.ShoppingCart, "Cart", "cart"),
        NavModel(Icons.Filled.Person, "Profile", "profile")
    )
}