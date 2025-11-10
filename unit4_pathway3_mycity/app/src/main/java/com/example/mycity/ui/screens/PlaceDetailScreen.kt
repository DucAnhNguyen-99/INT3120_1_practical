package com.example.mycity.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.mycity.data.DataSource

@Composable
fun PlaceDetailScreen(placeId: Int) {
    val place = DataSource.places.first { it.id == placeId }

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.padding(16.dp)
    ) {
        Image(
            painter = painterResource(place.imageRes),
            contentDescription = place.name,
            modifier = Modifier
                .size(250.dp)
                .clip(RoundedCornerShape(12.dp))
        )

        Spacer(Modifier.height(16.dp))
        Text(place.name, style = MaterialTheme.typography.headlineSmall)
        Spacer(Modifier.height(8.dp))
        Text(place.description, style = MaterialTheme.typography.bodyMedium)
    }
}
