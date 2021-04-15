package com.example.app;

import android.content.Intent;
import android.content.SharedPreferences;
import android.media.Image;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Objects;

public class Profile_Page extends AppCompatActivity {
ImageButton imageBtn_Back;
ImageButton image_Btn_Profile;
Image Profile_Pic;
EditText editTextTextPersonName,editTextTextPersonName3,editTextTextPersonName6,editTextTextPersonName4;
   Button save_BTN;
    String st;
    String st1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile__page);
        imageBtn_Back = (ImageButton) findViewById(R.id.imageBtn_Back);
        image_Btn_Profile = (ImageButton) findViewById(R.id.image_Btn_Profile);
        editTextTextPersonName = findViewById(R.id.editTextTextPersonName);
        editTextTextPersonName3 = findViewById(R.id.editTextTextPersonName3);
        editTextTextPersonName6 = findViewById(R.id.editTextTextPersonName6);
        editTextTextPersonName4 = findViewById(R.id.editTextTextPersonName4);

        SharedPreferences preference = PreferenceManager.getDefaultSharedPreferences(this);
        String st1 = preference.getString("st","");
        editTextTextPersonName.setText(st1);
        String st2 = preference.getString("st1","");
        editTextTextPersonName3.setText(st2);
        String st3 = preference.getString("st2","");
        editTextTextPersonName6.setText(st3);
        String st4 = preference.getString("st3","");
        editTextTextPersonName4.setText(st4);


        save_BTN = (Button)findViewById(R.id.save_BTN) ;
        imageBtn_Back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opendirectory();
            }
        });
        image_Btn_Profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            }

        });
        save_BTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    st = Objects.requireNonNull(editTextTextPersonName.getText()).toString();
                    st = Objects.requireNonNull(editTextTextPersonName3.getText()).toString();
                    st = Objects.requireNonNull(editTextTextPersonName6.getText()).toString();
                    st = Objects.requireNonNull(editTextTextPersonName4.getText()).toString();

                    SharedPreferences preference = PreferenceManager.getDefaultSharedPreferences(Profile_Page.this);
                    SharedPreferences.Editor edit = preference.edit();

                    edit.putString("st", st);

                    edit.putString("st1", st);

                    edit.putString("st2", st);

                    edit.putString("st3", st);
                    edit.apply();
                }

        });
}
    public void opendirectory(){
        Intent intent11 = new Intent(this, directory.class);
        startActivity(intent11);
    }
}
