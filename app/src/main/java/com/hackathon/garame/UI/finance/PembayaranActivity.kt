package com.hackathon.garame.UI.finance

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.hackathon.garame.databinding.ActivityPembayaranBinding

class PembayaranActivity : AppCompatActivity() {

    private lateinit var binding: ActivityPembayaranBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPembayaranBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}