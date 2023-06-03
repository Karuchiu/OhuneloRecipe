package com.jesse.ohunelo.presentation.ui.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import com.jesse.ohunelo.R
import com.jesse.ohunelo.databinding.ActivityMainBinding
import dagger.hilt.android.AndroidEntryPoint
import timber.log.Timber

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        // Returns an instance of Splash Screen
        val splashScreen = installSplashScreen()
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        val navHost = supportFragmentManager.findFragmentById(R.id.ohunelo_fragment_container)
                as NavHostFragment
        val navController = navHost.navController
        binding.ohuneloBottomNav.setupWithNavController(navController)

        navController.addOnDestinationChangedListener{
            _, destination, _ ->
            when(destination.id){
                R.id.homeFragment -> { binding.ohuneloBottomNav.visibility = View.VISIBLE }
                else -> { binding.ohuneloBottomNav.visibility = View.GONE }
            }
        }
    }

    override fun onBackPressed() {
        super.onBackPressed()
        Timber.e("On Back pressed gets called!")
    }
}