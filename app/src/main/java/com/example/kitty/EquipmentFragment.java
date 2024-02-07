package com.example.kitty;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.List;
import java.util.ArrayList;

public class EquipmentFragment extends Fragment {
    private RecyclerView equipmentRecyclerView;

    public EquipmentFragment() {


    }
    @Override
    public View onCreateView(LayoutInflater inflator, ViewGroup container,
                             Bundle savedInstatnceState) {
        View view = inflator.inflate(R.layout.fragment_person, container, false);

        equipmentRecyclerView = view.findViewById(R.id.equipmentRecyclerView);

        //set up recyclerView with layoutmanager and adapter

        return view;
    }

}
