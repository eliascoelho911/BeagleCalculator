package com.github.eliascoelho911.beaglecalculator.beagle

import br.com.zup.beagle.android.annotation.BeagleComponent
import br.com.zup.beagle.android.setup.BeagleConfig
import br.com.zup.beagle.android.setup.Cache
import br.com.zup.beagle.android.setup.Environment

@BeagleComponent
class AppBeagleConfig(
    override val baseUrl: String = "http://192.168.0.11:8080",
    override val cache: Cache = Cache(
        enabled = true,
        maxAge = 300,
        size = 15
    ),
    override val environment: Environment = Environment.DEBUG,
    override val isLoggingEnabled: Boolean = true,
) : BeagleConfig