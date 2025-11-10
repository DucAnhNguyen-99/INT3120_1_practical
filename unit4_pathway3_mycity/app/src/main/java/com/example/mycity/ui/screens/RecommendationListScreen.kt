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
import com.example.mycity.data.DataSource

@Composable
fun RecommendationListScreen(category: String, onPlaceClick: (Int) -> Unit) {
    val places = DataSource.places.filter { it.category == category }

    LazyColumn(modifier = Modifier.padding(16.dp)) {
        items(places) { place ->
            Text(
                text = place.name,
                style = MaterialTheme.typography.titleMedium,
                modifier = Modifier
                    .fillMaxWidth()
                    .clickable { onPlaceClick(place.id) }
                    .padding(16.dp)
            )
        }
    }
}
