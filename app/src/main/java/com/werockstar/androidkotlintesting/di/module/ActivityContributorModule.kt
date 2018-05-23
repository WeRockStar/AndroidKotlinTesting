package com.werockstar.androidkotlintesting.di.module

import com.werockstar.androidkotlintesting.di.module.submodule.MainActivityModule
import com.werockstar.androidkotlintesting.di.scope.PerActivity
import com.werockstar.androidkotlintesting.view.activity.MainActivity
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