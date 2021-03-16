package com.hackathon.garame.view.setting

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import com.hackathon.garame.R
import com.hackathon.garame.databinding.ActivitySettingBinding
import com.hackathon.garame.util.addFragment
import com.hackathon.garame.util.addFragmentSetting
import kotlinx.android.synthetic.main.activity_setting.view.*

class SettingActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySettingBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySettingBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val fragment = SettingFragment()
        val manager = supportFragmentManager
        fragment(fragment, manager)


    }

    private fun fragment(fragment: Fragment, manager: FragmentManager?){
        manager?.beginTransaction()?.apply {
            replace(R.id.frame_setting, fragment, fragment::class.java.simpleName)
            commit()
        }
    }
}