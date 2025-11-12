package com.example.bookshelf

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import com.example.bookshelf.ui.BookshelfScreen
import com.example.bookshelf.ui.theme.BookshelfTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BookshelfTheme {
                Surface(color = MaterialTheme.colorScheme.background) {
                    BookshelfApp()
                }
            }
        }
    }
}

@Composable
fun BookshelfApp() {
    BookshelfScreen()
}
