package com.example.a30daysapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import com.example.a30daysapp.data.loadTips
import com.example.a30daysapp.ui.theme.A30DaysAppTheme
import com.example.a30daysapp.components.TipList

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            A30DaysAppTheme {
                Surface(color = MaterialTheme.colorScheme.background) {
                    TipList(tips = loadTips())
                }
            }
        }
    }
}
