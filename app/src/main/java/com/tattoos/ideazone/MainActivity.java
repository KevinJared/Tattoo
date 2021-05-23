package com.tattoos.ideazone;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import com.tattoos.Tattoo;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_layout);

        RecyclerView recyclerView = findViewById(R.id.tattooList);
        TattoosAdapter adapter = new TattoosAdapter(getTattoos(), this);
        recyclerView.setAdapter(adapter);
    }

    private ArrayList<Tattoo> getTattoos(){
        ArrayList<Tattoo> tattoos = new ArrayList<>();
        Tattoo tattoo1 = new Tattoo(R.drawable.tattoo1, R.string.tattoo_1_desc);
        Tattoo tattoo2 = new Tattoo(R.drawable.tattoo2, R.string.tattoo_2_desc);
        Tattoo tattoo3 = new Tattoo(R.drawable.tattoo3, R.string.tattoo_3_desc);
        Tattoo tattoo4 = new Tattoo(R.drawable.tattoo4, R.string.tattoo_4_desc);
        Tattoo tattoo5 = new Tattoo(R.drawable.tattoo5, R.string.tattoo_5_desc);
        Tattoo tattoo6 = new Tattoo(R.drawable.tattoo6, R.string.tattoo_6_desc);
        Tattoo tattoo7 = new Tattoo(R.drawable.tattoo7, R.string.tattoo_7_desc);
        Tattoo tattoo8 = new Tattoo(R.drawable.tattoo8, R.string.tattoo_8_desc);
        Tattoo tattoo9 = new Tattoo(R.drawable.tattoo9, R.string.tattoo_9_desc);
        Tattoo tattoo10 = new Tattoo(R.drawable.tattoo10, R.string.tattoo_10_desc);
        Tattoo tattoo11 = new Tattoo(R.drawable.tattoo11, R.string.tattoo_11_desc);
        Tattoo tattoo12 = new Tattoo(R.drawable.tattoo12, R.string.tattoo_12_desc);
        Tattoo tattoo13 = new Tattoo(R.drawable.tattoo13, R.string.tattoo_13_desc);
        Tattoo tattoo14 = new Tattoo(R.drawable.tattoo14, R.string.tattoo_14_desc);
        Tattoo tattoo15 = new Tattoo(R.drawable.tattoo15, R.string.tattoo_15_desc);
        Tattoo tattoo16 = new Tattoo(R.drawable.tattoo16, R.string.tattoo_16_desc);
        Tattoo tattoo17 = new Tattoo(R.drawable.tattoo17, R.string.tattoo_17_desc);

        tattoos.add(tattoo1);
        tattoos.add(tattoo2);
        tattoos.add(tattoo3);
        tattoos.add(tattoo4);
        tattoos.add(tattoo5);
        tattoos.add(tattoo6);
        tattoos.add(tattoo7);
        tattoos.add(tattoo8);
        tattoos.add(tattoo9);
        tattoos.add(tattoo10);
        tattoos.add(tattoo11);
        tattoos.add(tattoo12);
        tattoos.add(tattoo13);
        tattoos.add(tattoo14);
        tattoos.add(tattoo15);
        tattoos.add(tattoo16);
        tattoos.add(tattoo17);
        return tattoos;
    }

}

