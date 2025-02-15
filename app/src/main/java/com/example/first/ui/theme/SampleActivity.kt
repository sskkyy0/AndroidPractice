package com.example.first.ui.theme

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.rememberScrollableState
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

class SampleActivity : ComponentActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent{
            val scrollState= rememberScrollState() // ???

            LazyColumn(
                modifier = Modifier.background(color = Color.Green)
                    .fillMaxWidth(),
//                    .verticalScroll(scrollState) // 스크롤 뷰
                contentPadding = PaddingValues(16.dp),
                verticalArrangement = Arrangement.spacedBy(8.dp)
            ) {
//                for (i in 1..50)
//                    Text("글씨$i")
                item {
                    Text("Header")
                }

                items(50){ index ->
                    Text("글씨 $index")
                }

                item {
                    Text("Footer")
                }
            }
        }
    }
}