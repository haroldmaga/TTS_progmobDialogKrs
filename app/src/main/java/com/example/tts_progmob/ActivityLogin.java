package com.example.tts_progmob;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ActivityLogin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void GoLogin (View view){
        Intent intent = new Intent(ActivityLogin.this, HomeScreenAdmin.class);
        startActivity(intent);
    }
}
