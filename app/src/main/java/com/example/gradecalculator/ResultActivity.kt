package com.example.gradecalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.gradecalculator.databinding.ActivityResultBinding

class ResultActivity : AppCompatActivity() {

    private val binding by lazy {
        ActivityResultBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val klg = intent.getFloatExtra("klg", 0f)
        val klu = intent.getFloatExtra("klu", 0f)
        val mg = intent.getFloatExtra("mg", 0f)
        val mu = intent.getFloatExtra("mu", 0f)
        val eg = intent.getFloatExtra("eg", 0f)
        val eu = intent.getFloatExtra("eu", 0f)

        val result = (klg * klu + mg * mu + eg * eu) / (klu + mu + eu)

        binding.resultTextView.text = "$result"
    }
}