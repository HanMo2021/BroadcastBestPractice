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

class LoginActivity : MobanActivity() {

    @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)




        login.setOnClickListener {
            val account = accountEdit.text.toString()
            val password = passwordEdit.text.toString()
            // 如果账号是zhanhao且密码是123456，就认为登录成功
            if (account == "zhanghao" && password == "123456") {
                val intent = Intent(this, ZhujiemianActivity::class.java)
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
