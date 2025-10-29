package com.example.businesscard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.businesscard.ui.theme.BusinessCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BusinessCardTheme {
                Surface(modifier = Modifier.fillMaxSize()) {
                    BusinessCardApp()
                }
            }
        }
    }
}

@Composable
fun BusinessCardApp() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFDFF5E1)), // màu nền xanh pastel
        contentAlignment = Alignment.Center
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
            modifier = Modifier.padding(24.dp)
        ) {
            // Logo giữa màn hình
            Image(
                painter = painterResource(id = R.drawable.logo),
                contentDescription = "Logo",
                modifier = Modifier
                    .size(100.dp)
                    .padding(bottom = 16.dp)
            )

            // Tên
            Text(
                text = stringResource(R.string.name),
                fontSize = 28.sp,
                fontWeight = FontWeight.Bold,
                color = Color(0xFF1B4332)
            )

            // Chức danh
            Text(
                text = stringResource(R.string.title),
                fontSize = 16.sp,
                color = Color(0xFF2D6A4F),
                modifier = Modifier.padding(top = 8.dp, bottom = 32.dp)
            )

            // 3 dòng thông tin liên hệ (không icon)
            ContactInfo(
                phone = stringResource(R.string.phone),
                social = stringResource(R.string.social),
                email = stringResource(R.string.email)
            )
        }
    }
}

@Composable
fun ContactInfo(phone: String, social: String, email: String) {
    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        Text(
            text = phone,
            fontSize = 14.sp,
            textAlign = TextAlign.Center,
            color = Color(0xFF1B4332)
        )
        Text(
            text = social,
            fontSize = 14.sp,
            textAlign = TextAlign.Center,
            color = Color(0xFF1B4332)
        )
        Text(
            text = email,
            fontSize = 14.sp,
            textAlign = TextAlign.Center,
            color = Color(0xFF1B4332)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun BusinessCardPreview() {
    BusinessCardTheme {
        BusinessCardApp()
    }
}
