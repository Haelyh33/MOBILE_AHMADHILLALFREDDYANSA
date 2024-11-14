package com.example.portfolioapp.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.portfolioapp.ui.data.itemList

@Composable
fun Screen2(navController: NavController) {
    Column(modifier = Modifier
        .fillMaxSize()
        .padding(16.dp)) {
        Text(
            text = "Lazy Grid Example",
            style = MaterialTheme.typography.headlineMedium
        )

        LazyVerticalGrid(
            columns = GridCells.Fixed(2),
            modifier = Modifier.fillMaxSize().padding(top = 16.dp)
        ) {
            items(itemList) { item ->
                ListItem(item = item, navController = navController)
            }
        }
        }
}
@Preview(showBackground = true)
@Composable
fun Screen2Preview() {
    Screen2(navController = rememberNavController())
}
