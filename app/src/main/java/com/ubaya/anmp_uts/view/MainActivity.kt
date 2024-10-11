package com.ubaya.anmp_uts.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.ubaya.anmp_uts.R
import com.ubaya.anmp_uts.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

}