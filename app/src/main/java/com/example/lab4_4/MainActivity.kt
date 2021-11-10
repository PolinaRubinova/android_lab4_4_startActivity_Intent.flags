package com.example.lab4_4

import android.content.Intent
import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import com.example.lab4_4.databinding.ActivityFirstBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding = ActivityFirstBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.bnToSecond.setOnClickListener { toSecond() }
        binding.navView.setOnItemSelectedListener { toAbout(it) }
    }

    private fun toSecond() {
        startActivity(Intent(this, SecondActivity::class.java))
    }

    private fun toAbout(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.menu_about -> {
                startActivity(Intent(this, AboutActivity::class.java))
            }
        }
        return false
    }
}