package com.example.flutkit.home

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.flutkit.R
import com.example.flutkit.ui.theme.FlutKitTheme
import com.example.flutkit.ui.theme.Green
import com.example.flutkit.ui.theme.liteBalck
import com.example.flutkit.ui.theme.liteGreen

@Composable
fun OfferCard(color: Color = liteGreen) {
        Card(
            modifier = Modifier
                .clip(RoundedCornerShape(10.dp))
                .fillMaxWidth(1f)
                .padding(16.dp)
        ) {
            Column(
                modifier = Modifier.background(color = color)
                    .fillMaxWidth(1f)
                    .padding(
                        vertical = 32.dp,
                        horizontal = 20.dp
                    )

            ) {
                Text(
                    text = stringResource(id = R.string.scheme),
                    style = MaterialTheme.typography.labelLarge,
                    color = Green,
                    lineHeight = 20.sp
                )
                Spacer(modifier = Modifier.padding(vertical = 4.dp))
                Text(
                    text = stringResource(id = R.string.scheme_time),
                    style = MaterialTheme.typography.bodySmall,
                    color = liteBalck,
                )
            }
        }
    }
@Preview
@Composable
fun OfferPreview() {
    FlutKitTheme {
        OfferCard()
    }
}