package com.github.eliascoelho911.beaglecalculator

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import br.com.zup.beagle.android.utils.newServerDrivenIntent
import br.com.zup.beagle.android.view.ScreenRequest
import com.github.eliascoelho911.beaglecalculator.beagle.AppBeagleActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val intent = this.newServerDrivenIntent<AppBeagleActivity>(ScreenRequest("/screen"))
        startActivity(intent)
        finish()
    }
}