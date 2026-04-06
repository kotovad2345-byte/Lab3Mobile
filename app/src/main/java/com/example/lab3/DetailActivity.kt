package com.example.lab3

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.appbar.MaterialToolbar

class DetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val toolbar = findViewById<MaterialToolbar>(R.id.toolbar)
        setSupportActionBar(toolbar)

        toolbar.setNavigationOnClickListener {
            finish()
        }

        val image = findViewById<ImageView>(R.id.detailImage)
        val title = findViewById<TextView>(R.id.detailTitle)
        val text = findViewById<TextView>(R.id.detailText)

        val titleRes = intent.getIntExtra("title", 0)
        val textRes = intent.getIntExtra("text", 0)
        val imageRes = intent.getIntExtra("image", 0)

        title.setText(titleRes)
        text.setText(textRes)
        image.setImageResource(imageRes)
    }
}
