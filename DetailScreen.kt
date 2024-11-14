package com.example.portfolioapp.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.portfolioapp.ui.data.itemList

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DetailScreen(itemId: String, navController: NavController) {
    val item = itemList.find { it.id == itemId }

    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text(text = item?.name ?: "Detail") },
                navigationIcon = {
                    IconButton(onClick = { navController.popBackStack() }) {
                        Icon(Icons.Default.ArrowBack, contentDescription = "Back")
                    }
                }
            )
        }
    ) { padding ->
        Column(modifier = Modifier.padding(padding).padding(16.dp)) {
            item?.let {
                Text(text = "Name: ${it.name}", style = MaterialTheme.typography.headlineMedium)
                Spacer(modifier = Modifier.height(8.dp))
                Text(
                    text = "Description: ${it.description}",
                    style = MaterialTheme.typography.bodyLarge
                )
            }
        }
        }
}
@Preview(showBackground = true)
@Composable
fun DetailScreenPreview() {
    DetailScreen(
        itemId = "sample_id", // Ganti dengan ID contoh
        navController = rememberNavController()
        )
}
