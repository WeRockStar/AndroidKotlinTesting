package com.werockstar.kotlintesting.di.module.submodule

import android.support.v7.app.AppCompatActivity
import com.werockstar.kotlintesting.di.module.ActivityModule
import com.werockstar.kotlintesting.di.scope.PerActivity
import com.werockstar.kotlintesting.view.activity.MainActivity
import dagger.Binds
import dagger.Module

@Module(includes = [ActivityModule::class])
abstract class MainActivityModule {

    @Binds
    @PerActivity
    abstract fun mainActivityInjector(activity: MainActivity): AppCompatActivity
}