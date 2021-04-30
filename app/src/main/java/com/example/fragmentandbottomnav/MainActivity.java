package com.example.fragmentandbottomnav;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvDinas;
    private ArrayList<com.example.fragmentandbottomnav.Dinas> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragmen_dinas);


        rvDinas = findViewById(R.id.rv_dinas);
        rvDinas.setHasFixedSize(true);

        list.addAll(com.example.fragmentandbottomnav.DataDinas.getListData());
        showRecyclerList();
    }

    private void showRecyclerList(){
        rvDinas.setLayoutManager(new LinearLayoutManager(this));
        com.example.fragmentandbottomnav.DinasAdapter dinasAdapter = new com.example.fragmentandbottomnav.DinasAdapter(list);
        rvDinas.setAdapter(dinasAdapter);
    }
}