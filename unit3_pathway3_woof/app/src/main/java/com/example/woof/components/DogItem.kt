package com.example.woof.components

import androidx.compose.animation.animateContentSize
import androidx.compose.animation.core.Spring
import androidx.compose.animation.core.spring
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.stringResource
import com.example.woof.R
import com.example.woof.data.Dog

@Composable
fun DogItem(dog: Dog, modifier: Modifier = Modifier) {
    var expanded by remember { mutableStateOf(false) }

    Card(
        modifier = modifier
            .fillMaxWidth()
            .clickable { expanded = !expanded }
    ) {
        Column(
            modifier = Modifier
                .animateContentSize(
                    animationSpec = spring(
                        dampingRatio = Spring.DampingRatioMediumBouncy,
                        stiffness = Spring.StiffnessLow
                    )
                )
                .padding(dimensionResource(R.dimen.padding_small))
        ) {
            Row(modifier = Modifier.fillMaxWidth()) {
                DogIcon(dogIcon = dog.imageResourceId)
                DogInformation(
                    dogName = dog.name,
                    dogAge = dog.age,
                    modifier = Modifier.weight(1f)
                )
                DogItemButton(expanded = expanded, onClick = { expanded = !expanded })
            }
            if (expanded) {
                Text(
                    text = stringResource(R.string.dog_description),
                    style = MaterialTheme.typography.bodyLarge,
                    modifier = Modifier.padding(dimensionResource(R.dimen.padding_small))
                )
            }
        }
    }
}
