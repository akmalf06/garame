package com.hackathon.garame.UI.home

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.hackathon.garame.databinding.FragmentHomeBinding
import com.hackathon.garame.UI.setting.SettingActivity

class HomeFragment : Fragment(), View.OnClickListener {

    private lateinit var _binding: FragmentHomeBinding
    private val binding get() = _binding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        _binding = FragmentHomeBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnSetting.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when(v){
            binding.btnSetting -> {
                startActivity(Intent(context, SettingActivity::class.java))
            }
        }
    }
}