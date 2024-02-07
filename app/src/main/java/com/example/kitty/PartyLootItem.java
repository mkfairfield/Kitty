package com.example.kitty;

public class PartyLootItem {
    private String name;
    private String description;
    private int quantity;

    //constructor
    public PartyLootItem(String name, String description, int quantity) {
        this.name = name;
        this.description = description;
        this.quantity = quantity;

    }

    //get
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;

    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

}
