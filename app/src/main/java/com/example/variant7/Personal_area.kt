package com.example.variant7

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.Toast

class PersonalAreaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.personal_area)

        // Кнопка "Назад"
        val buttonBack: ImageButton = findViewById(R.id.buttonBack)
        buttonBack.setOnClickListener {
            finish() // Закрывает текущую Activity и возвращает на предыдущую
        }

        // Кнопка "Go to Search"
        val buttonGoToSearch: Button = findViewById(R.id.buttonSearch)
        buttonGoToSearch.setOnClickListener {
            val intent = Intent(this, SearchActivity::class.java)
            startActivity(intent)
        }

        // Кнопка "Заказать доставку"
        val buttonOrderDelivery: Button = findViewById(R.id.buttonOrderDelivery)
        buttonOrderDelivery.setOnClickListener {
            Toast.makeText(this, "Заказ доставки", Toast.LENGTH_SHORT).show()
        }
    }
}