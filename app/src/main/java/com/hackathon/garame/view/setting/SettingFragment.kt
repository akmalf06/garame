package com.hackathon.garame.view.setting

import android.content.Intent
import android.os.Bundle
import android.provider.Settings
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.hackathon.garame.R
import com.hackathon.garame.databinding.FragmentSettingBinding
import com.hackathon.garame.util.addFragmentSetting

class SettingFragment : Fragment(), View.OnClickListener {

    private lateinit var _binding: FragmentSettingBinding
    private val binding get() = _binding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        _binding = FragmentSettingBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        //setView

        binding.btnUbahBahasa.setOnClickListener(this)
        binding.btnUbahIdentitas.setOnClickListener(this)
        binding.btnUbahKoperasi.setOnClickListener(this)
        binding.btnTutupAkun.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when(v){
            binding.btnUbahBahasa -> {
                startActivity(Intent(Settings.ACTION_LOCALE_SETTINGS))
            }

            binding.btnUbahIdentitas -> {

            }

            binding.btnUbahKoperasi -> {
                val fragment = KoperasiFragment()
                val manager = activity?.supportFragmentManager
                activity?.addFragmentSetting(fragment, manager)
            }

            binding.btnTutupAkun -> {

            }
        }
    }
}