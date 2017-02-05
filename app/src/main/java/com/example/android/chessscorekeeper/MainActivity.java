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

    /**
     * checkmate for Player B
     * Player A gets one Point
     */
    public void winPlayerA(View v) {
        scorePlayerA += 1;
        displayForPlayerA(scorePlayerA);
    }

    /**
     * checkmate for Player A
     * Player B gets one point
     */
    public void winPlayerB(View v) {
        scorePlayerB += 1;
        displayForPlayerB(scorePlayerB);

    }

    /**
     * remis: both players get half a point
     */
    public void remis(View v) {
        scorePlayerA += .5;
        scorePlayerB += .5;
        displayForPlayerA(scorePlayerA);
        displayForPlayerB(scorePlayerB);
    }

    /**
     * resets both scores to zero
     */
    public void resetScore(View v) {
        scorePlayerA = 0;
        scorePlayerB = 0;
        displayForPlayerA(scorePlayerA);
        displayForPlayerB(scorePlayerB);

    }

    /**
     * Displays the given score for Player A.
     */
    public void displayForPlayerA(float score) {
        TextView scoreView = (TextView) findViewById(R.id.scorePlayerA);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Player B.
     */
    public void displayForPlayerB(float score) {
        TextView scoreView = (TextView) findViewById(R.id.scorePlayerB);
        scoreView.setText(String.valueOf(score));
    }

}
