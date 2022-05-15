package com.andreribeiro.progressbarexample

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.andreribeiro.progressbarexample.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        getDataAndLoadingProgressBar()
    }

    private fun getDataAndLoadingProgressBar() {
        binding.buttonGetData.setOnClickListener {
            binding.progressBar.visibility = View.VISIBLE
            Handler(Looper.getMainLooper()).postDelayed({
                binding.progressBar.visibility = View.INVISIBLE
            }, 5000)
        }
    }
}
