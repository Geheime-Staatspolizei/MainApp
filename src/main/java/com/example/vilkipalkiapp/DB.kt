package com.example.vilkipalkiapp

import android.content.ContentValues
import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper


class DB (val context: Context, val factory: SQLiteDatabase.CursorFactory?) :
    SQLiteOpenHelper(context, "UsersDB", factory, 1) {


    override fun onCreate(db: SQLiteDatabase?) {
        val quary = "CREATE TABLE users (id INT PRIMARY KEY, user TEXT, phone TEXT, pass TEXT)"
        db!!.execSQL(quary)
    }

    override fun onUpgrade(db: SQLiteDatabase?, p1: Int, p2: Int) {
        db!!.execSQL("DROP TABLE IF EXISTS users")
        onCreate(db)
    }

    fun addUser(user : Registration){
        val values = ContentValues()
        values.put("user", user.user)
        values.put("phone", user.phone)
        values.put("pass", user.pass)

        val db = this.readableDatabase
        db.insert("user", null, values)

        db.close()

    }

    fun getUser(phone: String, pass: String) : Boolean{
        val db = this.readableDatabase

        val result = db.rawQuery("SELECT * FROM user WHERE phone = '$phone' AND pass = '$pass'", null)
        return result.moveToFirst()
    }

}