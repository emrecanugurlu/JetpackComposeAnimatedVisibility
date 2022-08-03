package com.emrecnugurlu.animatedvisibility

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.*
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.emrecnugurlu.animatedvisibility.ui.theme.AnimatedVisibilityTheme
import com.emrecnugurlu.animatedvisibility.view.MyAlertCardDesign

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AnimatedVisibilityTheme {
                AnimatedVisibilityCompose()
            }
        }
    }
}

@Composable
fun AnimatedVisibilityCompose() {
    var showMyAlertCard by remember { mutableStateOf(true) }
    val density = LocalDensity.current

    Box(modifier = Modifier.fillMaxSize()) {

        AnimatedVisibility(visible = showMyAlertCard,
            enter = slideInVertically {
                with(density) { -40.dp.roundToPx() }
            } + expandVertically(
                expandFrom = Alignment.Top
            ) + fadeIn(
                initialAlpha = 0.3f
            ),
            exit = slideOutVertically() + shrinkVertically() + fadeOut()) {
            MyAlertCardDesign()
        }
        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Button(onClick = { showMyAlertCard = !showMyAlertCard }) {
                Text(text = "Animated Visibility")
            }
        }


    }


}

@Preview
@Composable
fun AnimatedVisibilityPreview() {
    AnimatedVisibilityCompose()
}