# Simple Recompose Example

Augment `app/main/java/WellessScreen.kt` and switch out between `WaterCounter` of `SimpleWaterCounter`

```kotlin
package com.example.stateincompose

import WaterCounter
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun WellnessScreen(modifier: Modifier = Modifier) {
    SimpleWaterCounter(modifier)
}
```