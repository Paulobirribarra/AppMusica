package com.example.appmusica;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Disc extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_disc);
    }

    public void back (View view){
        Intent volver = new Intent(this, TableLayout.class);
        startActivity(volver);
    }
    public void img1 (View view){
        String titulo = getResources().getResourceEntryName(view.getId());
        Toast.makeText(this, "Björk Utopía 2017", Toast.LENGTH_SHORT).show();
    }
    public void img2 (View view){
        String titulo = getResources().getResourceEntryName(view.getId());
        Toast.makeText(this, "Kamelot - Awakening 2023", Toast.LENGTH_SHORT).show();
    }
    public void img3 (View view){
        String titulo = getResources().getResourceEntryName(view.getId());
        Toast.makeText(this, "Tash Sultana - Flow State 2018", Toast.LENGTH_SHORT).show();
    }
    public void img4 (View view){
        String titulo = getResources().getResourceEntryName(view.getId());
        Toast.makeText(this, "San Cisco - San Cisco 2012", Toast.LENGTH_SHORT).show();
    }
    public void img5 (View view){
        String titulo = getResources().getResourceEntryName(view.getId());
        Toast.makeText(this, "Prehistöricos - Nuestro día vendrá 2014", Toast.LENGTH_SHORT).show();
    }
    public void img6 (View view){
        String titulo = getResources().getResourceEntryName(view.getId());
        Toast.makeText(this, "Low Roar - Low Roar 2011", Toast.LENGTH_SHORT).show();
    }
    
}

