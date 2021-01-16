package com.example.watch

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.core.content.ContextCompat.startActivity

class water_juice : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_water_juice)
    }
    fun buttonadd(view: View){
        val intent = Intent(this,add::class.java)
        startActivity(intent)
}
    fun buttonaddback(view: View) {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }}