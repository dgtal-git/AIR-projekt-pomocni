package com.example.pop_sajam;

import android.content.Context;
import android.content.SharedPreferences;

public class PrefConfigv2 {
    private SharedPreferences sharedPreferences;
    private Context context;

    public PrefConfigv2 (Context context){
        this.context = context;
        sharedPreferences = context.getSharedPreferences(context.getString(R.string.pref_file),Context.MODE_PRIVATE);

    }
    // funckija za pisanje login statusa
    public void writeLoginStatus(boolean status){
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putBoolean(context.getString(R.string.pref_login_status),status);
    }
}
