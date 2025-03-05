package com.coderpakistan.cryptoapp.crypto.presentation.coin_list

import com.coderpakistan.cryptoapp.crypto.presentation.models.CoinUi

sealed interface CoinListAction {
    data class OnCoinClick(val coinUi: CoinUi) : CoinListAction
}