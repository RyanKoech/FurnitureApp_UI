package com.example.furnitureapp

import android.content.Context
import android.content.SharedPreferences

class SharedPref(context: Context) {

    companion object {
        val  NIGHT_MODE = "Night_Mode"
    }

    internal lateinit var sharedPref: SharedPreferences

    init {
        sharedPref = context.getSharedPreferences("filname", Context.MODE_PRIVATE)
    }

    fun setNightModeState(state: Boolean?){
        val editor: SharedPreferences.Editor = sharedPref.edit()
        editor.putBoolean(NIGHT_MODE, state!!)
        editor.commit()
    }

    fun getNightModeState() : Boolean? {
        return sharedPref.getBoolean(NIGHT_MODE, false)
    }
}