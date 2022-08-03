package com.emrecnugurlu.animatedvisibility.view

import androidx.compose.foundation.layout.*
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun MyAlertCardDesign() {
    Card(modifier = Modifier
        .padding(10.dp)
        .fillMaxWidth().height(100.dp)) {
        Column(modifier = Modifier.padding(10.dp)) {
            Text(text = "Card Title")
            Text(text = "Card Text")
        }
    }
}

@Preview
@Composable
fun MyAlertCardDesignPreview() {
    MyAlertCardDesign()
}