package com.hackathon.garame.model.auth

data class DataUser(
    val id: String? = null,
    val nama: String? = null,
    val email: String? = null,
    val kota: String? = null,
    val kecamatan: String? = null,
    val koperasi: String? = null,
    val nomor_telepon: String? = null,
    val kata_sandi: String? = null
)