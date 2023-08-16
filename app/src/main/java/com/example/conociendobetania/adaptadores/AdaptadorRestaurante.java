package com.example.conociendobetania.adaptadores;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.conociendobetania.R;
import com.example.conociendobetania.moldes.Molderestaurante;

import java.util.ArrayList;

public class AdaptadorRestaurante extends  RecyclerView.Adapter<AdaptadorRestaurante.viewHolder> {

    public ArrayList<Molderestaurante> listaRestaurantes;
    public AdaptadorRestaurante() {
    }

    public AdaptadorRestaurante(ArrayList<Molderestaurante> listaRestaurantes) {
        this.listaRestaurantes = listaRestaurantes;
    }

    @NonNull
    @Override
    public AdaptadorRestaurante.viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View vista = LayoutInflater.from(parent.getContext()).inflate(R.layout.molderestaurante,null,false);
        return new viewHolder(vista);
    }

    @Override
    public void onBindViewHolder(@NonNull AdaptadorRestaurante.viewHolder holder, int position) {
    holder.actualizarDatos(listaRestaurantes.get(position));
    }

    @Override
    public int getItemCount() {
        return listaRestaurantes.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder {

        ImageView fotoHotel;
        TextView nombreHotel;
        TextView precioHotel;
        TextView contactoHotel;

        public viewHolder(@NonNull View itemView) {
            super(itemView);
            fotoHotel=itemView.findViewById(R.id.fotolistahotel);
            nombreHotel=itemView.findViewById(R.id.nombrelistahotel);
            precioHotel=itemView.findViewById(R.id.preciolistahotel);
            contactoHotel=itemView.findViewById(R.id.numerolistahotel);


        }

        public void actualizarDatos(Molderestaurante molderestaurante) {
        }
    }
}
