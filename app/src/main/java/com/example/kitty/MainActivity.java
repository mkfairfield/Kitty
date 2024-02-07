package com.example.kitty;

import android.annotation.SuppressLint;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;


public class MainActivity extends AppCompatActivity {
    private MenuItem previouslySelectedItem = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //initialize the activity for the app
        super.onCreate(savedInstanceState);
       // ImageView backgroundImage = findViewById(R.id.backgroundImage)
        setContentView(R.layout.activity_main); //sets the layout (see activity_main.xml) for the UI


        BottomNavigationView bottomNav = findViewById(R.id.bottom_navigation);
        bottomNav.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener()
        {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                toggleMenuItem(item);
                Fragment selectedFragment = null;

                int itemId = item.getItemId();

                if (itemId == R.id.nav_person) {
//                    getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new PersonFragment()).commit();
                    selectedFragment = new PersonFragment();
                } else if (itemId == R.id.nav_treasure) {
                    selectedFragment = new PartyLootFragment();
                 } else if (itemId == R.id.nav_armor) {
                    // getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new ArmorFragment()).commit();
                    selectedFragment = new EquipmentFragment();
                }

                if (selectedFragment != null) {
                    getSupportFragmentManager().beginTransaction()
                            .replace(R.id.fragment_container, selectedFragment)
                            .commit();
                }

                return true;
            }

        });
    }

    private void toggleMenuItem(MenuItem currentItem) {
        if(previouslySelectedItem != null && previouslySelectedItem == currentItem) {
            return;
        }
        if (previouslySelectedItem != null) {
            //code to reset the previously selected item state
            previouslySelectedItem.setChecked(false);
        }

        //code to get current items clicked state
        currentItem.setChecked(true);

        //update previous item reference
        previouslySelectedItem = currentItem;
    }
}