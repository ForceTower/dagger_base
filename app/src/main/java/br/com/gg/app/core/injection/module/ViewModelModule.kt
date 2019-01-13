package br.com.gg.app.core.injection.module

import androidx.lifecycle.ViewModelProvider
import br.com.gg.app.core.vm.ViewModelFactory
import dagger.Binds
import dagger.Module

@Module
abstract class ViewModelModule {
    @Binds
    internal abstract fun bindViewModelFactory(factory: ViewModelFactory): ViewModelProvider.Factory
}