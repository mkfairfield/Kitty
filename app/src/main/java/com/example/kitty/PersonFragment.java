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


public class PersonFragment extends Fragment {

    private List<String> inventoryItems; // Assuming inventory items are Strings
    private InventoryAdapter inventoryAdapter;
    private RecyclerView inventoryRecyclerView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_person, container, false);

        inventoryItems = new ArrayList<>();

        inventoryRecyclerView = view.findViewById(R.id.inventoryRecyclerView);
        inventoryRecyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        // Initialize your adapter and set it to the RecyclerView
        inventoryAdapter = new InventoryAdapter(inventoryItems);
        inventoryRecyclerView.setAdapter(inventoryAdapter);

        FloatingActionButton addItemButton = view.findViewById(R.id.addItemButton);
        addItemButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle the click event for adding a new item
                addItemToInventory("New Inventory Item");
            }
        });

        return view;
    }

    public void addItemToInventory(String newItem) {
        inventoryItems.add(newItem);
        inventoryAdapter.notifyItemInserted(inventoryItems.size() - 1);
    }
}

