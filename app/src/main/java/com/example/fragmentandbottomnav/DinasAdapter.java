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

public class DinasAdapter extends RecyclerView.Adapter<com.example.fragmentandbottomnav.DinasAdapter.ListViewHolder> {
    private ArrayList<com.example.fragmentandbottomnav.Dinas> listDinas;

    public DinasAdapter(ArrayList<com.example.fragmentandbottomnav.Dinas> list) {
        this.listDinas = list;
    }
    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_dinas, parent, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ListViewHolder holder, int position) {
        com.example.fragmentandbottomnav.Dinas dinas = listDinas.get(position);
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
            imgLogo = itemview.findViewById(R.id.logo);
            namaDinas = itemview.findViewById(R.id.namadinas);
            desDinas = itemview.findViewById(R.id.desdinas);
        }
    }
}
