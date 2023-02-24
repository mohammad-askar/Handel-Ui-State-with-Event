package com.mohammad.askar.handleuieventswithstate

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.mohammad.askar.handleuieventswithstate.screen.CardScreen
import com.mohammad.askar.handleuieventswithstate.ui.theme.HandleUiEventsWithStateTheme
import com.mohammad.askar.handleuieventswithstate.viewModel.CardViewModel

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HandleUiEventsWithStateTheme {
                val cardViewModel = CardViewModel()
                CardScreen(cardViewModel = cardViewModel)
            }
        }
    }
}
