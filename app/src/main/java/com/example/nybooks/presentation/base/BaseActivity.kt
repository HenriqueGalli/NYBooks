package com.example.nybooks.presentation.base

import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatButton
import androidx.appcompat.widget.Toolbar


open class BaseActivity: AppCompatActivity() {
    protected fun setupToolbar(toolbar: Toolbar, titleIdRes: Int, showBackButton:Boolean = false){

        toolbar.title = getString(titleIdRes)
        setSupportActionBar(toolbar)
        if(showBackButton)
                 supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }

}