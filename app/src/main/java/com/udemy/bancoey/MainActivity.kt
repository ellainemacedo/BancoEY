package com.udemy.bancoey

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class MainActivity : AppCompatActivity() {

    private lateinit var saldo: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        try {
            saldo = findViewById(R.id.imgSaldo)
            saldo.setOnClickListener {
                val intent = Intent(this, SaldoActivity::class.java)
                startActivity(intent)
                finish()
            }
        }catch (e:Exception) {
            val erro = e
        }

    }
}