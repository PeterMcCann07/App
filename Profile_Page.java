package com.example.app;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class Profile_Page extends AppCompatActivity {
ImageButton imageBtn_Back;
ImageButton image_Btn_Profile;
Image Profile_Pic;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile__page);
        imageBtn_Back = (ImageButton) findViewById(R.id.imageBtn_Back);
        image_Btn_Profile = (ImageButton) findViewById(R.id.image_Btn_Profile);

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
    }
    public void opendirectory(){
        Intent intent11 = new Intent(this, directory.class);
        startActivity(intent11);
    }
}
