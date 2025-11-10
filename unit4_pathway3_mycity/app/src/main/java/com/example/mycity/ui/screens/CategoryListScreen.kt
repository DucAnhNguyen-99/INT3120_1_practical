package com.example.mycity.ui.screens

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun CategoryListScreen(onCategoryClick: (String) -> Unit) {
    val categories = listOf("Cà phê", "Nhà hàng", "Công viên", "Mua sắm", "Giải trí")

    LazyColumn(modifier = Modifier.padding(16.dp)) {
        items(categories) { category ->
            Text(
                text = category,
                style = MaterialTheme.typography.titleMedium,
                modifier = Modifier
                    .fillMaxWidth()
                    .clickable { onCategoryClick(category) }
                    .padding(16.dp)
            )
        }
    }
}
