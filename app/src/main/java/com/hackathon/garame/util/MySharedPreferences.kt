package com.hackathon.garame.util

import android.content.Context
import android.preference.PreferenceManager

class MySharedPreferences(val context: Context) {
    companion object{
        private const val FIRST_INSTALL = "first_install"
    }

    private val status = PreferenceManager.getDefaultSharedPreferences(context)

    var firstInstall = status.getBoolean(FIRST_INSTALL, false)
    set(value) = status.edit().putBoolean(FIRST_INSTALL, value).apply()
}