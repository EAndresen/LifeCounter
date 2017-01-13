package com.example.erica.lifecounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static com.example.erica.lifecounter.R.id.playerOneAdd1;
import static com.example.erica.lifecounter.R.id.playerOneSub1;
import static com.example.erica.lifecounter.R.id.playerTwoAdd1;
import static com.example.erica.lifecounter.R.id.playerTwoSub1;

public class MainActivity extends AppCompatActivity {

    TextView playerOneHealth;
    TextView playerTwoHealth;

    int intPlayerOneHealth = 20;
    int intPlayerTwoHealth = 20;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        playerOneHealth = (TextView) findViewById(R.id.playerOneHealth);
        playerTwoHealth = (TextView) findViewById(R.id.playerTwoHealth);

        Button playerOneAddHealthBtn = (Button) findViewById(playerOneAdd1);
        Button playerOneSubHealthBtn = (Button) findViewById(playerOneSub1);
        Button playerTwoAddHealthBtn = (Button) findViewById(playerTwoAdd1);
        Button playerTwoSubHealthBtn = (Button) findViewById(playerTwoSub1);

        playerOneAddHealthBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intPlayerOneHealth += 1;
                playerOneHealth.setText(intPlayerOneHealth + "");
            }
        });

        playerOneSubHealthBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intPlayerOneHealth -= 1;
                playerOneHealth.setText(intPlayerOneHealth + "");
            }
        });

        playerTwoAddHealthBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intPlayerTwoHealth += 1;
                playerTwoHealth.setText(intPlayerTwoHealth + "");
            }
        });

        playerTwoSubHealthBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intPlayerTwoHealth -= 1;
                playerTwoHealth.setText(intPlayerTwoHealth + "");
            }
        });


    }


}

