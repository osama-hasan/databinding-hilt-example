package com.example.daggerhiltexample

import android.app.Application
import dagger.hilt.android.HiltAndroidApp


// Required For hilt every time using dagger hilt
// visit for more https://developer.android.com/training/dependency-injection/hilt-android#groovy
// don't forget to change the name in the manifest
@HiltAndroidApp
class CustomApplication : Application() {
}