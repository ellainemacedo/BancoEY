package com.udemy.bancoey

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.widget.Toolbar
import androidx.appcompat.app.AppCompatActivity

class FaturaActivity: AppCompatActivity() {

    private lateinit var toolbar: Toolbar

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fatura)

        supportActionBar!!.hide()

        toolbar = findViewById(R.id.toolbarFatura)
        toolbar.title = "Faturas"
        toolbar.setTitleTextColor(getColor(R.color.colorWhite))
        toolbar.setTitleMargin(190, 0, 190, 0)
        toolbar.setBackgroundColor(getColor(R.color.colorLightBlue))
        toolbar.navigationIcon = getDrawable(R.drawable.ic_voltar)
        toolbar.setNavigationOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}