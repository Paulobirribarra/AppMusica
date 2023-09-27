package com.example.appmusica;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import java.util.List;

public class RecyclerView extends AppCompatActivity{

    private List<ListElement> elementsList;
    private ListAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view);

        // Inicializar la lista de elementos con datos generados
        elementsList = dataGenerator.generateElements();

        // Configurar el RecyclerView
        androidx.recyclerview.widget.RecyclerView recyclerView = findViewById(R.id.recyclerList);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        // Crear el adaptador y establecerlo en el RecyclerView
        adapter = new ListAdapter(elementsList, this);
        recyclerView.setAdapter(adapter);

    }

}