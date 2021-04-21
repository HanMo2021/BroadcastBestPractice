package com.example.broadcastbestpractice

import android.content.Intent
import android.graphics.Color
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import androidx.annotation.RequiresApi

class Shanping : MobanActivity(){

    companion object {
        private const val DELAY_TIME = 2000L
    }

    @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_shanping)//该Activity选择使用的xml


        Handler().postDelayed({
            val intent=Intent(this, LoginActivity::class.java)
            startActivity(intent)
            finish()
        }, DELAY_TIME)
    }
}
//原文链接：https://blog.csdn.net/xjh_shin/article/details/104349213