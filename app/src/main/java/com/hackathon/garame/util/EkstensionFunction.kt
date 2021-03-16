package com.hackathon.garame.util

import android.app.Activity
import android.content.Intent
import android.view.View
import android.widget.ProgressBar
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import com.hackathon.garame.R

fun Activity.addFragment(fragment: Fragment, supportFragmentManager: FragmentManager?){
    supportFragmentManager?.beginTransaction()?.apply {
        replace(R.id.frame_main, fragment, fragment::class.java.simpleName)
        addToBackStack(null)
        commit()
    }
}

fun Activity.addFragmentSetting(fragment: Fragment, supportFragmentManager: FragmentManager?){
    supportFragmentManager?.beginTransaction()?.apply {
        replace(R.id.frame_setting, fragment, fragment::class.java.simpleName)
        addToBackStack(null)
        commit()
    }
}

fun Activity.progressBar(active: Boolean, progress: ProgressBar){
    if (active) progress.visibility = View.VISIBLE
    else progress.visibility = View.GONE
}