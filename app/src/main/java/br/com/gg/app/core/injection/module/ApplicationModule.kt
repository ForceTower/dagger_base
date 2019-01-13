package br.com.gg.app.core.injection.module

import android.content.Context
import android.content.SharedPreferences
import android.preference.PreferenceManager
import br.com.gg.app.BaseApplication
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class ApplicationModule {
    @Provides
    fun provideContext(application: BaseApplication): Context {
        return application.applicationContext
    }

    @Provides
    @Singleton
    fun provideSharedPreferences(context: Context): SharedPreferences {
        return PreferenceManager.getDefaultSharedPreferences(context)
    }
}