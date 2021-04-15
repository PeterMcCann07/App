 package com.example.app;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class Helpful_Tips extends AppCompatActivity {
    private
    ImageButton imageButton3;
    TextView textView_Tip;
    TextView textView_Description;
    Button  Btn_Helpful_Tip;
    int i;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_helpful__tips);
        imageButton3 = findViewById(R.id.imageButton3);
        textView_Description = findViewById(R.id.textView_Description);
        Btn_Helpful_Tip = findViewById(R.id.Btn_Helpful_Tip);
        Random rand = new Random();
        imageButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opendirectory();
            }


        });
        Btn_Helpful_Tip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Integer[] intArray = {1,2,3,4,5,6,7,8,9};
               //List<Integer> intList = Arrays.asList(intArray);

               //Collections.shuffle(Collections.singletonList(intList));
               // intList.toArray(intArray);

              //  textView_Tip.setText(intArray[0]);
               int Choice = rand.nextInt(19)+1;
               if ( Choice == 1  ) {

                   textView_Description.setText("'Helpful tip place holder 1'");

                }
                if ( Choice ==2 ) {
                    textView_Description.setText("'Helpful tip place holder 2'");
                }
               if ( Choice == 3 ) {
                    textView_Description.setText("'Helpful tip place holder 3'");

                }
                if ( Choice == 4 ) {
                    textView_Description.setText("'Helpful tip place holder 4'");
                }
               if ( Choice == 5 ) {
                   textView_Description.setText("'Helpful tip place holder 5'");
               }
               if ( Choice == 6 ) {
                   textView_Description.setText("'Helpful tip place holder 6'");

               }
                if ( Choice == 7 ) {
                   textView_Description.setText("'Helpful tip place holder 7'");
               }
                if ( Choice == 8 ) {
                   textView_Description.setText("'Helpful tip place holder 8'");
               }
                if ( Choice ==9  ) {
                   textView_Description.setText("'Helpful tip place holder 9'");

               }
                if ( Choice == 10  ) {
                   textView_Description.setText("'Helpful tip place holder 10'");

               }
               if ( Choice == 11  ) {
                   textView_Description.setText("'Helpful tip place holder 10'");
               }
                if ( Choice == 12  ) {
                   textView_Description.setText("'Helpful tip place holder 11'");
               }
               if (Choice == 13 ) {
                   textView_Description.setText("'Helpful tip place holder 12'");

               }
               if ( Choice == 14  ) {
                   textView_Description.setText("'Helpful tip place holder 14'");
               }
               if (Choice == 15  ) {
                   textView_Description.setText("'Helpful tip place holder 15'");
               }
               if ( Choice == 16  ) {
                   textView_Description.setText("'Helpful tip place holder 16'");

               }
                if (Choice == 17  ) {
                   textView_Description.setText("'Helpful tip place holder 17'");
               }
                if ( Choice ==18 ) {
                   textView_Description.setText("'Helpful tip place holder 18'");
               }
                if ( Choice == 19 ) {
                   textView_Description.setText("'Helpful tip place holder 19'");

               }
                if ( Choice == 20 ) {
                   textView_Description.setText("'Helpful tip place holder 20'");
               }
            }

            private void textView_Tip(Integer integer) {
            }
        });
    }


    public void opendirectory(){
        Intent intent4 = new Intent(this, directory.class);
        startActivity(intent4);
    }
}
