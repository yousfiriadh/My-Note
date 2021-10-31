package com.yousfi.mynotes.ui.activity

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.yousfi.mynotes.R

class SplashActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)


  //      supportActionBar!!.hide()
        Handler().postDelayed({
            startActivity(Intent(this@SplashActivity, NoteActivity::class.java))
            finish()

        }, 2000)
    }
}