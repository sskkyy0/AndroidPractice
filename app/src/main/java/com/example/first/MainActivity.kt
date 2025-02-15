package com.example.first

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.first.ui.theme.FirstTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) { // 앱이 시작되는 지점 main함수역할
        super.onCreate(savedInstanceState)
        setContent {
            FirstTheme {
                Surface(color = MaterialTheme.colorScheme.background) { //눈에 보이는 부분?
                    Greeting("Android") // composable 들만 들어올 수 있는 부분
                }
            }
        }
    }
}


@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}
// composable이 블록으로는 안되고 함수 쓸때마다 붙여야 하는건가??

// 미리보기로 볼 수 있는 부분
@Preview(showBackground = true) // 실시간으로 변경 확인 가능
@Composable
fun DefaultPreview() {
    FirstTheme {
        Greeting("Android")
    }
}

@Preview(showBackground = true) // 실시간으로 변경 확인 가능
@Composable
fun DefaultPreview2() {
    FirstTheme {
        Greeting("김하늘")
    }
}

