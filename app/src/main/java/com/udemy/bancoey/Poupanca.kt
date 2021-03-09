package com.udemy.bancoey

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.Toolbar

class Poupanca : AppCompatActivity() {

    private lateinit var toolbar: Toolbar

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_poupanca)

        supportActionBar!!.hide()

        toolbar = findViewById(R.id.toolbarPoupanca)
        toolbar.title = "Poupança"
        toolbar.setTitleTextColor(getColor(R.color.colorWhite))
        toolbar.setTitleMargin(190,0,190,0)
        toolbar.setBackgroundColor(getColor(R.color.colorLightBlue))
        toolbar.navigationIcon = getDrawable(R.drawable.ic_voltar)
        toolbar.setNavigationOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}