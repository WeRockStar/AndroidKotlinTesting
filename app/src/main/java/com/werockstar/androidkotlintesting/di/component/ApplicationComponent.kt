package com.werockstar.androidkotlintesting.di.component

import com.werockstar.androidkotlintesting.App
import com.werockstar.androidkotlintesting.di.module.ActivityContributorModule
import com.werockstar.androidkotlintesting.di.module.ApplicationModule
import com.werockstar.androidkotlintesting.di.module.HttpModule
import com.werockstar.androidkotlintesting.di.module.RxThreadModule
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton

@Singleton
@Component(modules = [
    ApplicationModule::class, AndroidSupportInjectionModule::class,
    ActivityContributorModule::class, HttpModule::class,
    RxThreadModule::class
])
interface ApplicationComponent : AndroidInjector<App> {

    @Component.Builder
    abstract class Builder : AndroidInjector.Builder<App>()
}
