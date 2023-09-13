package com.sec.doctorapp


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.window.SplashScreen
import android.window.SplashScreenView
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.ui.NavigationUI.setupWithNavController
import com.sec.doctorapp.auth.AuthActivity
import com.sec.doctorapp.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var navController: NavController
        override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        installSplashScreen()
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
            navController=Navigation.findNavController(this,R.id.fragment_container_view_main)
            setupWithNavController(binding.bottomNavView, navController)

//        finish()

//        startActivity(Intent(this, AuthActivity::class.java))



    }
}