package com.example.kitty;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class PartyLootAdapter extends RecyclerView.Adapter<PartyLootAdapter.PartyLootViewHolder> {
    private List<PartyLootItem> partyLootItems;//replace with item class?

    public PartyLootAdapter(List<PartyLootItem> partyLootItems){
        this.partyLootItems = partyLootItems;
    }

    public static class PartyLootViewHolder extends RecyclerView.ViewHolder {
        public TextView itemNameTextView;
        //add aore views here as needed

        public PartyLootViewHolder(View itemView) {
            super(itemView);
            itemNameTextView = itemView.findViewById(R.id.itemNameTextView);
            //initalize more views as needed
        }
    }

    @Override
    public PartyLootViewHolder onCreateViewHolder(ViewGroup parent, int viewType)
    {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_party_loot, parent, false);
        return new PartyLootViewHolder(itemView);
    }
    @Override
    public void onBindViewHolder(PartyLootViewHolder holder, int position)
    {
        PartyLootItem currentItem = partyLootItems.get(position);
        holder.itemNameTextView.setText(currentItem.getName());
    }

    @Override
    public int getItemCount()
    {
        return partyLootItems.size();
    }



}
