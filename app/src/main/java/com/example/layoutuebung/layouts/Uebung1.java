package com.example.layoutuebung.layouts;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.layoutuebung.R;

public class Uebung1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_uebung_1);
        getSupportActionBar().setTitle("Aufgabe 1");
    }
}
