package com.example.funmov.onboarding

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.funmov.R
import com.example.funmov.sign.signin.SignInActivity
import kotlinx.android.synthetic.main.activity_oneboarding_three.*


class OneboardingThreeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_oneboarding_three)

        btn_home.setOnClickListener {
            finishAffinity()

            val intent = Intent(this@OneboardingThreeActivity,
                SignInActivity::class.java)
            startActivity(intent)
        }
    }
}
