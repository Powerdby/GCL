package com.example.gradecalculator

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.gradecalculator.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.resultButton.setOnClickListener {
            if (binding.krlangrade.text.isNotBlank() && binding.krlanunit.text.isNotBlank() && binding.mathgrade.text.isNotBlank() && binding.mathunit.text.isNotBlank()
                && binding.enggrade.text.isNotBlank() && binding.engunit.text.isNotBlank()) {
                val intent = Intent(this, ResultActivity::class.java).apply {
                    putExtra("klg", binding.krlangrade.text.toString().toFloat())
                    putExtra("klu", binding.krlanunit.text.toString().toFloat())
                    putExtra("mg", binding.mathgrade.text.toString().toFloat())
                    putExtra("mu", binding.mathunit.text.toString().toFloat())
                    putExtra("eg", binding.enggrade.text.toString().toFloat())
                    putExtra("eu", binding.engunit.text.toString().toFloat())
                }
                startActivity(intent)
            }


        }
    }
}