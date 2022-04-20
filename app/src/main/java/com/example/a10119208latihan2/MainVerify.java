package com.example.a10119208latihan2;
//20 april 2022, 10119208 Agung Segara Rizki IF5
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainVerify extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_verify);
    }
    public void tekanverify(View view){
        Intent intent = new Intent(this, MainVerifyCode.class);
        startActivity(intent);
    }
}