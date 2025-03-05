package com.coderpakistan.cryptoapp.crypto.data.mappers

import com.coderpakistan.cryptoapp.crypto.data.networking.dto.CoinDto
import com.coderpakistan.cryptoapp.crypto.data.networking.dto.CoinPriceDto
import com.coderpakistan.cryptoapp.crypto.domain.Coin
import com.coderpakistan.cryptoapp.crypto.domain.CoinPrice
import java.time.Instant
import java.time.ZoneId

fun CoinDto.toCoin(): Coin {
    return Coin(
        id = id,
        rank = rank,
        name = name,
        symbol = symbol,
        marketCapUsd = marketCapUsd,
        priceUsd = priceUsd,
        changePercent24Hr = changePercent24Hr
    )
}

fun CoinPriceDto.toCoinPrice(): CoinPrice {
    return CoinPrice(
        priceUsd = priceUsd,
        dateTime = Instant.ofEpochMilli(time).atZone(ZoneId.systemDefault())
    )
}