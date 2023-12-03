package com.example.listadetareas_edit.Vista;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ArrayAdapter;


import com.example.listadetareas_edit.Controlador.ControladorTarea;
import com.example.listadetareas_edit.Modelo.Tarea;
import com.example.listadetareas_edit.R;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    public static AdaptadorTarea adaptador;

    editarTareaActivity editar;
    private static final ArrayList<Tarea> lstTareas = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ControladorTarea control = new ControladorTarea();

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        adaptador = new AdaptadorTarea(control.getLista());

        RecyclerView rv = findViewById(R.id.rv);
        rv.setLayoutManager(layoutManager);
        rv.setAdapter(adaptador);
        control.cargarTareas();

    }
}