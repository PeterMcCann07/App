package com.example.app;

import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.preference.PreferenceManager;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import androidx.viewpager2.widget.ViewPager2;

import com.google.android.material.tabs.TabLayout;
import com.google.android.material.textfield.TextInputEditText;

import java.util.Objects;

public class Day_Planner extends AppCompatActivity  {
    private
    ImageButton imageButton;
    TabLayout tabLayout1;
    ViewPager2 viewPager;
    Button Btn_save;
    Button Btn_TT;
    String st;
    FragmentStateAdapter pagerAdapter;
    TextInputEditText editText,editText44,editText4,editText2,editText3,editText5,
            editText8,editText7,editText11,editText12,textInputEditText2;
    private static final int NUM_PAGES = 5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_ADJUST_PAN);
        setContentView(R.layout.activity_time_table);



        editText = (TextInputEditText) findViewById(R.id.editText);
        editText44 =  findViewById(R.id.editText44);
        editText4 = (TextInputEditText) findViewById(R.id.editText4);
        editText2 = (TextInputEditText) findViewById(R.id.editText2);
        editText3 = (TextInputEditText) findViewById(R.id.editText3);
        editText5 = (TextInputEditText) findViewById(R.id.editText5);
        editText8 = (TextInputEditText) findViewById(R.id.editText8);
        editText7 = (TextInputEditText) findViewById(R.id.editText7);
        editText11 = (TextInputEditText) findViewById(R.id.editText11);
        editText12 = (TextInputEditText) findViewById(R.id.editText12);
        textInputEditText2 = (TextInputEditText) findViewById(R.id.textInputEditText2);

        SharedPreferences preference = PreferenceManager.getDefaultSharedPreferences(this);
        String st1 = preference.getString("st","");
        //editText44.setText(st1);


        viewPager = findViewById(R.id.pager1);
        pagerAdapter = new Screens(this);
        viewPager.setAdapter(pagerAdapter);
        tabLayout1 = findViewById(R.id.tabLayout1);

        Btn_TT = findViewById(R.id.Btn_TT);
        Btn_TT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openTestTUDublin();
            }
        });
        Btn_save = findViewById(R.id.Btn_save);
        Btn_save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { ;
               st = Objects.requireNonNull(editText44.getText()).toString();

                SharedPreferences preference = PreferenceManager.getDefaultSharedPreferences(Day_Planner.this);
                SharedPreferences.Editor edit = preference.edit();
                edit.putString("st",st);
              edit.apply();
          }


        });
        Btn_save.setOnClickListener(new View.OnClickListener() {
              @Override
              public void onClick(View v) {
                  CountDownTimer start = new CountDownTimer(5000, 1000) {
                      @Override
                      public void onTick(long millisUntilFinished) {
                          Btn_save.setEnabled(false);

                      }

                      @Override
                      public void onFinish() {
                          Btn_save.setEnabled(true);
                      }
                  }.start();

              }


        });






        imageButton = findViewById(R.id.imageButton);
        imageButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                opendirectory();
            }
        });

    }

    public void opendirectory() {
        Intent intent4 = new Intent(this, directory.class);
        startActivity(intent4);
    }

    private static class Screens extends FragmentStateAdapter {
        public Screens(FragmentActivity fa) {
            super(fa);
        }


        @Override
        public Fragment createFragment(int position) {
            switch (position) {
                case 0:

                    return new tab_Mon();
                case 1:

                    return new tab_Tue();
                case 2:

                    return new tab_Wed();
                case 3:
                    return new tab_Thur();
                case 4:

                    return new tab_Fri();
            }
            return null;
        }

        @Override
        public int getItemCount() {

            return NUM_PAGES;
        }



    }
    public void openTestTUDublin() {
        Intent intentTU = new Intent(Intent.ACTION_VIEW, Uri.parse("https://timetables.dit.ie/Web/Timetable"));
        startActivity(intentTU);
    }
}








