package com.example.lab4_4

import android.content.Intent
import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import com.example.lab4_4.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.bnToFirst.setOnClickListener { finish() }
        binding.bnToThird.setOnClickListener { toThird() }
        binding.navView.setOnItemSelectedListener { toAbout(it) }
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }

    private fun toThird() {
        startActivity(Intent(this, ThirdActivity::class.java))
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