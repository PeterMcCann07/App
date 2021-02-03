package com.example.app;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class De_stress_timer extends AppCompatActivity {

    private
    ImageButton imageButton2;
    Button Btn_Breathe;
    ProgressBar pro_Bar;
    TextView txt_Timer;
    ImageView image_hold;
    ImageView image_inhale;
    ImageView image_Exhale;
    Handler mHandler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_de_stress_timer);
        image_inhale = (ImageView) findViewById(R.id.image_inhale);  //
        image_hold = (ImageView) findViewById(R.id.image_hold);     //These are images of the user breathing in and out
        image_Exhale = (ImageView) findViewById(R.id.imageExhale); //
        txt_Timer = (TextView) findViewById(R.id.txt_Timer);
        Btn_Breathe = (Button) findViewById(R.id.Btn_Breathe);
        imageButton2 = (ImageButton) findViewById(R.id.imageButton2);
        imageButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opendirectory();
            }
        });
        Btn_Breathe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Btn_Breathe.setEnabled(false); // this checks to see if the button has been pressed
                pro_Bar = findViewById(R.id.pro_Bar);
                CountDownTimer countDownTimer = new CountDownTimer(30000, 1000) { // this is a countdown timer
                    public void onTick(long millisUntilFinished) {
                        int secondsRemaining = (int) (millisUntilFinished / 1000);
                        pro_Bar.setProgress((int) (millisUntilFinished / 1000));
                        int progressPercentage = (secondsRemaining) * 10 / 3; // This checks to see how long is left and places it as a % in the progress bar
                        pro_Bar.setProgress(progressPercentage);

                        // TimerTask tt = new TimerTask() {
                        //   @Override
                        //  public void run() {
                        //    Btn_Breathe.setOnClickListener(new View.OnClickListener() {
                        //      @Override
                        //    public void onClick(View v) {
                        //  txt_Timer.setText("Inhale");
                        //  image_inhale.setVisibility(View.VISIBLE);
                        // image_Exhale.setVisibility(View.INVISIBLE);
                        // image_hold.setVisibility(View.INVISIBLE);

                        //   }
                        //    });
                        //}
                        //};
                        //  t.schedule(tt, 0, 1000);

                        // txt_Timer.setText("Hold");                   //need to add in a way to check timer and set new image plus text
                        //  image_hold.setVisibility(View.VISIBLE);
                        //  image_inhale.setVisibility(View.INVISIBLE);//


                        //  txt_Timer.setText("Exhale");
                        //  image_Exhale.setVisibility(View.VISIBLE);
                        //  image_inhale.setVisibility(View.INVISIBLE);
                        //  image_hold.setVisibility(View.INVISIBLE);

                    }

                    public void onFinish() {
                        txt_Timer.setText("Done!");
                        Btn_Breathe.setEnabled(true);
                    }
                }.start();

            }
            public void startRepeating(View v){
                mHandler.postDelayed(inhale,3000);
            }
            public void stopRepeating(View v){

            }
            private Runnable inhale = new Runnable() {
                @Override
                public void run() {

                    txt_Timer.setText("inhale");
                    image_inhale.setVisibility(View.VISIBLE);
                    image_Exhale.setVisibility(View.INVISIBLE);
                    image_hold.setVisibility(View.INVISIBLE);
                }

            };
        });
    }

    public void opendirectory() {
        Intent intent4 = new Intent(this, directory.class);
        startActivity(intent4);
    }
}