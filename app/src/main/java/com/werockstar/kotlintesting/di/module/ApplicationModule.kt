package com.werockstar.kotlintesting.di.module

import android.app.Application
import com.werockstar.kotlintesting.App
import dagger.Binds
import dagger.Module
import javax.inject.Singleton

@Module
abstract class ApplicationModule {

    @Binds
    @Singleton
    abstract fun provideApplication(app: App): Application

}