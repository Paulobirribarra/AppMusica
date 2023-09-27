package com.example.appmusica;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.transition.ChangeBounds;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class CheckBoxView extends AppCompatActivity {
    TextView txtSalida;
    CheckBox chk1, chk2, chk3, chk4, chk5, chk6, chk7, chk8;
    Button btnValidarChk, btnlimpiar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_box_view);

        txtSalida = findViewById(R.id.txtCheckSalida);
        chk1 = findViewById(R.id.chk1);
        chk2 = findViewById(R.id.chk2);
        chk3 = findViewById(R.id.chk3);
        chk4 = findViewById(R.id.chk4);
        chk5 = findViewById(R.id.chk5);
        chk6 = findViewById(R.id.chk6);
        chk7 = findViewById(R.id.chk7);
        chk8 = findViewById(R.id.chk8);
        btnlimpiar = findViewById(R.id.btnLimpiar);


        btnValidarChk = findViewById(R.id.btnCheckValidar);

        btnValidarChk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mostrarResultado();
            }
        });

        btnlimpiar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                limpiarSeleccion();
            }
        });
    }

    private void mostrarResultado() {
        StringBuilder resultado = new StringBuilder();

        if (chk1.isChecked()) {
            resultado.append(getString(R.string.chk1)).append("\n");
        }
        if (chk2.isChecked()) {
            resultado.append(getString(R.string.chk2)).append("\n");
        }
        if (chk3.isChecked()) {
            resultado.append(getString(R.string.chk3)).append("\n");
        }
        if (chk4.isChecked()) {
            resultado.append(getString(R.string.chk4)).append("\n");
        }
        if (chk5.isChecked()) {
            resultado.append(getString(R.string.chk5)).append("\n");
        }
        if (chk6.isChecked()) {
            resultado.append(getString(R.string.chk6)).append("\n");
        }
        if (chk7.isChecked()) {
            resultado.append(getString(R.string.chk7)).append("\n");
        }
        if (chk8.isChecked()) {
            resultado.append(getString(R.string.chk8)).append("\n");
        }

        txtSalida.setText(resultado.toString());
    }

    public void goMenu (View view){
        Intent gomenu = new Intent(this, TableLayout.class);
        startActivity(gomenu);
    }

    public void limpiarSeleccion (){
        chk1.setChecked(false);
        chk2.setChecked(false);
        chk3.setChecked(false);
        chk4.setChecked(false);
        chk5.setChecked(false);
        chk6.setChecked(false);
        chk7.setChecked(false);
        chk8.setChecked(false);

        txtSalida.setText("");

    }
    
}