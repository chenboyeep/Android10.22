package com.example.cby3;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class OtherActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_other);
    }

    void jumpBack(View v) {
        Intent intent  = new Intent(this,MainActivity.class);
        startActivity(intent);
    }
}
