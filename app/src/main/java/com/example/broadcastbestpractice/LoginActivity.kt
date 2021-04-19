package com.example.broadcastbestpractice

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity;

import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        login.setOnClickListener {
            val account = accountEdit.text.toString()
            val password = passwordEdit.text.toString()
            // 如果账号是admin且密码是123456，就认为登录成功
            if (account == "王三岁" && password == "123456") {
                val intent = Intent(this, ZhujiemainActivity::class.java)
                //显示跳转
                startActivity(intent)
                finish()
            }
            else if(account != "王三岁")
            {
                Toast.makeText(this, "王三岁你居然把账号输错了", Toast.LENGTH_SHORT).show()
            }
            else if(password != "123456")
            {
                Toast.makeText(this, "enmmmmmm 密码这个可能倒情有可原", Toast.LENGTH_SHORT).show()
            }
        }
    }

}
