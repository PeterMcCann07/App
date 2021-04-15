 package com.example.app;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class LogInScreen extends AppCompatActivity {
    private
    Button Btn_Enter;
    Button Btn_Create;
    EditText editTextTextEmailAddress, editTextTextPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);

        Btn_Enter = (Button) findViewById(R.id.Btn_Enter);
        Btn_Create = (Button) findViewById(R.id.Btn_Create);
        editTextTextEmailAddress = findViewById(R.id.editTextTextEmailAddress);
        editTextTextPassword = findViewById(R.id.editTextTextPassword);
        Btn_Create.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                openregister();
            }
        });

        Btn_Enter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String femail = editTextTextEmailAddress.getText().toString();
                String fpassword = editTextTextPassword.getText().toString();
                opendirectory();
            }
        });
    }

        public void opendirectory() {
            Intent intent7 = new Intent(this, directory.class);
            startActivity(intent7);
        }
    public void openregister() {
        Intent intent15 = new Intent(this, register.class);
        startActivity(intent15);
    }
}