package com.kotlin.gridview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class DetailsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details)

        val image= intent.getIntExtra("image", R.drawable.uprootedbookimage)
        val title = intent.getStringExtra("name")
        val author = intent.getStringExtra("auth")

        val imageView = findViewById<ImageView>(R.id.imageView)
        imageView.setImageResource(image)
        val textView = findViewById<TextView>(R.id.textViewtitle)
        textView.text=title
        val authorTV = findViewById<TextView>(R.id.tvAuthor)
        authorTV.text=author
        val descrip = findViewById<TextView>(R.id.tvDescription)
        descrip.text
    }
}