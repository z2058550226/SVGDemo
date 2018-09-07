package com.apress.svgdemo

import android.graphics.drawable.Animatable
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

/**
 * author : suikajy
 * date : 2018/9/7
 */
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mIv.setOnClickListener {
            val drawable = mIv.drawable
            if (drawable is Animatable) {
                drawable.start()
            }
        }
    }

}