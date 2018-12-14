package app.beelabs.fingol

import android.content.Context
import app.beelabs.com.codebase.base.BaseApp
import app.beelabs.com.codebase.di.component.AppComponent
import app.beelabs.com.codebase.di.component.DaggerAppComponent

class App : BaseApp() {
    private var context: Context? = null


    override fun onCreate() {
        super.onCreate()
        context = applicationContext;
        setupBuilder(DaggerAppComponent.builder(), this)
    }

    public fun getAppComponent(): AppComponent? {
        if (context == null) return null
        return getComponent()
    }
}