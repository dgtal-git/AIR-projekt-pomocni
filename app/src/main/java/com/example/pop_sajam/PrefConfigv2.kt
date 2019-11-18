package com.example.pop_sajam

import android.content.Context
import android.content.SharedPreferences
import android.widget.Toast

class PrefConfigv2(private val context: Context) {
    private val sharedPreferences: SharedPreferences

    init {
        sharedPreferences = context.getSharedPreferences(
            context.getString(R.string.pref_file),
            Context.MODE_PRIVATE
        )

    }

    // funkcija za pisanje login statusa
    fun writeLoginStatus(status: Boolean) {
        val editor = sharedPreferences.edit()
        editor.putBoolean(context.getString(R.string.pref_login_status), status)
    }

    fun readLoginStatus(): Boolean {
        return sharedPreferences.getBoolean(context.getString(R.string.pref_login_status), false)
    }

    fun writeName(name: String) {
        val editor = sharedPreferences.edit()
        editor.putString(context.getString(R.string.pref_user_name), name)
        editor.commit()
    }

    fun readName(): String {
;
        return sharedPreferences.getString(context.getString(R.string.pref_user_name), "User").toString()
    }

    fun displayToast(message: String) {
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show()
    }
}
