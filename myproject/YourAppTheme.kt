package com.example.myproject

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable

@Composable
fun YourAppTheme(content: @Composable () -> Unit) {
    MaterialTheme(
        // colors, typography, shapes...
        content = content
    )
}
