package com.example.courtcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
int pointsA=0;
    int pointsB=0;
    public void Athree_pts(View view) {
        pointsA=pointsA+3;
        displayTeamA(pointsA);

    }

    public void Atwo_pts(View view) {
        pointsA=pointsA+2;
        displayTeamA(pointsA);
    }

    public void Afree_pts(View view) {
        pointsA=pointsA+1;
        displayTeamA(pointsA);
    }

    private void displayTeamA(int pointsA) {
        TextView quantityTextView = (TextView) findViewById(R.id.TeamA);
        quantityTextView.setText("" + pointsA);
    }
    public void Bthree_pts(View view) {
        pointsB=pointsB+3;
        displayTeamB(pointsB);

    }

    public void Btwo_pts(View view) {
        pointsB=pointsB+2;
        displayTeamB(pointsB);
    }

    public void Bfree_pts(View view) {
        pointsB=pointsB+1;
        displayTeamB(pointsB);
    }

    private void displayTeamB(int pointsB) {
        TextView quantityTextView = (TextView) findViewById(R.id.TeamB);
        quantityTextView.setText("" + pointsB);
    }

    public void reset(View view) {
    pointsA=0;
    pointsB=0;
    displayTeamB(pointsB);
    displayTeamA(pointsA);
    }

}
