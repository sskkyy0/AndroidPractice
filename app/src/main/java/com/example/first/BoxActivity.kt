package com.example.first

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

class BoxActivity : ComponentActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent{
            Box(modifier = Modifier.background(color = Color.Green) // 안에 있는 애들끼리 다 겹침 framelayout 같은놈
                .fillMaxWidth() // 양옆으로는 다 채우고
                .height(200.dp) // 높이는 200으로만
            ){
                Text("Hello")
                Box(
                    modifier = Modifier.fillMaxSize()
                        .padding(50.dp) // 좌우앞뒤 공백?
                    ,
                    contentAlignment = Alignment.BottomEnd
                ){
                    Text("1234")
                }
            }
        }
    }
}
// 화면 구성에 박스, column row 사용
// 박스 안에 박스 가능