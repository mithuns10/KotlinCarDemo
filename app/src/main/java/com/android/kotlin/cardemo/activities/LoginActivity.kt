package com.android.kotlin.cardemo.activities

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.android.kotlin.cardemo.R
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        btnLogin.setOnClickListener {

            if(etUserName.text.toString().isEmpty()||etPassword.text.isEmpty()) {
                Toast.makeText(this,"Please Enter the valid Inputs", Toast.LENGTH_SHORT).show()
            }else{
                var intent : Intent = Intent(this,DashBoardActivity::class.java)
                startActivity(intent);
            }


        }
    }
}
