package com.example.cby3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        Button explainBtn = findViewById(R.id.explain_btn);
        Button jumpBtn = findViewById(R.id.jump_btn);


        explainBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast helloToast = Toast.makeText(MainActivity.this,"Hello World",Toast.LENGTH_SHORT);
                helloToast.show();
            }
        });

        jumpBtn.setOnClickListener(this);
    }

    @Override
    protected void onResume() {
        super.onResume();
        if(getSupportActionBar() != null)
            getSupportActionBar().hide();
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(this, OtherActivity.class);
        startActivity(intent);
    }
}
