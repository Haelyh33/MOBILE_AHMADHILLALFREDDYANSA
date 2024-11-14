package com.example.portfolioapp.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.portfolioapp.ui.data.itemList

@Composable
fun DetailScreen(itemId: String, navController: NavController) {
    val item = itemList.find { it.id == itemId }

    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text(text = item?.name ?: "Detail") },
                navigationIcon = {
                    IconButton(onClick = { navController.popBackStack() }) {
                        Icon(Icon.Filled.ArrowBack, contentDescription = "Back")
                    }
                }
            )
        }
    ) {
        Column(modifier = Modifier.padding(16.dp)) {
            item?.let {
                Text(text = "Name: ${it.name}", style = MaterialTheme.typography.headlineMedium)
                Spacer(modifier = Modifier.height(8.dp))
                Text(text = "Description: ${it.description}", style = MaterialTheme.typography.bodyLarge)
                // Tambahkan gambar atau detail lainnya di sini
            }
        }
    }
}