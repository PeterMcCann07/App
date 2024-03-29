package com.example.app;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import androidx.viewpager2.widget.ViewPager2;

public class Student_R extends AppCompatActivity{
    private FragmentStateAdapter pagerAdapter;
    ViewPager2 viewPager;
    Button Btn_tud;
    ImageButton imageButton_back;
    private static final int NUM_PAGE = 4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student__r);
        viewPager = findViewById(R.id.pager4);
        pagerAdapter = new Student_R.Screens(this);
        viewPager.setAdapter(pagerAdapter);
       Btn_tud = findViewById(R.id.Btn_tud);
       Btn_tud.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                openTUD();
            }
        });
        imageButton_back = (ImageButton) findViewById(R.id.imageButton_Back);
        imageButton_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opendirectoy();
            }
        });
    }
        public void opendirectoy () {
            Intent intent11 = new Intent(this, directory.class);
            startActivity(intent11);
        }
    public void openTUD() {
        Intent intentTUD = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.tudublin.ie/for-students/student-services-and-support/student-wellbeing/student-health-centres/"));
        startActivity(intentTUD);
    }

    private static class Screens extends FragmentStateAdapter {
        public Screens(FragmentActivity fa) {
            super(fa);
        }

        @Override
        public Fragment createFragment(int position) {
            switch (position){
                case 0:
                    return new Student_R_Main();
                case 1:
                    return new Student_R_Study();
                case 2:
                    return new Student_R_MH();
                case 3:
                    return new Student_R_PH();
            }
            return null;
        }

        @Override
        public int getItemCount() {
            return NUM_PAGE;
        }
    }

}
