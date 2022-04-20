package com.example.a10119208latihan2;
//19 april 2022, if5 agung segara rizki 10119208
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void tekanDaftar(View view){
        Intent intent = new Intent(this, MainRegister.class);
        startActivity(intent);
    }
}