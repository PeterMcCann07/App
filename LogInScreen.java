package com.example.app;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class LogInScreen extends AppCompatActivity {
    private
    Button Btn_Enter;
    Button Btn_Create;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);
        Btn_Enter = (Button) findViewById(R.id.Btn_Enter);
        Btn_Create = (Button) findViewById(R.id.Btn_Create);
        Btn_Enter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opendirectory();
            }
            });
        }
        public void opendirectory() {
            Intent intent7 = new Intent(this, directory.class);
            startActivity(intent7);
        }

}