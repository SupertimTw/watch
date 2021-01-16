package com.example.watch

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class add : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add)
    }
    fun buttonaddback2(view: View) {
        val intent = Intent(this, water_juice::class.java)
        startActivity(intent)
}}