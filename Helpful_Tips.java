package com.example.app;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Helpful_Tips extends AppCompatActivity {
    private
    ImageButton imageButton3;
    TextView textView_Tip;
    Button  Btn_Helpful_Tip;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_helpful__tips);
        imageButton3 = (ImageButton) findViewById(R.id.imageButton3);
        textView_Tip = (TextView) findViewById(R.id.textView_Tip);
        Btn_Helpful_Tip = (Button) findViewById(R.id.Btn_Helpful_Tip);
        Random r = new Random();
        int i1 = r.nextInt(20);
        imageButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opendirectory();
            }


        });
        Btn_Helpful_Tip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                List<Integer> myNumbers = new ArrayList<>();
                Random rand = new Random();
                while (true) {
                    int number = rand.nextInt(3) + 1;
                    if (!myNumbers.contains(number)) {
                        myNumbers.add(number);

                        if (myNumbers.size() == 5)
                            break;
                    }
                }

                textView_Tip.setText(myNumbers.get(0));
                textView_Tip.setText(myNumbers.get(1));
                textView_Tip.setText(myNumbers.get(2));
                textView_Tip.setText(myNumbers.get(3));
                textView_Tip.setText(myNumbers.get(4));

            }




        });
    }
    public void opendirectory(){
        Intent intent4 = new Intent(this, directory.class);
        startActivity(intent4);
    }
}
