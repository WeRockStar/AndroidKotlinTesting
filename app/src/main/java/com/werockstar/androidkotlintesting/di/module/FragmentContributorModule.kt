package com.werockstar.androidkotlintesting.di.module

import com.werockstar.androidkotlintesting.di.scope.PerFragment
import com.werockstar.androidkotlintesting.view.fragment.MainFragment
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