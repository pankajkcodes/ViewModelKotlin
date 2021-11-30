package com.pankajkcodes.viewmodelkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider

class MainActivity : AppCompatActivity() {

    private lateinit var textView: TextView
    private lateinit var btn : Button
    private lateinit var mainViewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textView = findViewById(R.id.count)
        btn  = findViewById(R.id.button)


        mainViewModel = ViewModelProvider(this,MainViewModelFactory(10))[MainViewModel::class.java]
        setText()
        btn.setOnClickListener {
            increment()
        }


    }

    private fun setText(){
        textView.text = mainViewModel.count.toString()
    }

    fun increment(){
        mainViewModel.increment()

        setText()
    }
}