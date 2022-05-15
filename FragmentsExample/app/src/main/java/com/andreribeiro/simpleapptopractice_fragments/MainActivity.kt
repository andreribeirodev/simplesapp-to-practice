package com.andreribeiro.simpleapptopractice_fragments

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.andreribeiro.simpleapptopractice_fragments.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }
    private val homeFragment by lazy { HomeFragment() }
    private val consoleFragment by lazy { ConsoleFragment() }
    private val gameFragment by lazy { GamesFragment() }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        setFragment(homeFragment)
        binding.btnHome.setOnClickListener(this)
        binding.btnConsole.setOnClickListener(this)
        binding.btnGames.setOnClickListener(this)
    }

    override fun onClick(button: View) {
        when (button) {
            binding.btnHome -> {
                button.setOnClickListener { setFragment(homeFragment) }
            }
            binding.btnConsole -> {
                button.setOnClickListener { setFragment(consoleFragment) }
            }
            binding.btnGames -> {
                button.setOnClickListener { setFragment(gameFragment) }
            }
        }
    }

    private fun setFragment(fragment: Fragment) {
        val fragmentTransaction = supportFragmentManager.beginTransaction()
        fragmentTransaction.replace(binding.fragmentContainerMain.id, fragment)
        fragmentTransaction.commit()
    }
}
