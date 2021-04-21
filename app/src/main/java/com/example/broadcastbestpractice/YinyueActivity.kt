package com.example.broadcastbestpractice

import android.content.Intent
import android.net.Uri
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.annotation.RequiresApi
import kotlinx.android.synthetic.main.activity_shiping.*
import kotlinx.android.synthetic.main.activity_yinyue.*
import kotlinx.android.synthetic.main.activity_zhujiemian.*
import kotlinx.android.synthetic.main.activity_zhujiemian.img1

class YinyueActivity : MobanActivity() {
    @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_yinyue)

        img4.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://y.music.163.com/m/song/1832381575/?userid=272052686")
            startActivity(intent)
//给img4设计一个点击事件，点击后跳转到该网址
        }
    }
}