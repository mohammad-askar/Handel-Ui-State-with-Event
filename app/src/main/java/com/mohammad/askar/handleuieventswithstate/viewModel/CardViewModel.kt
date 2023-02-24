package com.mohammad.askar.handleuieventswithstate.viewModel

import androidx.lifecycle.ViewModel
import com.mohammad.askar.handleuieventswithstate.event.CardEvent
import com.mohammad.askar.handleuieventswithstate.state.CardState
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class CardViewModel : ViewModel() {

    private val _cardState = MutableStateFlow(value = CardState())
    val cardState: StateFlow<CardState>
        get() = _cardState.asStateFlow()

    init {
        val cardNumber = "Result!"
        _cardState.update { cardState ->
            cardState.copy(data = cardNumber, showCard = false)
        }
    }

    fun setCardEvent(event: CardEvent) {
        when (event) {

            is CardEvent.HideCard -> {
                _cardState.update { cardState ->
                    cardState.copy(data = "Hidden", showCard = false)
                }
            }
            is CardEvent.ShowCard -> {
                _cardState.update { cardState ->
                    cardState.copy(data = "Shown", showCard = true)
                }
            }
        }
    }
}