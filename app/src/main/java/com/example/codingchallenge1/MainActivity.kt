package com.example.codingchallenge1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import com.example.codingchallenge1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    companion object {
        private const val START = "START"
        private const val STOP = "STOP"
    }
    private lateinit var binding: ActivityMainBinding
    var isProgressed = false
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.apply {
            progressBar.visibility = View.GONE
            controlButton.setOnClickListener {
                changeState()
            }
        }

    }

    private fun changeState() {
        binding.apply {
            if(isProgressed){
                isProgressed = false
                progressBar.visibility = View.GONE
                controlButton.text = START
            } else {
                isProgressed = true
                progressBar.visibility = View.VISIBLE
                controlButton.text = STOP
            }
        }
    }
}