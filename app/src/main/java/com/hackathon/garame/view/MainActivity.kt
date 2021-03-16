package com.hackathon.garame.view

import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.hackathon.garame.R
import com.hackathon.garame.databinding.ActivityMainBinding
import com.hackathon.garame.util.addFragment
import com.hackathon.garame.view.edukasi.EdukasiFragment
import com.hackathon.garame.view.finance.FinanceFragment
import com.hackathon.garame.view.home.HomeFragment

class MainActivity : AppCompatActivity(), BottomNavigationView.OnNavigationItemSelectedListener {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val fragment = HomeFragment()
        val manager = supportFragmentManager
        addFragment(fragment, manager)

        binding.navBottom.setOnNavigationItemSelectedListener(this)
    }


    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        return when(item.itemId){
            R.id.menu_home -> {
                val fragment = HomeFragment()
                val manager = supportFragmentManager
                addFragment(fragment, manager)
                true
            }

            R.id.menu_edu -> {
                val fragment = EdukasiFragment()
                val manager = supportFragmentManager
                addFragment(fragment, manager)
                true
            }

            R.id.menu_finance -> {
                val fragment = FinanceFragment()
                val manager = supportFragmentManager
                addFragment(fragment, manager)
                true
            }

            else -> false
        }
    }

}