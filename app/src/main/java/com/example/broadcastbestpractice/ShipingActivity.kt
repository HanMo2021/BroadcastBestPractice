package com.example.broadcastbestpractice

import android.content.Intent
import android.graphics.Color
import android.net.Uri
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.annotation.RequiresApi
import kotlinx.android.synthetic.main.activity_shiping.*
import kotlinx.android.synthetic.main.activity_yinyue.*

class ShipingActivity : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_shiping)




        supportActionBar?.hide()//隐藏标题栏
        window.navigationBarColor = Color.TRANSPARENT;//设置底部按键栏为透明
        window.statusBarColor = Color.TRANSPARENT;//设置顶部状态栏为透明
        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION;
        // 对于上面四行的实现可以删除这四行，将class ZhujiemainActivity : AppCompatActivity()的
        // AppCompatActivity()改为MobanActivity()
    }
}