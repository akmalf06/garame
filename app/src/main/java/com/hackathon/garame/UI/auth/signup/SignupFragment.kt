package com.hackathon.garame.UI.auth.signup

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.hackathon.garame.databinding.FragmentSignupBinding

class SignupFragment : Fragment(), View.OnClickListener {

    private lateinit var _binding: FragmentSignupBinding
    private val binding get() = _binding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        _binding = FragmentSignupBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnSignup.setOnClickListener(this)
        binding.layout.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when(v){
            binding.btnSignup -> {

            }

            binding.layout -> {

            }
        }
    }

}