package com.example.layoutuebung;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.layoutuebung.layouts.Uebung1;
import com.example.layoutuebung.layouts.Uebung2;
import com.example.layoutuebung.layouts.Uebung3;
import com.example.layoutuebung.layouts.Uebung4;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       setClickListenerFor(R.id.button_uebung1, Uebung1.class);
       setClickListenerFor(R.id.button_uebung2, Uebung2.class);
       setClickListenerFor(R.id.button_uebung3, Uebung3.class);
       setClickListenerFor(R.id.button_uebung4, Uebung4.class);
    }

    private void setClickListenerFor(int buttonId, Class<? extends Activity> activity) {
        Button button = findViewById(buttonId);
        button.setOnClickListener((view) -> {
                    startActivity(new Intent(this, activity));
                }
        );
    }

}
