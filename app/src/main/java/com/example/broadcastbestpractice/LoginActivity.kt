package com.example.broadcastbestpractice

import android.content.Intent
import android.graphics.Color
import android.os.Build
import android.os.Bundle
import android.view.View
import android.view.Window
import android.view.WindowManager
import android.widget.Toast
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity;

import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {

    @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)


        supportActionBar?.hide()//隐藏标题栏

        window.navigationBarColor = Color.TRANSPARENT;//设置底部按键栏为透明
        window.statusBarColor = Color.TRANSPARENT;//设置顶部状态栏为透明
        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION;


        login.setOnClickListener {
            val account = accountEdit.text.toString()
            val password = passwordEdit.text.toString()
            // 如果账号是zhanhao且密码是123456，就认为登录成功
            if (account == "zhanghao" && password == "123456") {
                val intent = Intent(this, ZhujiemainActivity::class.java)
                //跳转到ZhujiemainActivity
                startActivity(intent)
                finish()
            }
            else if(account != "zhanghao")
            {
                Toast.makeText(this, "账号错误", Toast.LENGTH_SHORT).show()
            }
            else if(password != "123456")
            {
                Toast.makeText(this, "密码错误", Toast.LENGTH_SHORT).show()
            }
        }
    }

}
