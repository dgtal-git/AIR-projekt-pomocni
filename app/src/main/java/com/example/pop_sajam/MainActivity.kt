package com.example.pop_sajam

import android.os.Bundle
import android.view.View

import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        prefConfig = PrefConfigv2(this)

        if (findViewById<View>(R.id.fragment_container) != null) {
            if (savedInstanceState != null) {
                return
            }
            if (prefConfig.readLoginStatus()) {
                supportFragmentManager.beginTransaction()
                    .add(R.id.fragment_container, WelcomeFragment()).commit()
            } else {
                supportFragmentManager.beginTransaction().add(R.id.fragment_container, Prijava())
                    .commit()
            }
        }
    }

    companion object {
        lateinit var prefConfig:PrefConfigv2;
    }

}
