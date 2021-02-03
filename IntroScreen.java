package com.example.app;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class IntroScreen extends AppCompatActivity {
    private Button Btn_Button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Btn_Button = (Button) findViewById(R.id.Btn_Button);
        Btn_Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMainActivity6();
            }
        });
    }

    public void openMainActivity6() {
        Intent intent = new Intent(this, LogInScreen.class);
        startActivity(intent);
    }
}