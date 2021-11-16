package com.decathlon.android.instore.android.testcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.ui.Modifier
import com.decathlon.android.instore.android.myapplication.components.StockListItem
import com.decathlon.android.instore.android.myapplication.theme.TestComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TestComposeTheme {

               // Demo_Table()
                val listState = rememberLazyListState()
                val list = arrayListOf<String>()
                for (i in 0 until 50) {
                    list.add("$i")
                }

                LazyColumn(
                    state = listState,
                    modifier = Modifier.fillMaxWidth()
                ) {
                    items(list) { item ->
                        StockListItem(
                            name = "Running / Running / Running / Running",
                            lifetime = item,
                            step7Percent = "30",
                            step7Value = "10000",
                            step8Percent = "30",
                            step8Value = "10000",
                        )
                    }

                }
            }
        }
    }
}
