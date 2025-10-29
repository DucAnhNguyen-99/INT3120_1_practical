package com.example.lemonade.ui.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable

// 🎨 Tạo bộ màu chính cho app Lemonade
private val LemonadeColorScheme = lightColorScheme(
    primaryContainer = LightGreen,      // màu thanh top bar
    tertiaryContainer = YellowLight,    // màu nút chứa hình chanh
    background = White                  // nền tổng thể
)

// 🧩 Áp dụng bộ màu này vào toàn ứng dụng
@Composable
fun AppTheme(content: @Composable () -> Unit) {
    MaterialTheme(
        colorScheme = LemonadeColorScheme,
        typography = Typography,
        content = content
    )
}
