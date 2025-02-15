package com.example.first

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
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
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FirstTheme {
                Surface(color=MaterialTheme.colorScheme.background) { //눈에 보이는 부분?
                    Column ( // 그냥 Text 두개를 쓰면 글자가 겹치고, column row 사용해서 수직 또는 수평으로 글자 정렬
                        modifier = Modifier
                            .fillMaxSize() // 화면 채움
                            .background(color = Color.Blue)
                            .padding(16.dp), // padding 은 뭐지?
                        horizontalAlignment = Alignment.CenterHorizontally // 글자 정렬
                    ){
                        Text("Hello")
                        //Spacer(Modifier.width(16.dp)) 글자사이 스페이스
                        Text("World")
                    }
                }
            }
        }
    }
}
