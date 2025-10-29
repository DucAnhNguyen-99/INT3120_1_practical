package com.example.artspace

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.artspace.ui.theme.ArtSpaceTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ArtSpaceTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    ArtSpaceApp()
                }
            }
        }
    }
}

// Data class chứa thông tin mỗi bức tranh
data class ArtWork(
    val imageRes: Int,
    val title: String,
    val artist: String,
    val year: String
)

@Composable
fun ArtSpaceApp() {
    // Danh sách 3 tác phẩm bạn có
    val artworks = listOf(
        ArtWork(R.drawable.starrynight, "Starry Night", "Vincent van Gogh", "1889"),
        ArtWork(R.drawable.thescream, "The Scream", "Edvard Munch", "1893"),
        ArtWork(R.drawable.girlwithapearlearring, "Girl with a Pearl Earring", "Johannes Vermeer", "1665")
    )

    var currentIndex by remember { mutableStateOf(0) }

    // Toàn bộ layout
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(24.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        // Hình ảnh
        Image(
            painter = painterResource(id = artworks[currentIndex].imageRes),
            contentDescription = artworks[currentIndex].title,
            modifier = Modifier
                .fillMaxWidth()
                .height(400.dp)
                .padding(8.dp)
        )

        Spacer(modifier = Modifier.height(16.dp))

        // Thông tin tác phẩm
        Text(
            text = artworks[currentIndex].title,
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold
        )
        Text(
            text = "${artworks[currentIndex].artist}, ${artworks[currentIndex].year}",
            fontSize = 18.sp
        )

        Spacer(modifier = Modifier.height(24.dp))

        // Hai nút điều hướng
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            Button(onClick = {
                currentIndex = if (currentIndex == 0) artworks.lastIndex else currentIndex - 1
            }) {
                Text(text = "Previous")
            }

            Button(onClick = {
                currentIndex = (currentIndex + 1) % artworks.size
            }) {
                Text(text = "Next")
            }
        }
    }
}
