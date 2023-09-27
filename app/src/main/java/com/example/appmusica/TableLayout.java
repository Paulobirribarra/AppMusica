package com.example.appmusica;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;


public class TableLayout extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_table_layout);
    }

    public void Salir(View view) {
        Intent back = new Intent(this, MainActivity.class);
        startActivity(back);
    }

    public void backMenu(View view) {
        Intent volver = new Intent(this, Disc.class);
        startActivity(volver);
    }

    public void goRadio(View view) {
        Intent Radio = new Intent(this, RadioButtonView.class);
        startActivity(Radio);
    }

    public void goSpinner(View view) {
        Intent gospinner = new Intent(this, SpinnerView.class);
        startActivity(gospinner);
    }

    public void goCheckBox(View view) {
        Intent goscheckbox = new Intent(this, CheckBoxView.class);
        startActivity(goscheckbox);
    }
    public void goRecycler(View view) {
        Intent gorecycler = new Intent(this, RecyclerView.class);
        startActivity(gorecycler);
    }
    public void goAbout(View view) {
        Intent goabout = new Intent(this, About.class);
        startActivity(goabout);
    }

}
