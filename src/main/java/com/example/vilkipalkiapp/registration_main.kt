package com.example.vilkipalkiapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class registration_main : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registration_main)

        val userName: TextView = findViewById(R.id.userName)
        val userPhone : EditText = findViewById(R.id.userPhone)
        val passordUser : EditText = findViewById(R.id.userPassAcc)
        val reg : Button = findViewById(R.id.reg)

        reg.setOnClickListener {
            val user = userName.text.toString().trim()
            val phone = userPhone.text.toString().trim()
            val pass = passordUser.text.toString().trim()
            if (user == "" || phone == "" || pass == "")
                Toast.makeText(this, "Не все данные введены!", Toast.LENGTH_SHORT).show()
            else {
                val registration = Registration(user, phone, pass)

                val db = DB(this, null)
                db.addUser(registration)
                Toast.makeText(this, "Пользователь зарегистрирован", Toast.LENGTH_SHORT).show()


                val intent = Intent(this, MainActivity::class.java )
                startActivity(intent)
            }
        }
    }
}