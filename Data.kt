package com.example.portfolioapp.ui.data

data class Item(val id: String, val name: String, val description: String)

val itemList = listOf(
    Item("1", "Item 1", "Description for Item 1"),
    Item("2", "Item 2", "Description for Item 2"),
    Item("3", "Item 3", "Description for Item 3")
)