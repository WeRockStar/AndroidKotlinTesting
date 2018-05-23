package com.werockstar.androidkotlintesting.view.activity

import android.os.Bundle
import com.werockstar.androidkotlintesting.R
import com.werockstar.androidkotlintesting.view.BaseActivity
import com.werockstar.androidkotlintesting.view.fragment.MainFragment

class MainActivity : BaseActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportFragmentManager.beginTransaction()
                .replace(R.id.fragmentContainer, MainFragment())
                .commit()
    }
}
