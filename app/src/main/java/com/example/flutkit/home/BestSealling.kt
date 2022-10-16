package com.example.flutkit.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.flutkit.R
import com.example.flutkit.model.BestSelling
import com.example.flutkit.ui.theme.*

@Composable
fun BestsellingLazy() {
    val BestItem = mutableListOf<BestSelling>()

    BestItem.add(
        BestSelling(R.drawable.orange, R.string.orange, R.string.description, R.string.price)
    )
    BestItem.add(
        BestSelling(
            R.drawable.broccoli,
            R.string.orange,
            R.string.description,
            R.string.price
        )
    )
    BestItem.add(
        BestSelling(
            R.drawable.cabbage,
            R.string.orange,
            R.string.description,
            R.string.price
        )
    )
    BestItem.add(
        BestSelling(
            R.drawable.cheese,
            R.string.orange,
            R.string.description,
            R.string.price
        )
    )
    BestItem.add(
        BestSelling(
            R.drawable.grapes,
            R.string.orange,
            R.string.description,
            R.string.price
        )
    )
    BestItem.add(
        BestSelling(
            R.drawable.strawberry,
            R.string.orange,
            R.string.description,
            R.string.price
        )
    )
    BestItem.add(
        BestSelling(
            R.drawable.vegetable,
            R.string.orange,
            R.string.description,
            R.string.price
        )
    )
    BestItem.add(
        BestSelling(
            R.drawable.broccoli,
            R.string.orange,
            R.string.description,
            R.string.price
        )
    )
    BestItem.add(
        BestSelling(
            R.drawable.orange,
            R.string.orange,
            R.string.description,
            R.string.price
        )
    )
    BestItem.add(
        BestSelling(
            R.drawable.orange,
            R.string.orange,
            R.string.description,
            R.string.price
        )
    )



    Column(modifier = Modifier.padding(16.dp)) {
        ChooseTitle(
            title = R.string.best_selling,
            seaAll = R.string.seeall,
            modifier = Modifier.padding(vertical = 12.dp)
        )
        Column(
            modifier = Modifier.fillMaxWidth(),
            verticalArrangement = Arrangement.spacedBy(10.dp)
        ) {
            BestItem.forEach { model ->
                BestSellingCard(bestSelling = model)
            }
        }
    }
}

@Composable
fun BestSellingCard(
    modifier: Modifier = Modifier, bestSelling: BestSelling
) {
    Row(
        modifier = modifier
            .background(BestSellingBackGround)
            .clip(RoundedCornerShape(20.dp))
            .padding(16.dp)
            .fillMaxWidth(1f)
        , Arrangement.SpaceBetween

    ) {
        Card(
            modifier = modifier
                .size(60.dp, 60.dp)
                .clip(
                    RoundedCornerShape(10.dp)
                )
        ) {
            Column(
                modifier = androidx.compose.ui.Modifier
                    .background(liteGreen)
                    .fillMaxSize()
                    .padding(top = 15.dp), horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Image(
                    painter = painterResource(id = bestSelling.img),
                    contentDescription = null,
                    contentScale = ContentScale.Crop,
                    alignment = Alignment.Center,
                    modifier = Modifier.size(50.dp)
                )
            }
        }

        Column(
            modifier = Modifier
                .padding(horizontal = 16.dp)
                .fillMaxWidth(0.75f)
        ) {
            Text(
                text = stringResource(id = bestSelling.title),
                style = MaterialTheme.typography.labelLarge,
                fontWeight = FontWeight.W300,
                fontSize = 14.sp,
                maxLines = 1
            )
            Text(
                text = stringResource(id = bestSelling.description),
                style = MaterialTheme.typography.bodySmall,
                fontWeight = FontWeight.W300,
                fontSize = 10.sp,
                maxLines = 2,
                color = liteBalck
            )

            Text(
                text = stringResource(id = bestSelling.price),
                style = MaterialTheme.typography.labelLarge,
                fontWeight = FontWeight.W500,
                fontSize = 14.sp,
                maxLines = 1
            )
        }

        Icon(
            Icons.Filled.FavoriteBorder,
            contentDescription = "Notification",
            modifier = Modifier.size(30.dp),
            tint = IconOn
        )
    }
}

@Preview
@Composable
fun BestSellingCardPreviev() {
    Surface() {
        FlutKitTheme {
            BestsellingLazy()
        }
    }
}