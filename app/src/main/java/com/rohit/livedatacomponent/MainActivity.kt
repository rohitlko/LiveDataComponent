package com.rohit.livedatacomponent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider

class MainActivity : AppCompatActivity() {
    lateinit var mainViewModel: MainViewModel

    private val textFact: TextView
        get() = findViewById(R.id.textViewFact)

    private val btnUpdate: Button
        get() = findViewById(R.id.buttonUpdate)


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mainViewModel = ViewModelProvider(this).get(MainViewModel::class.java)

        mainViewModel.factLiveData.observe(this, Observer {
            // code execute when ther is any chnage in the live data
            textFact.text = it

        })

        btnUpdate.setOnClickListener {
            mainViewModel.updateLiveDataOnClick()
        }

    }
}