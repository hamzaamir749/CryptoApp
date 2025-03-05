package com.coderpakistan.cryptoapp

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import com.coderpakistan.cryptoapp.core.navigation.AdaptiveCoinListDetailPane
import com.coderpakistan.cryptoapp.core.presentation.util.ObserveAsEvents
import com.coderpakistan.cryptoapp.core.presentation.util.toString
import com.coderpakistan.cryptoapp.crypto.presentation.coin_details.CoinDetailScreen
import com.coderpakistan.cryptoapp.crypto.presentation.coin_list.CoinListEvent
import com.coderpakistan.cryptoapp.crypto.presentation.coin_list.CoinListScreen
import com.coderpakistan.cryptoapp.crypto.presentation.coin_list.CoinListViewModel
import com.coderpakistan.cryptoapp.ui.theme.CryptoAppTheme
import org.koin.androidx.compose.koinViewModel

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CryptoAppTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                AdaptiveCoinListDetailPane(
                    modifier = Modifier.padding(innerPadding)
                )

                }
            }
        }
    }
}

