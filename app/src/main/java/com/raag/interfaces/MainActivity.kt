package com.raag.interfaces

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.raag.interfaces.databinding.ActivityMainBinding
import com.raag.interfaces.interfases.Names

class MainActivity : AppCompatActivity(), Names {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val nameOne = getString(R.string.app_name)
        names(nameOne)

    }

    override fun names(name: String) {
        binding.mainText.text = name
    }
}