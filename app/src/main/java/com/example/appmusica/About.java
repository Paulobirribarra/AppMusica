package com.example.appmusica;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

public class About extends AppCompatActivity {


    private RatingBar ratingBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        ratingBar = (RatingBar)findViewById(R.id.ratingBar);
        final TextView txtrating = findViewById(R.id.txtCalificanosSalida);
        ratingBar.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float v, boolean b) {
                Toast.makeText(About.this,"Usted ha votado con: "+v,Toast.LENGTH_LONG).show();
                txtrating.setText("Usted ha votado con: "+v);
            }
        });

    }

    public void goMenu (View view){
        Intent gomenu = new Intent(this, TableLayout.class);
        startActivity(gomenu);
    }

}