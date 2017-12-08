package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ImageView ballDisplay = (ImageView) findViewById (R.id.image_eightBall);

        final int[] ballArray = {
                R.drawable.ball1,
                R.drawable.ball2,
                R.drawable.ball3,
                R.drawable.ball4,
                R.drawable.ball5,
                R.drawable.ball6,
                R.drawable.ball7,
                R.drawable.ball8,
                R.drawable.ball9,
                R.drawable.ball10,
                R.drawable.ball11,
                R.drawable.ball12,
                R.drawable.ball13,
                R.drawable.ball14
        };

        Button askButton;
        askButton = (Button) findViewById(R.id.askButton);

        askButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Log.d ( "Magiceightball", "The ASK button was pressed!");

                Random randomNumberGenerator = new Random();
                int number;
                number = randomNumberGenerator.nextInt(14);

                ballDisplay.setImageResource(ballArray[number]);
            }
        });


    }
}
