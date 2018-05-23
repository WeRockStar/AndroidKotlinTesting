package com.werockstar.kotlintesting.di.module

import android.app.Activity
import android.content.Context
import android.support.v7.app.AppCompatActivity
import com.werockstar.kotlintesting.di.scope.PerActivity
import dagger.Binds
import dagger.Module

@Module
abstract class ActivityModule {

    @Binds
    @PerActivity
    abstract fun activity(appCompatActivity: AppCompatActivity): Activity


    @Binds
    @PerActivity
    abstract fun activityContext(activity: Activity): Context

}