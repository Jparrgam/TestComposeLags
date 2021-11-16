package com.decathlon.android.instore.android.myapplication.components

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

internal object DashBoardColumnWeights {
    const val COLUMN_1 = 0.2f
    const val COLUMN_2 = 0.2f
    const val COLUMN_3 = 0.3f
    const val COLUMN_4 = 0.3f
}

@Composable
fun StockListItem(
    name: String?,
    lifetime: String,
    step7Percent: String,
    step7Value: String,
    step8Percent: String,
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
                .padding(horizontal = 4.dp)
                .weight(DashBoardColumnWeights.COLUMN_1)
        )

        StockSection(
            modifier = Modifier
                .fillMaxWidth()
                .weight(DashBoardColumnWeights.COLUMN_2)
        ) {
            StockText(text = lifetime)
        }

        Divider()

        StockSection(
            modifier = Modifier
                .fillMaxWidth()
                .weight(DashBoardColumnWeights.COLUMN_3)
        ) {
            StockText(text = step7Percent)
            StockText(text = step7Value)
        }

        Divider()

        StockSection(
            modifier = Modifier
                .fillMaxWidth()
                .weight(DashBoardColumnWeights.COLUMN_4)
        ) {
            StockText(text = step8Percent)
            StockText(text = step8Value)
        }
    }
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
