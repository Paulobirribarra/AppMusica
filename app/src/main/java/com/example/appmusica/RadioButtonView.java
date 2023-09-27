package com.example.appmusica;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class RadioButtonView extends AppCompatActivity {

    private RadioButton idRadio1;
    private RadioButton idRadio2;
    private Button btnValidarRDO;
    private TextView txtValidar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radio_button_view);


        idRadio1 = findViewById(R.id.idRadio1);
        idRadio2 = findViewById(R.id.idRadio2);
        btnValidarRDO = findViewById(R.id.btnValidar);
        txtValidar = findViewById(R.id.txtRadioSalida);
        btnValidarRDO.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                StringBuilder selected = new StringBuilder("Selected: ");

                if (idRadio1.isChecked()){
                    selected.append("i like it");
                }
                if (idRadio2.isChecked()){
                    selected.append("i dont like it");
                }

                Toast.makeText(RadioButtonView.this,selected.toString(),Toast.LENGTH_SHORT).show();

                txtValidar.setText(selected.toString());
            }
        });

    }

    public void volverMenu (View view){
        Intent menu = new Intent(this, TableLayout.class);
        startActivity(menu);
    }
}