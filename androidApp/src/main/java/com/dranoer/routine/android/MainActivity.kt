package com.dranoer.routine.android

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.foundation.layout.FlowRow
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApplicationTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    FlowView()
                }
            }
        }
    }
}

@OptIn(ExperimentalLayoutApi::class)
@Composable
fun FlowView() {
    FlowRow(modifier = Modifier.padding(8.dp)) {
        TargetChip(text = "Column Item")
        TargetChip(text = "Another item")
        TargetChip(text = "Third item")
        TargetChip(text = "Forth item")
        TargetChip(text = "Fifth item")
        TargetChip(text = "Sixth item")
        TargetChip(text = "Seventh item")
        TargetChip(text = "Eight item")
    }
}

@OptIn(ExperimentalMaterialApi::class)
@Composable
private fun TargetChip(text: String) {
    Chip(modifier = Modifier.padding(4.dp), onClick = {}) { Text(text = text) }
}

//region Preview
@Preview(showBackground = true)
@Composable
private fun FlowViewPreview() {
    MyApplicationTheme {
        FlowView()
    }
}

@Preview
@Composable
private fun TargetChipPreview() {
    MyApplicationTheme {
        TargetChip("Target")
    }
}
//endregion