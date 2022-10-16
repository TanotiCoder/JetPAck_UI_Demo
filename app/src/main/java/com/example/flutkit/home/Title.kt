package com.example.flutkit.home

import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.flutkit.R
import com.example.flutkit.ui.theme.FlutKitTheme
import com.example.flutkit.ui.theme.IconOn
import com.example.flutkit.ui.theme.subTitle

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Intro(modifier: Modifier = Modifier) {
    Row(
        modifier = modifier
            .fillMaxWidth(1f)
            .padding(16.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.Top

    ) {
        Column() {
            Text(
                text = stringResource(id = R.string.name),
                style = MaterialTheme.typography.bodyLarge
            )
            Text(
                text = stringResource(id = R.string.name_subtitle),
                style = MaterialTheme.typography.labelLarge,
                color = subTitle,
                modifier = Modifier.padding(top = 8.dp)
            )
        }

        BadgedBox(
            badge = {
                Badge { Text("") }
            },
            modifier = Modifier.padding(top = 8.dp)
        ) {
            Icon(
                Icons.Filled.Notifications,
                contentDescription = "Notification",
                modifier = Modifier.size(30.dp),
                tint = IconOn
            )
        }
    }
}

@Composable
@Preview
fun IntroPreview() {
    FlutKitTheme() {
        androidx.compose.material3.Surface {
            Intro()
        }
    }
}