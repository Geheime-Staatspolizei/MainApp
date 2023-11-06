package com.example.vilkipalkiapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.Telephony.Mms.Intents
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val userPhone = findViewById<EditText>(R.id.userPhoneAuth)
        val passordUser: EditText = findViewById(R.id.userPassAccAuth)
        val login: Button = findViewById(R.id.login)
        val regAdd: Button = findViewById(R.id.reg_add)

        login.setOnClickListener {
            val phone = userPhone.text.toString().trim()
            val pass = passordUser.text.toString().trim()

            if(phone == "" || pass == ""){
                Toast.makeText(this, "Не все данные введены!", Toast.LENGTH_SHORT).show()
            }
            else{
                val intent = Intent(this, ItemsActivity::class.java)
                startActivity(intent)
            }
        }

        regAdd.setOnClickListener {
            val intent = Intent(this, registration_main::class.java)
            startActivity(intent)
            }

        }
}
