package com.example.broadcastbestpractice

import android.content.Intent
import android.graphics.Color
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import androidx.annotation.RequiresApi

class Shanping : AppCompatActivity() {

    companion object {
        private const val DELAY_TIME = 6000L
    }

    @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_shanping)//该Activity选择使用的xml

        supportActionBar?.hide()//隐藏标题栏

        window.navigationBarColor = Color.TRANSPARENT;//设置底部按键栏为透明
        window.statusBarColor = Color.TRANSPARENT;//设置顶部状态栏为透明
        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION;

        Handler().postDelayed({
            val intent=Intent(this, LoginActivity::class.java)
            startActivity(intent)
            finish()
        }, DELAY_TIME)
    }
}
//原文链接：https://blog.csdn.net/xjh_shin/article/details/104349213