package com.mohammad.askar.handleuieventswithstate.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.mohammad.askar.handleuieventswithstate.event.CardEvent
import com.mohammad.askar.handleuieventswithstate.state.CardState
import com.mohammad.askar.handleuieventswithstate.viewModel.CardViewModel
import java.util.EventListener

@Composable
fun CardScreen(
    cardViewModel: CardViewModel
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = MaterialTheme.colors.surface),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        val cardState by cardViewModel.cardState.collectAsState()
        Box(
            modifier = Modifier
                .width(150.dp)
                .height(100.dp)
                .background(
                    if (cardState.showCard) Color.Green
                    else Color.Red
                )
                .alpha(0.9F)
        ) {
            Text(
                text = cardState.data,
                fontSize = 34.sp,
                modifier = Modifier.align(Alignment.Center),
                color = if (cardState.showCard) Color.Black else Color.White
            )
        }
        
        Button(onClick = {
            if (cardState.showCard) cardViewModel.setCardEvent(event = CardEvent.HideCard)
            else cardViewModel.setCardEvent(event = CardEvent.ShowCard)
        }) {
            Text(text = "Change")
        }
    }
}

@Preview(showSystemUi = true)
@Composable
fun CardScreenPreview() {
    CardScreen(cardViewModel = CardViewModel())
}