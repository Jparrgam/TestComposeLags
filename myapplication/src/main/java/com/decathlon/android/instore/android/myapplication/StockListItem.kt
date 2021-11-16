package com.decathlon.android.instore.android.myapplication

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun StockListItem(
    name : String?,
    lifetime : String,
    step7Percent : String,
    step7Value: String,
    step8Percent : String,
    step8Value: String
) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .fillMaxWidth()
            .height(60.dp)
    ) {

        Text(
            text = name ?: "",
            fontSize = 14.sp,
            fontWeight = FontWeight.Bold,
            maxLines = 2,
            overflow = TextOverflow.Ellipsis,
            modifier = Modifier
                .padding(start = 4.dp, end = 4.dp)
                .weight(DashBoardColumnWeights.COLUMN_1)
        )

        StockSection(
            modifier = Modifier.weight(DashBoardColumnWeights.COLUMN_2)
        ) {
            StockSectionText(
                text = lifetime
            )
        }

        Box(modifier = Modifier
            .width(1.dp)
            .fillMaxHeight()
            .background(Color.Gray))

        StockSection(
            modifier = Modifier.weight(DashBoardColumnWeights.COLUMN_3)
        ) {
            StockSectionText(
                text = step7Percent,
                modifier = Modifier.weight(0.5f)
            )
            StockSectionText(
                text = step7Value,
                modifier = Modifier.weight(0.5f)
            )
        }

        Box(modifier = Modifier
            .width(1.dp)
            .fillMaxHeight()
            .background(Color.Gray))

        StockSection(
            modifier = Modifier.weight(DashBoardColumnWeights.COLUMN_4)
        ) {
            StockSectionText(
                text = step8Percent,
                modifier = Modifier.weight(0.5f)
            )
            StockSectionText(
                text = step8Value,
                modifier = Modifier.weight(0.5f)
            )
        }
    }
}

@Composable
fun StockSection(
    modifier: Modifier = Modifier,
    content: @Composable () -> Unit
) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = modifier
            .fillMaxWidth()
            .fillMaxHeight()
    ) {
        content()
    }
}

@Composable
fun StockSectionText(text: String, modifier: Modifier = Modifier) {
    Text(
        text = text,
        textAlign = TextAlign.Center,
        fontSize = 15.sp,
        modifier = modifier
            .fillMaxWidth()
            .padding(top = 18.dp, bottom = 18.dp)
    )
}

@Preview
@Composable
fun StockListItemPreview() {
    StockListItem(
        name = "Running / Running / Running / Running",
        lifetime = "20",
        step7Percent = "30",
        step7Value = "10000",
        step8Percent = "30",
        step8Value = "10000",
    )
}


object DashBoardColumnWeights {
    const val COLUMN_1 = 0.2f
    const val COLUMN_2 = 0.2f
    const val COLUMN_3 = 0.3f
    const val COLUMN_4 = 0.3f
}