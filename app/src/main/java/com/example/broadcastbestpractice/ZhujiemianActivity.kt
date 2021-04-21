package com.example.broadcastbestpractice

import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.annotation.RequiresApi
import kotlinx.android.synthetic.main.activity_zhujiemian.*

class ZhujiemianActivity : MobanActivity() {
    @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_zhujiemian)

        img1.setOnClickListener{
            val intent= Intent(this,ShipingActivity::class.java)
            startActivity(intent)}
        img2.setOnClickListener{
            val intent= Intent(this,YinyueActivity::class.java)
            startActivity(intent)}
        img3.setOnClickListener{
            val intent= Intent(this,HuoxingActivity::class.java)
            startActivity(intent)}

    }
}