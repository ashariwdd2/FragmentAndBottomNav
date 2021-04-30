package com.example.fragmentandbottomnav;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class DetailDinas extends RecyclerView.Adapter<com.example.fragmentandbottomnav.DetailDinas.ListViewHolder> {
    private ArrayList<Dinas> listDinas;

    public DetailDinas(ArrayList<Dinas> list) {
        this.listDinas = list;
    }
    @NonNull
    @Override
    public com.example.fragmentandbottomnav.DetailDinas.ListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.detail_dinas, parent, false);
        return new com.example.fragmentandbottomnav.DetailDinas.ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull com.example.fragmentandbottomnav.DetailDinas.ListViewHolder holder, int position) {
        Dinas dinas = listDinas.get(position);
        Glide.with(holder.itemView.getContext())
                .load(dinas.getLogo())
                .apply(new RequestOptions().override(75,75))
                .into(holder.imgLogo);
        holder.namaDinas.setText(dinas.getNamadinas());
        holder.desDinas.setText(dinas.getDesdinas());
    }

    @Override
    public int getItemCount() {
        return listDinas.size();
    }

    public class ListViewHolder extends RecyclerView.ViewHolder {
        ImageView imgLogo;
        TextView namaDinas;
        TextView desDinas;

        ListViewHolder(View itemview) {
            super(itemview);
            imgLogo = itemview.findViewById(R.id.logo_detail_dinas);
            namaDinas = itemview.findViewById(R.id.nama_dinas_detail);
            desDinas = itemview.findViewById(R.id.desdinas_detail);
        }
    }
}
