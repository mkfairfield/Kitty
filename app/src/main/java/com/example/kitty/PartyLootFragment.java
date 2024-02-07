package com.example.kitty;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;
import java.util.List;

public class PartyLootFragment extends Fragment {
    private RecyclerView partyLootRecyclerView;
    private FloatingActionButton addPartyLootButton;
    private PartyLootAdapter partyLootAdapter;
    private List<PartyLootItem> partyLootItems; //replace item tpye with actual item type

    public PartyLootFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_party_loot, container, false);

        partyLootRecyclerView = view.findViewById(R.id.partyLootRecyclerView);
        partyLootRecyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        partyLootItems = new ArrayList<>();
        partyLootAdapter = new PartyLootAdapter(partyLootItems);
        partyLootRecyclerView.setAdapter(partyLootAdapter);

        addPartyLootButton = view.findViewById(R.id.addPartyLootButton);
        addPartyLootButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v){
                //logic to add new item to party loot list,
                //ie like showing a dialog to enter new item details
                showAddItemDialog();
            }
        });

        return view;
    }

    private void showAddItemDialog() {
        //implementation of a dialog to add a new item
    }

    private void setAddPartyLootItem(PartyLootItem newItem) {
        partyLootItems.add(newItem);
        partyLootAdapter.notifyItemInserted(partyLootItems.size()-1);
    }
}
