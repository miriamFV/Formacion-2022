package com.example.formacion2022.ui.splash

import android.content.Intent
import android.os.Bundle
import androidx.lifecycle.lifecycleScope
import com.example.formacion2022.common.BaseActivity
import com.example.formacion2022.databinding.ActivitySplashBinding
import com.example.formacion2022.ui.main.MainActivity
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class SplashActivity : BaseActivity() {

    private val binding : ActivitySplashBinding by lazy{
        ActivitySplashBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        lifecycleScope.launch {
            delay(2000)
            startActivity(Intent(this@SplashActivity, MainActivity::class.java))
        }
    }

}

