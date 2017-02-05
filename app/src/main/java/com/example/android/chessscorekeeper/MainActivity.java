package com.example.android.chessscorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    float scorePlayerA = 0;
    float scorePlayerB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void winPlayerA(View v) {
        scorePlayerA += 1;
        displayForPlayerA(scorePlayerA);
    }

    public void winPlayerB(View v) {
        scorePlayerB += 1;
        displayForPlayerB(scorePlayerB);

    }

    public void remis(View v) {
        scorePlayerA += .5;
        scorePlayerB += .5;
        displayForPlayerA(scorePlayerA);
        displayForPlayerB(scorePlayerB);
    }

    public void resetScore(View v) {
        scorePlayerA = 0;
        scorePlayerB = 0;
        displayForPlayerA(scorePlayerA);
        displayForPlayerB(scorePlayerB);

    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForPlayerA(float score) {
        TextView scoreView = (TextView) findViewById(R.id.scorePlayerA);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForPlayerB(float score) {
        TextView scoreView = (TextView) findViewById(R.id.scorePlayerB);
        scoreView.setText(String.valueOf(score));
    }

}
