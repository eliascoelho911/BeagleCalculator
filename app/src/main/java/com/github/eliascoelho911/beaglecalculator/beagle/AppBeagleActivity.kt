package com.github.eliascoelho911.beaglecalculator.beagle

import android.os.Bundle
import android.util.Log
import androidx.appcompat.widget.Toolbar
import br.com.zup.beagle.android.annotation.BeagleComponent
import br.com.zup.beagle.android.view.BeagleActivity
import br.com.zup.beagle.android.view.ServerDrivenState
import com.github.eliascoelho911.beaglecalculator.R
import com.github.eliascoelho911.beaglecalculator.extension.showToast
import kotlinx.android.synthetic.main.activity_app_beagle.*

@BeagleComponent
class AppBeagleActivity : BeagleActivity() {
    private val toolbarView: Toolbar by lazy {
        activity_app_beagle_toolbar
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_app_beagle)
    }

    override fun onServerDrivenContainerStateChanged(state: ServerDrivenState) {
        when (state) {
            is ServerDrivenState.Error -> {
                showToast(state.toString())
            }
        }
    }

    override fun getServerDrivenContainerId(): Int = R.id.server_driven_container

    override fun getToolbar(): Toolbar = toolbarView
}
