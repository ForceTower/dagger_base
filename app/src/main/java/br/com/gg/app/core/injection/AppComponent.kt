package br.com.gg.app.core.injection

import br.com.gg.app.BaseApplication
import br.com.gg.app.core.injection.module.ActivityModule
import br.com.gg.app.core.injection.module.ApplicationModule
import br.com.gg.app.core.injection.module.ViewModelModule
import dagger.Component
import dagger.android.AndroidInjectionModule
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton

@Singleton
@Component(
    modules = [
        AndroidInjectionModule::class,
        AndroidSupportInjectionModule::class,
        ApplicationModule::class,
        ViewModelModule::class,
        ActivityModule::class
    ]
)
interface AppComponent: AndroidInjector<BaseApplication> {
    @Component.Builder
    abstract class Builder : AndroidInjector.Builder<BaseApplication>()
}