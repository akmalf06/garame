package com.hackathon.garame.helper

import android.annotation.SuppressLint
import android.content.Context
import android.content.SharedPreferences

class SessionManager (val context: Context){
    var pref: SharedPreferences? = null
    var editor: SharedPreferences.Editor? = null
    var PREF_NAME = "SESSION"

    var IS_LOGIN = "isLogin"
    var NAMA = "nama"
    var NIK = "nik"
    var KOTA = "kota"
    var KOPERASI = "koperasi"
    var HP = "hp"

    init {
        pref = context.getSharedPreferences(PREF_NAME, 0)
        editor = pref?.edit()
    }

    var login: Boolean?
    get() = pref?.getBoolean(IS_LOGIN, false)
    set(login){
        editor?.putBoolean(IS_LOGIN, true)
        editor?.commit()
    }

    var nama: String?
    get() = pref?.getString(NAMA, "")
    set(nama){
        editor?.putString(NAMA, nama)
        editor?.commit()
    }

    var nik: String?
        get() = pref?.getString(NIK, "")
        set(nik){
            editor?.putString(NIK, nik)
            editor?.commit()
        }

    var kota: String?
        get() = pref?.getString(KOTA, "")
        set(kota){
            editor?.putString(KOTA, kota)
            editor?.commit()
        }

    var koperasi: String?
        get() = pref?.getString(KOPERASI, "")
        set(koperasi){
            editor?.putString(KOPERASI, koperasi)
            editor?.commit()
        }

    var hp: String?
        get() = pref?.getString(HP, "")
        set(hp){
            editor?.putString(HP, hp)
            editor?.commit()
        }

    fun logout(){
        editor?.clear()
        editor?.commit()
    }
}