package com.mohammad.askar.handleuieventswithstate

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
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
