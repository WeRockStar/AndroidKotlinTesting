package com.werockstar.kotlintesting

import android.app.Activity
import android.app.Application
import com.werockstar.kotlintesting.di.component.DaggerApplicationComponent
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasActivityInjector
import javax.inject.Inject

class App : Application(), HasActivityInjector {

    @Inject lateinit var activityInjector: DispatchingAndroidInjector<Activity>

    companion object {
        val BASE_URL = ""
    }

    override fun onCreate() {
        super.onCreate()

        DaggerApplicationComponent.builder().create(this).inject(this)
    }

    override fun activityInjector(): AndroidInjector<Activity> = activityInjector
}