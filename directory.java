package com.example.app;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class directory extends AppCompatActivity {
    private
    Button Btn_TimeTable;
    Button Btn_Helpful;
    Button Btn_LogOut;
    Button Btn_DeStress;
    Button Btn_Profile;
    Button Btn_StudentS;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_directory);
        Btn_Helpful = (Button) findViewById(R.id.Btn_Helpful);
        Btn_Profile = (Button) findViewById(R.id.Btn_Profile);
        Btn_LogOut = (Button) findViewById(R.id.Btn_LogOut);
        Btn_DeStress = (Button) findViewById(R.id.Btn_DeStress);
        Btn_StudentS = (Button) findViewById(R.id.Btn_StudentS);
        Btn_TimeTable = (Button) findViewById(R.id.Btn_TimeTable);
        Btn_Helpful.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openHelpful_Tips();
            }
        });
        Btn_TimeTable.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                openTimeTable();

            }
        });
        Btn_LogOut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMainActivity6();
            }
        });
        Btn_DeStress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openDe_stress_timer();
            }
        });
        Btn_Profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openProfile_Page();
            }
        });
        Btn_StudentS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openStudent_R();
            }
        });
    }

    public void openTimeTable() {
        Intent intent2 = new Intent(this, TimeTable.class);
        startActivity(intent2);
    }

    public void openHelpful_Tips() {
        Intent intent3 = new Intent(this, Helpful_Tips.class);
        startActivity(intent3);
    }

    public void openMainActivity6() {
        Intent intent5 = new Intent(this, LogInScreen.class);
        startActivity(intent5);
    }

    public void openDe_stress_timer() {
        Intent intent6 = new Intent(this, De_stress_timer.class);
        startActivity(intent6);
    }

    public void openProfile_Page() {
        Intent intent10 = new Intent(this, Profile_Page.class);
        startActivity(intent10);
    }

    public void openStudent_R() {
        Intent intent12 = new Intent(this, Student_R.class);
        startActivity(intent12);
    }
}
