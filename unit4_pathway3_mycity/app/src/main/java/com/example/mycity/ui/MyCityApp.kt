package com.example.mycity.ui

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.mycity.ui.navigation.MyCityNavHost

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MyCityApp() {
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text(text = "My City") }
            )
        }
    ) { innerPadding ->
        Box(modifier = Modifier.padding(innerPadding)) {
            MyCityNavHost()
        }
    }
}
