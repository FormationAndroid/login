package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        btnReset.setOnClickListener {
            editEmail.text.clear()
            editPassword.text.clear()
        }

        btnLogin.setOnClickListener {
            if (editPassword.text.toString() == "pass"){
                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent)
            }
            else {
                Toast.makeText(this, "Bad password", Toast.LENGTH_LONG).show()
            }
        }

    }
}
