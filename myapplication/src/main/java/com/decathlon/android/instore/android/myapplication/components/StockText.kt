package com.decathlon.android.instore.android.myapplication.components

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.sp

@Composable
fun StockText(
    text: String,
    modifier: Modifier = Modifier,
    fontSize: TextUnit = 15.sp,
) {
    Text(
        text = text,
        fontSize = fontSize,
        modifier = modifier
    )
}

@Preview
@Composable
fun StockTextPreview() {
    StockText("23")
}
