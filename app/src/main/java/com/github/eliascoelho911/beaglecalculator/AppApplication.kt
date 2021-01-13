package com.github.eliascoelho911.beaglecalculator

import android.app.Application
import com.github.eliascoelho911.beaglecalculator.beagle.BeagleSetup

class AppApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        BeagleSetup().init(this)
    }
}