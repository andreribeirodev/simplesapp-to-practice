package com.andreribeiro.recyclerviewtraining

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.andreribeiro.recyclerviewtraining.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val binding: ActivityMainBinding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val contatosMock: List<Contato> = listOf(
            Contato(
                "André Luiz",
                "81 99846-3324"
            )
        )
    }
}
