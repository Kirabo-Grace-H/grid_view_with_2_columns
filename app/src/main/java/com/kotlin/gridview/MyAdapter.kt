package com.kotlin.gridview

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView

class MyAdapter(val context:Context, val list: ArrayList<BookModel>):BaseAdapter() {
    override fun getCount(): Int {
        return list.size
    }

    override fun getItem(p0: Int): Any {
        return list[p0]
    }

    override fun getItemId(p0: Int): Long {
        return p0.toLong()
    }

    override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View {
        val view = LayoutInflater.from(context).inflate(R.layout.item_list_layout, null)
        val title = view.findViewById<TextView>(R.id.titleTV)
        title.text = list[p0].title
        val author = view.findViewById<TextView>(R.id.desTV)
        author.text = list[p0].author
        val image = view.findViewById<ImageView>(R.id.imageView2)
        image.setImageResource(list[p0].image)

        image.setOnClickListener {
            //startActivity...requires a context
            var intent = Intent(context, DetailsActivity::class.java)
            intent.putExtra("image", list[p0].image)
            intent.putExtra("name", list[p0].title)
            intent.putExtra("auth", list[p0].author)
            context.startActivity(intent)
        }
        return view
    }
}