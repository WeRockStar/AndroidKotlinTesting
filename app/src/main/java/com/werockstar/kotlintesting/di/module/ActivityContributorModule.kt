package com.werockstar.kotlintesting.di.module

import com.werockstar.kotlintesting.di.module.submodule.MainActivityModule
import com.werockstar.kotlintesting.di.scope.PerActivity
import com.werockstar.kotlintesting.view.activity.MainActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityContributorModule {

    /**
     * Binds with dagger.android
     */
    @PerActivity
    @ContributesAndroidInjector(modules = [MainActivityModule::class, FragmentContributorModule::class])
    abstract fun contributeMainActivity(): MainActivity
}