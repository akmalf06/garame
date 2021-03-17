package com.hackathon.garame.UI.setting.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.hackathon.garame.databinding.FragmentKoperasiBinding

class KoperasiFragment : Fragment(), View.OnClickListener {

    private lateinit var _binding: FragmentKoperasiBinding
    private val binding get() = _binding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,savedInstanceState: Bundle?): View? {
        _binding = FragmentKoperasiBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.imgBack.setOnClickListener(this)
        binding.btnUbah.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when(v){
            binding.imgBack -> {
                activity?.onBackPressed()
            }

            binding.btnUbah -> {

            }
        }
    }
}