package com.atay.kg.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import static com.atay.kg.courtcounter.R.id.TeamScore;

public class MainActivity extends AppCompatActivity {
        int TotalScore;
        int TotalScoreB;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(0);
    }

    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.TeamScore);
        scoreView.setText(String.valueOf(score));
    }
    public void displayForTeamB(int score) {
        TextView scoreBView = (TextView) findViewById(R.id.TeamScoreB);
        scoreBView.setText(String.valueOf(score));
    }



    public void IncludePoint3ForA(View view) {
        TotalScore = TotalScore + 3;
        displayForTeamA(TotalScore);
    }

    public void IncludePoint2ForA(View view) {
        TotalScore = TotalScore + 2;
        displayForTeamA(TotalScore);
    }

    public void FreeThrow(View view) {
        TotalScore = TotalScore + 1;
        displayForTeamA(TotalScore);
    }

    public void IncludePoint3ForB(View view) {
        TotalScoreB = TotalScoreB + 3;
        displayForTeamB(TotalScoreB);
    }

    public void IncludePoint2ForB(View view) {
        TotalScoreB = TotalScoreB + 3;
        displayForTeamB(TotalScoreB);
    }

    public void FreeThrow2(View view) {
        TotalScoreB = TotalScoreB + 3;
        displayForTeamB(TotalScoreB);


    }

    public void RENEWEDcOUNT(View view) {
        TotalScoreB = 0;
        TotalScore = 0;
        displayForTeamB(TotalScoreB);
        displayForTeamA(TotalScore);
    }
}
