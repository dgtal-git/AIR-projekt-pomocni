package com.example.pop_sajam;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class Test extends AppCompatActivity {
    public static PrefConfigv2 prefConfig;
    @Override
    protected void onCreate (Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        prefConfig = new PrefConfigv2(this);

        if(findViewById(R.id.fragment_container)!= null){
            if(savedInstanceState!=null){
                return;
            }
            if(prefConfig.readLoginStatus()){
                getSupportFragmentManager().beginTransaction().add(R.id.fragment_container, new WelcomeFragment()).commit();
            }else {
                getSupportFragmentManager().beginTransaction().add(R.id.fragment_container, new Prijava()).commit();
            }
        }
    }

}
