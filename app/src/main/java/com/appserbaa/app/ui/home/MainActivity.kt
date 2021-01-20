package com.appserbaa.app.ui.home

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.appserbaa.app.R
import com.appserbaa.app.databinding.ActivityAuthBinding
import com.appserbaa.app.databinding.ActivityMainBinding
import com.appserbaa.app.ui.auth.AppserbaaAuth
import com.appserbaa.app.ui.auth.AuthActivity

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.buttonLogout.setOnClickListener{
            AppserbaaAuth.logout(this){
                startActivity(Intent(this, AuthActivity::class.java))
                finish()
            }
        }
    }
}