package com.udemy.bancoey

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class MainActivity : AppCompatActivity() {

    private lateinit var saldo: ImageView
    private lateinit var fatura: ImageView
    private lateinit var transferencia: ImageView
    private lateinit var poupanca: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        saldo = findViewById(R.id.imgSaldo)
        saldo.setOnClickListener {
            val intent = Intent(this, SaldoActivity::class.java)
            startActivity(intent)
            finish()
        }

        fatura = findViewById(R.id.imgFatura)
        fatura.setOnClickListener {
            val intent = Intent(this, FaturaActivity::class.java)
            startActivity(intent)
            finish()
        }

        transferencia = findViewById(R.id.imgTransferencia)
        transferencia.setOnClickListener {
            val intent = Intent(this, TransferenciaActivity::class.java)
            startActivity(intent)
            finish()
        }

        poupanca = findViewById(R.id.imgPoupanca)
        poupanca.setOnClickListener {
            val intent = Intent(this, Poupanca::class.java)
            startActivity(intent)
            finish()
        }
    }
}