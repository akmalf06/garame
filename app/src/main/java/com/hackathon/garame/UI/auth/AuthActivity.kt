package com.hackathon.garame.UI.auth

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.hackathon.garame.R
import com.hackathon.garame.databinding.ActivityAuthBinding
import com.hackathon.garame.UI.auth.signup.SignupFragment

class AuthActivity : AppCompatActivity() {

    private lateinit var binding: ActivityAuthBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAuthBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val fragment = SignupFragment()
        addFragment(fragment)
    }

    private fun addFragment(fragment: Fragment){
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.frame_auth, fragment, fragment::class.java.simpleName)
            addToBackStack(null)
            commit()
        }
    }
}