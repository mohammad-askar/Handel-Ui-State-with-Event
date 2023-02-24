package com.mohammad.askar.handleuieventswithstate.event

sealed class CardEvent {
    object ShowCard: CardEvent()
    object HideCard: CardEvent()
}