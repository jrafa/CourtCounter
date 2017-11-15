package com.example.android.scorekeeper;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    private static final String STATE_SCORE_A = "scoreA";
    private static final String STATE_SCORE_B = "scoreB";
    private int scoreTeamA = 0;
    private int scoreTeamB = 0;
    private TextView counterTeamA;
    private TextView counterTeamB;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (savedInstanceState != null) {
            scoreTeamA = savedInstanceState.getInt(STATE_SCORE_A);
            scoreTeamB = savedInstanceState.getInt(STATE_SCORE_B);
        }

        counterTeamA = (TextView) findViewById(R.id.team_a_score);
        counterTeamA.setText(Integer.toString(scoreTeamA));

        counterTeamB = (TextView) findViewById(R.id.team_b_score);
        counterTeamB.setText(Integer.toString(scoreTeamB));

    }

    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);

        outState.putInt(STATE_SCORE_A, scoreTeamA);
        outState.putInt(STATE_SCORE_B, scoreTeamB);
    }

    /**
     * Display points for team A.
     */
    public void displayForTeamA(int score) {
        counterTeamA.setText(String.valueOf(score));
    }

    /**
     * Display points for team B.
     */
    public void displayForTeamB(int score) {
        counterTeamB.setText(String.valueOf(score));
    }

    /**
     * Increase score team A by 6 points.
     */
    public void addSixPointsTeamA(View view) {
        scoreTeamA += 6;
        displayForTeamA(scoreTeamA);
    }

    /**
     * Increase score team A by 3 points.
     */
    public void addThreePointsTeamA(View view) {
        scoreTeamA += 3;
        displayForTeamA(scoreTeamA);
    }

    /**
     * Increase score team A by 2 points.
     */
    public void addTwoPointsTeamA(View view) {
        scoreTeamA += 2;
        displayForTeamA(scoreTeamA);
    }

    /**
     * Increase score team A by 1 point.
     */
    public void addOnePointTeamA(View view) {
        scoreTeamA += 1;
        displayForTeamA(scoreTeamA);
    }

    /**
     * Increase score team B by 6 points.
     */
    public void addSixPointsTeamB(View view) {
        scoreTeamB += 6;
        displayForTeamB(scoreTeamB);
    }

    /**
     * Increase score team B by 3 points.
     */
    public void addThreePointsTeamB(View view) {
        scoreTeamB += 3;
        displayForTeamB(scoreTeamB);
    }

    /**
     * Increase score team B by 2 points.
     */
    public void addTwoPointsTeamB(View view) {
        scoreTeamB += 2;
        displayForTeamB(scoreTeamB);
    }

    /**
     * Increase score team B by 1 point.
     */
    public void addOnePointTeamB(View view) {
        scoreTeamB += 1;
        displayForTeamB(scoreTeamB);
    }

    /**
     * Reset points in team A and B.
     */
    public void reset(View view) {
        scoreTeamA = scoreTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }
}
