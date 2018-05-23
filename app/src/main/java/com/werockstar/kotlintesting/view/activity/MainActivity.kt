package com.werockstar.kotlintesting.view.activity

import android.os.Bundle
import com.werockstar.kotlintesting.R
import com.werockstar.kotlintesting.view.BaseActivity
import com.werockstar.kotlintesting.view.fragment.MainFragment

class MainActivity : BaseActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportFragmentManager.beginTransaction()
                .replace(R.id.fragmentContainer, MainFragment())
                .commit()
    }
}
