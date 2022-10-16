package com.example.flutkit.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.flutkit.R
import com.example.flutkit.model.CategoriesModel
import com.example.flutkit.ui.theme.*

@Composable
fun CategoryCard() {
    val ItemList = mutableListOf<CategoriesModel>()
    ItemList.add(CategoriesModel(R.string.ca1, R.drawable.bread, cat1))
    ItemList.add(CategoriesModel(R.string.ca2, R.drawable.strawberry, cat2))
    ItemList.add(CategoriesModel(R.string.ca3, R.drawable.broccoli, cat3))
    ItemList.add(CategoriesModel(R.string.ca3, R.drawable.cheese, cat4))
    ItemList.add(CategoriesModel(R.string.ca1, R.drawable.bread, cat1))
    ItemList.add(CategoriesModel(R.string.ca1, R.drawable.bread, cat1))
    ItemList.add(CategoriesModel(R.string.ca2, R.drawable.strawberry, cat2))
    ItemList.add(CategoriesModel(R.string.ca3, R.drawable.broccoli, cat3))
    ItemList.add(CategoriesModel(R.string.ca3, R.drawable.cheese, cat4))
    ItemList.add(CategoriesModel(R.string.ca1, R.drawable.bread, cat1))
    ItemList.add(CategoriesModel(R.string.ca1, R.drawable.bread, cat1))
    ItemList.add(CategoriesModel(R.string.ca2, R.drawable.strawberry, cat2))
    ItemList.add(CategoriesModel(R.string.ca3, R.drawable.broccoli, cat3))
    ItemList.add(CategoriesModel(R.string.ca3, R.drawable.cheese, cat4))
    ItemList.add(CategoriesModel(R.string.ca1, R.drawable.bread, cat1))
    //val rememberCategory by remember { mutableStateOf(0) }
    Column(modifier = Modifier.padding(horizontal = 16.dp)) {
        ChooseTitle(title = R.string.categories, seaAll = R.string.seeall)
        LazyRow(
            modifier = Modifier
                .padding(vertical = 16.dp)
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(10.dp)
        ) {
            items(ItemList) { model ->
                Card_Categories(itemList = model)
            }

        }
    }
}

@Composable
fun Card_Categories(modifier: Modifier = Modifier, itemList: CategoriesModel) {
    Card(modifier = modifier.size(60.dp, 60.dp)) {
        Column(
            modifier = Modifier
                .background(itemList.color)
                .fillMaxSize()
                .padding(top = 15.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painter = painterResource(id = itemList.image_Category),
                contentDescription = null,
                modifier = Modifier.size(20.dp)
            )
            Text(
                text = stringResource(id = itemList.name),
                style = MaterialTheme.typography.bodySmall
            )
        }
    }
}

@Composable
fun ChooseTitle(modifier: Modifier = Modifier, title: Int, seaAll: Int) {
    Row(
        modifier = Modifier.fillMaxWidth(),
        verticalAlignment = Alignment.Top,
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Text(
            text = stringResource(id = title),
            style = MaterialTheme.typography.labelLarge,
            textAlign = TextAlign.Start
        )
        Text(
            text = stringResource(id = seaAll),
            textAlign = TextAlign.End,
            style = MaterialTheme.typography.bodySmall,
            color = subTitle,
            modifier = Modifier.padding(end = 10.dp),
        )
    }
}

@Composable
@Preview
fun CardPreview() {
    CategoryCard()
}