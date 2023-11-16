package com.example.acragroovyapplication

import android.app.Application
import android.content.Context
import org.acra.config.toast
import org.acra.data.StringFormat
import org.acra.http.BuildConfig
import org.acra.ktx.initAcra

class AcraGroovyApplication : Application() {
    override fun attachBaseContext(base: Context) {
        super.attachBaseContext(base)

        initAcra {
            //core configuration:
            buildConfigClass = BuildConfig::class.java
            reportFormat = StringFormat.JSON
            //each plugin you chose above can be configured in a block like this:
            toast {
                text = getString(R.string.crash_toast)
                //opening this block automatically enables the plugin.
            }
        }
    }
}