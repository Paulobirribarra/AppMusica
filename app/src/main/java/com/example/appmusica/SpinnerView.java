package com.example.appmusica;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

public class SpinnerView extends AppCompatActivity {

    Spinner spinner;
    TextView respuesta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinner_view);

        respuesta = findViewById(R.id.txtSalidaSpinner);
        spinner = findViewById(R.id.spinner);

       String[] respuesta = {"Punk Cósmico", "Ska de Circo", "Rockabilly de Robots", "Jazz de Monstruos", "Reggae de Piratas Espaciales", "Metal de Mariposas", "Salsa de Zombies", "Country de Extraterrestres", "Hip-Hop de Dinosaurios", "Opera de Gatos Parlantes"};
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item,respuesta);
        spinner.setAdapter(adapter);
    }

    public void mostrarSpinner (View view){
        String selected = spinner.getSelectedItem().toString();

        if (selected.equals("Punk Cósmico")){
            respuesta.setText("¡Caos Estelar!");
        }if (selected.equals("Ska de Circo")){
            respuesta.setText("¡Risas y Baile!");
        }if (selected.equals("Rockabilly de Robots")){
            respuesta.setText("Chispas y Ritmo.");
        }if (selected.equals("Jazz de Monstruos")){
            respuesta.setText("Groove Monstruoso.");
        }if (selected.equals("Reggae de Piratas Espaciales")){
            respuesta.setText("Piratas Relajados.");
        }if (selected.equals("Metal de Mariposas")){
            respuesta.setText("Mariposas Furiosas.");
        }if (selected.equals("Salsa de Zombies")){
            respuesta.setText("Zombi Salsa Cremosa.");
        }if (selected.equals("Country de Extraterrestres")){
            respuesta.setText("Vaqueros del Espacio");
        }if (selected.equals("Hip-Hop de Dinosaurios")){
            respuesta.setText("Dino Rap Supreme.");
        }if (selected.equals("Opera de Gatos Parlantes")){
            respuesta.setText("Mullidos en falsete");
        }
    }

    public void SalirMenu (View view){
        Intent salirmenu = new Intent(this, TableLayout.class);
        startActivity(salirmenu);
    }

}