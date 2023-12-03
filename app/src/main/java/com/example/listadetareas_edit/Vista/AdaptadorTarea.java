package com.example.listadetareas_edit.Vista;


import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.listadetareas_edit.Modelo.Tarea;
import com.example.listadetareas_edit.R;

import java.util.ArrayList;

public class AdaptadorTarea extends RecyclerView.Adapter<AdaptadorTarea.ViewHolder> {
    private Context context;
    private static ArrayList<Tarea> dataSet;
    public AdaptadorTarea(ArrayList<Tarea> dataSet) {
        this.dataSet = dataSet;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        context = parent.getContext();
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.txtNombreTarea.setText(dataSet.get(position).getNombre());
        holder.txtFechaTarea.setText((dataSet.get(position).getFecha()));
        holder.txtHoraTarea.setText((dataSet.get(position).getHora()));
        holder.imgCategoria.setImageResource(dataSet.get(position).getCategoriaDrawable());
        holder.cv.setOnClickListener(view -> {
            Intent intent = new Intent(context, editarTareaActivity.class);
            intent.putExtra("id", dataSet.get(position).getId());
            context.startActivity(intent);
        });
    }

    @Override
    public int getItemCount() {
        return dataSet.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public CardView cv;
        public TextView txtNombreTarea, txtFechaTarea, txtHoraTarea, txtDescripcion;
        public ImageView imgCategoria;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            cv = itemView.findViewById(R.id.cv);
            txtNombreTarea = itemView.findViewById(R.id.txtNombreTarea);
            txtFechaTarea = itemView.findViewById(R.id.txtFechaTarea);
            txtHoraTarea = itemView.findViewById(R.id.txtHoraTarea);
            imgCategoria = itemView.findViewById(R.id.imgCategoria);
        }

    }
}