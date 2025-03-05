package com.coderpakistan.cryptoapp.crypto.presentation.coin_list

import com.coderpakistan.cryptoapp.core.domain.util.NetworkError

sealed interface CoinListEvent {
    data class Error(val error: NetworkError) : CoinListEvent
}