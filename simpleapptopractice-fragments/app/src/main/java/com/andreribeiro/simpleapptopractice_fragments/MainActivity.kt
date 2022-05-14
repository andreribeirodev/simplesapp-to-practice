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
        binding.btnHome.setOnClickListener(this)
        binding.btnConsole.setOnClickListener(this)
        binding.btnGames.setOnClickListener(this)
    }

    override fun onClick(btn: View) {
        when (btn) {
            binding.btnHome -> {
                btn.setOnClickListener { setFragment(homeFragment) }
            }
            binding.btnConsole -> {
                btn.setOnClickListener { setFragment(consoleFragment) }
            }
            binding.btnGames -> {
                btn.setOnClickListener { setFragment(gameFragment) }
            }
        }
    }

    private fun setFragment(fragment: Fragment) {
        val fragmentTransaction = supportFragmentManager.beginTransaction()
        fragmentTransaction.replace(binding.fragmentContainerMain.id, fragment)
        fragmentTransaction.commit()
    }
}
