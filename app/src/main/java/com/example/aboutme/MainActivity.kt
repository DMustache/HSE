package com.example.aboutme

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.aboutme.databinding.ActivityMainBinding
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    private lateinit var viewBinding: ActivityMainBinding
    private var counter = 0
    private lateinit var itemsAdapter: ItemsAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        counter = savedInstanceState?.getInt(KEY_COUNTER, 0) ?: 0

        with(viewBinding.recyclerView){
            layoutManager = LinearLayoutManager(context)
            //adapter
        }
        viewBinding.sampleButton.setOnClickListener {
            counter ++
        }

    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putInt(KEY_COUNTER, counter)
    }

    companion object {
        private const val KEY_COUNTER = "counter"
    }
}