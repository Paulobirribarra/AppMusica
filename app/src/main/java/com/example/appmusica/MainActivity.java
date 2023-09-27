package com.example.appmusica;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {

    ProgressBar progBar;
    Button buttonLog;
    int counter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        progBar=findViewById(R.id.progress1);
        buttonLog=findViewById(R.id.btnLogin);
        buttonLog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                progBar.setVisibility(View.VISIBLE);
                Timer timer = new Timer();
                TimerTask timerTask = new TimerTask() {
                    @Override
                    public void run() {
                        counter++;
                        progBar.setProgress(counter);
                        if (counter==20){
                            timer.cancel();

                            Intent disc = new Intent(MainActivity.this, TableLayout.class);
                            startActivity(disc);
                        }
                    }
                };
                timer.schedule(timerTask,20,20);
            }
        });
    }
    public void enter (View view){
        Intent entrar = new Intent(this, TableLayout.class);
        startActivity(entrar);
    }
}