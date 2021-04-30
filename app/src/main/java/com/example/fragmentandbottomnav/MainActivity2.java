package com.example.fragmentandbottomnav;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.fragment.app.Fragment;

public class MainActivity2 extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.dashboard_dinas, container, false);
        Button button = (Button) rootView.findViewById(R.id.btndasbor);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Pindah();
            }
        });
        return rootView;
    }

    public void Pindah() {
        Intent intent = new Intent(getActivity(), MainActivity.class);
        startActivity(intent);
    }
}