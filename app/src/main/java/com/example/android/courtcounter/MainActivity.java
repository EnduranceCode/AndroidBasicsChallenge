package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Update total score when Team scores three points
     */
    public void threePointsTeamA (View view) {
        scoreTeamA = scoreTeamA + 3;
        displayForTeamA(scoreTeamA);
    }

    /**
     * Update total score when Team scores two points
     */
    public void twoPointsTeamA (View view) {
        scoreTeamA = 2;
        displayForTeamA(scoreTeamA);
    }

    /**
     * Update total score when Team scores a free throw
     */
    public void freeThrowTeamA (View view) {
        scoreTeamA = 1;
        displayForTeamA(scoreTeamA);
    }
}