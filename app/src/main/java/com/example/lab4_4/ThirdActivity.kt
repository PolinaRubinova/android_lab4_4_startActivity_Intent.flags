package com.example.lab4_4

import android.content.Intent
import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import com.example.lab4_4.databinding.ActivityThirdBinding

class ThirdActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityThirdBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.bnToFirst.setOnClickListener { toFirst() }
        binding.bnToSecond.setOnClickListener { finish() }
        binding.navView.setOnItemSelectedListener { toAbout(it) }
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }

    private fun toFirst() {
        val intent = Intent(this, MainActivity::class.java)
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP)
        startActivity(intent)
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