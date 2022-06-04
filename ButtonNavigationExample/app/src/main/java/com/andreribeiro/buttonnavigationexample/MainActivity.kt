package com.andreribeiro.buttonnavigationexample

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {

    private lateinit var navHostFragment: NavHostFragment
    private lateinit var bottomNavigationView: BottomNavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupNavController()


    }

    private fun setupNavController() {

        bottomNavigationView = findViewById(R.id.bottomNavigationView)

        val navHostFragment =
            supportFragmentManager.findFragmentById(R.id.fragment) as NavHostFragment

        val navController = navHostFragment.navController

        val appbarCoonfiguration = AppBarConfiguration(setOf(R.id.firstFragment, R.id.secondFragment))

        setupActionBarWithNavController(navController, appbarCoonfiguration)

        bottomNavigationView.apply {
            setupWithNavController(navController)
        }
    }
}
