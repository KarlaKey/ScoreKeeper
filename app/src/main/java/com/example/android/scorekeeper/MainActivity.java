package com.example.android.scorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreTeamFinn = 0;
    int scoreTeamLotta = 0;

    /**
     * Stores values for global variables between different activities
     */

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt(getString(R.string.scoreTeamFinn), scoreTeamFinn);
        outState.putInt(getString(R.string.scoreTeamLotta), scoreTeamLotta);

        // call superclass to save any view hierarchy
        super.onSaveInstanceState(outState);

    }
    /**
     * Restore values for global variables between different activities
     */

    @Override
    public void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        scoreTeamFinn = savedInstanceState.getInt(getString(R.string.scoreTeamFinn));
        displayForTeamFinn(scoreTeamFinn);
        scoreTeamLotta = savedInstanceState.getInt(getString(R.string.scoreTeamLotta));
        displayForTeamLotta(scoreTeamLotta);

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void addthreePointsFinn (View view) {
        scoreTeamFinn = scoreTeamFinn +3;
        displayForTeamFinn (scoreTeamFinn);
    }

    public void addtwoPointsFinn (View view){
        scoreTeamFinn = scoreTeamFinn +2;
        displayForTeamFinn (scoreTeamFinn);
    }

    public void addonePointFinn (View view){
        scoreTeamFinn = scoreTeamFinn +1;
        displayForTeamFinn(scoreTeamFinn);
    }
    public void deleteOnePointFinn (View view){
        scoreTeamFinn = scoreTeamFinn -1;
        displayForTeamFinn(scoreTeamFinn);
    }
    /**

     * Displays the given score for Finn.

     */
    public void displayForTeamFinn(int score) {

        TextView scoreView = (TextView) findViewById(R.id.team_Finn_score);
        scoreView.setText(String.valueOf(score));
    }

    public void addthreePointsLotta (View view) {
        scoreTeamLotta = scoreTeamLotta +3;
        displayForTeamLotta (scoreTeamLotta);
    }
    public void addtwoPointsLotta (View view){
        scoreTeamLotta = scoreTeamLotta +2;
        displayForTeamLotta (scoreTeamLotta);
    }
    public void addonePointLotta (View view){
        scoreTeamLotta = scoreTeamLotta +1;
        displayForTeamLotta(scoreTeamLotta);
    }
    public void deleteOnePointLotta (View view){
        scoreTeamLotta = scoreTeamLotta -1;
        displayForTeamLotta(scoreTeamLotta);
    }
    /**
     * Displays the given score for Lotta.
     */
    public void displayForTeamLotta(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_Lotta_score);
        scoreView.setText(String.valueOf(score));
    }
    /**
     * Reset scores
     */
    public void resetScore (View view) {
        scoreTeamFinn = 0;
        scoreTeamLotta = 0;
        displayForTeamFinn(scoreTeamFinn);
        displayForTeamLotta(scoreTeamLotta);

    }



}
