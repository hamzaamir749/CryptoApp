# CryptoApp 📈

A native Android cryptocurrency app built with **Kotlin** and **Jetpack Compose**. CryptoApp retrieves market data from the [CoinCap API](https://api.coincap.io/v2/) and presents cryptocurrency listings and individual coin details in an adaptive interface.

## Features

- Browse cryptocurrency market listings.
- Open an individual coin's detail screen.
- View coin price information and chart visualisation.
- Adaptive list–detail navigation for different screen sizes.
- Material 3 UI built with Jetpack Compose.
- Network requests handled with Ktor.
- JSON parsing with Kotlinx Serialization.
- Dependency injection with Koin.
- Centralised handling of network results and errors.

## Tech Stack

| Technology | Usage |
|---|---|
| Kotlin | Application language |
| Jetpack Compose | Declarative UI |
| Material 3 | UI components and theming |
| Material 3 Adaptive Navigation | Adaptive list–detail layout |
| Kotlin Coroutines | Asynchronous work |
| AndroidX Lifecycle / ViewModel | Lifecycle-aware UI state |
| Ktor Client | HTTP networking |
| Kotlinx Serialization | JSON serialization |
| Koin | Dependency injection |
| Gradle Kotlin DSL | Build configuration |

## Architecture

The codebase separates core networking and shared utilities from the cryptocurrency feature.

- **Core data:** Ktor HTTP client setup, safe API calls, response mapping and URL construction.
- **Core domain:** Shared result and network error types.
- **Crypto data:** Remote CoinCap data source, API DTOs and domain mappers.
- **Crypto domain:** Coin models and data-source contracts.
- **Crypto presentation:** Coin list and coin detail UI.
- **Core navigation:** Adaptive coin list–detail navigation.

## API

CryptoApp uses the CoinCap API.

- Base URL: `https://api.coincap.io/v2/`
- Documentation: [docs.coincap.io](https://docs.coincap.io/)

The API base URL is configured through the app's Gradle BuildConfig for both debug and release builds.

## Requirements

- Android Studio
- JDK 11
- Android SDK 35
- Minimum Android version: Android 7.0 (API 24)

## Getting Started

1. Clone the repository:

   ```bash
   git clone https://github.com/hamzaamir749/CryptoApp.git
   ```

2. Open the project in Android Studio.
3. Allow Gradle to sync and download dependencies.
4. Run the `app` configuration on an emulator or a connected Android device.

You can also build the debug APK from the project root:

```bash
./gradlew assembleDebug
```

## Testing

Run local unit tests:

```bash
./gradlew test
```

Run Android instrumented tests on a connected device or emulator:

```bash
./gradlew connectedAndroidTest
```

## Project Configuration

| Setting | Value |
|---|---|
| Application ID | `com.coderpakistan.cryptoapp` |
| Minimum SDK | 24 |
| Compile SDK | 35 |
| Target SDK | 35 |
| Version | 1.0 (version code 1) |
| Kotlin | 2.0.20 |
| Android Gradle Plugin | 8.8.0 |
| Ktor | 2.3.12 |
| Koin | 3.5.6 |

## Author

**Amir Hamza**

- GitHub: [@hamzaamir749](https://github.com/hamzaamir749)

---

If you find this project useful, consider giving it a ⭐ on GitHub.
