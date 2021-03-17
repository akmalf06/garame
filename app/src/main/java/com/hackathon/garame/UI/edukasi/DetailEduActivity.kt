package com.hackathon.garame.UI.edukasi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.hackathon.garame.databinding.ActivityDetailEduBinding

class DetailEduActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDetailEduBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailEduBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}