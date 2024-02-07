package com.example.kitty;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class InventoryAdapter extends RecyclerView.Adapter<InventoryAdapter.InventoryViewHolder> {

    private List<String> inventoryItems; // Assuming your inventory items are simple Strings

    public InventoryAdapter(List<String> inventoryItems) {
        this.inventoryItems = inventoryItems;
    }

    public static class InventoryViewHolder extends RecyclerView.ViewHolder {
        public TextView itemNameTextView;

        public InventoryViewHolder(View itemView) {
            super(itemView);
            itemNameTextView = itemView.findViewById(R.id.itemNameTextView);
        }
    }

    @Override
    public InventoryViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_inventory, parent, false);
        return new InventoryViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(InventoryViewHolder holder, int position) {
        String currentItem = inventoryItems.get(position);
        holder.itemNameTextView.setText(currentItem);
    }

    @Override
    public int getItemCount() {
        return inventoryItems.size();
    }
}



