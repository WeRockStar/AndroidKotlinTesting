package com.werockstar.androidkotlintesting.di.module.submodule

import android.support.v7.app.AppCompatActivity
import com.werockstar.androidkotlintesting.di.module.ActivityModule
import com.werockstar.androidkotlintesting.di.scope.PerActivity
import com.werockstar.androidkotlintesting.view.activity.MainActivity
import dagger.Binds
import dagger.Module

@Module(includes = [ActivityModule::class])
abstract class MainActivityModule {

    @Binds
    @PerActivity
    abstract fun mainActivityInjector(activity: MainActivity): AppCompatActivity
}