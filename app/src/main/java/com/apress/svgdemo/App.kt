package com.apress.svgdemo

import android.app.Application

/**
 * author : suikajy
 * date : 2018/9/7
 */
class App : Application() {

    companion object {
        lateinit var instance: App
    }

    override fun onCreate() {
        super.onCreate()
        instance = this
    }


}