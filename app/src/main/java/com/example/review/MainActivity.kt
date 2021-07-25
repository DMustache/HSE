package com.example.review

import UsersAdapter
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.content_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val itemsId: ArrayList<String> = ArrayList()

        for (i in 0..4){
            itemsId.add("$i")
        }
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = UsersAdapter(itemsId)
    }
}
