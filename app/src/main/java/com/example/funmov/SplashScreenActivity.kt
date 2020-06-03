package com.example.funmov

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.example.funmov.onboarding.OneboardingOneActivity


class SplashScreenActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        var handler = Handler()
        handler.postDelayed({
            val intent = Intent(this@SplashScreenActivity,
                OneboardingOneActivity::class.java) //intent untuk perpindahan dari satu activity ke activity lain
            startActivity(intent)
            finish()
        }, 5000) //waktu delay 5 detik
    }
}
