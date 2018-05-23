package com.werockstar.kotlintesting.di.module

import com.werockstar.kotlintesting.di.scope.PerFragment
import com.werockstar.kotlintesting.view.fragment.MainFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class FragmentContributorModule {

    /**
     * Binds with dagger.android
     */
    @PerFragment
    @ContributesAndroidInjector
    abstract fun contributeMainFragment(): MainFragment
}