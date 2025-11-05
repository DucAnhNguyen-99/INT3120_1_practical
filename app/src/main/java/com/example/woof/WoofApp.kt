package com.example.woof

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.dimensionResource
import com.example.woof.data.dogs
import com.example.woof.R
import com.example.woof.components.WoofTopAppBar
import com.example.woof.components.DogItem


@Composable
fun WoofApp() {
    Scaffold(
        topBar = { WoofTopAppBar() }
    ) { it ->
        LazyColumn(contentPadding = it) {
            items(dogs) { dog ->
                DogItem(
                    dog = dog,
                    modifier = Modifier.padding(dimensionResource(R.dimen.padding_small))
                )
            }
        }
    }
}
