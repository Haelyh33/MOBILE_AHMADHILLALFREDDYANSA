package com.example.portfolioapp.ui.screens

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.LazyVerticalGrid
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.portfolioapp.ui.data.itemList
import com.example.portfolioapp.ui.data.Item

@Composable
fun Screen1(navController: NavController) {
    Column(modifier = Modifier.fillMaxSize().padding(16.dp)) {
        Text(text = "Lazy Column Example", style = MaterialTheme.typography.headlineMedium)

        LazyColumn(modifier = Modifier.weight(1f)) {
            items(itemList) { item ->
                ListItem(item = item, navController = navController)
            }
        }

        Spacer(modifier = Modifier.height(16.dp))

        Text(text = "Lazy Row Example", style = MaterialTheme.typography.headlineMedium)

        LazyRow(modifier = Modifier.fillMaxWidth()) {
            items(itemList) { item ->
                ListItem(item = item, navController = navController)
            }
        }

        Spacer(modifier = Modifier.height(16.dp))

        Text(text = "Lazy Grid Example", style = MaterialTheme.typography.headlineMedium)

        LazyVerticalGrid(columns = GridCells.Fixed(2), modifier = Modifier.fillMaxSize().padding(top = 16.dp)) {
            items(itemList) { item ->
                ListItem(item = item, navController = navController)
            }
        }
    }
}

@Composable
fun ListItem(item: Item, navController: NavController) {
    Card(modifier = Modifier
        .fillMaxWidth()
        .padding(8.dp)
        .clickable {
            navController.navigate("detail/${item.id}")
        }) {
        Column(modifier = Modifier.padding(16.dp)) {
            Text(text = item.name, style = MaterialTheme.typography.bodyLarge)
            Spacer(modifier = Modifier.height(4.dp))
            Text(text = item.description, style = MaterialTheme.typography.bodySmall)
        }
    }
}