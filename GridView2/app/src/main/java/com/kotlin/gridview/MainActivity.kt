package com.kotlin.gridview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.kotlin.gridview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val list = ArrayList<BookModel>()
        list.add(BookModel(R.drawable.uprootedbookimage,"Uprooted","By:Naomi Novik"))
        list.add(BookModel(R.drawable.poppybookimage,"The Poppy War","By:R.F.Kuang"))
        list.add(BookModel(R.drawable.book,"The Cruel Prince","By:Holly Black"))
        list.add(BookModel(R.drawable.redqueen,"Red Queen","By:Victoria Aveyard"))
        list.add(BookModel(R.drawable.thegirlbookimage,"The Girl Who Fell Beneath the Sea","By:Axie Oh"))
        list.add(BookModel(R.drawable.moonbookimage,"Daughter of the Moon Goddess","By:Sue Lynn Tan"))
        list.add(BookModel(R.drawable.uprootedbookimage,"Uprooted","By:Naomi Novik"))
        list.add(BookModel(R.drawable.poppybookimage,"The Poppy War","By:R.F.Kuang"))
        list.add(BookModel(R.drawable.book,"The Cruel Prince","By:Holly Black"))
        list.add(BookModel(R.drawable.redqueen,"Red Queen","By:Victoria Aveyard"))
        list.add(BookModel(R.drawable.thegirlbookimage,"The Girl Who Fell Beneath the Sea","By:Axie Oh"))
        list.add(BookModel(R.drawable.moonbookimage,"Daughter of the Moon Goddess","By:Sue Lynn Tan"))


        val myAdapter = MyAdapter(this,list)
        val listview = binding.listView
        listview.adapter=myAdapter
    }
}