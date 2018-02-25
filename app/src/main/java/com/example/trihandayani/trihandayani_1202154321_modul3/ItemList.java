package com.example.trihandayani.trihandayani_1202154321_modul3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class ItemList extends AppCompatActivity {

    RecyclerView recyclerView;
    CustRecyclerAdapter adapter;
    List<Items> item_lists;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item_list);

        //create ArrayList for item list
        item_lists = new ArrayList<>();
        //set the RecyclerView
        recyclerView = findViewById(R.id.recycleView_item_list);
        recyclerView.setHasFixedSize(true); //set the size of RecyclerView as fixed
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        //add the items using ArrayList to Items.class
        item_lists.add(
                new Items(
                        "Aqua",
                        "Ini adalah minuman aqua",
                        R.drawable.aqua
                )
        );

        item_lists.add(
                new Items(
                        "Pristin",
                        "Ini adalah minuman Pristin",
                        R.drawable.pristine
                )
        );

        item_lists.add(
                new Items(
                        "Cleo",
                        "Ini adalah minuman Cleo",
                        R.drawable.cleo
                )
        );

        item_lists.add(
                new Items(
                        "LeMineral",
                        "Ini adalah minuman LeMineral",
                        R.drawable.leminerale
                )
        );

        item_lists.add(
                new Items(
                        "Club",
                        "Ini adalah minuman Club",
                        R.drawable.leminerale
                )
        );

        item_lists.add(
                new Items(
                        "Ades",
                        "Ini adalah minuman Ades",
                        R.drawable.ades
                )
        );

        item_lists.add(
                new Items(
                        "Amidis",
                        "Ini adalah minuman Amidis",
                        R.drawable.amidis
                )
        );

        item_lists.add(
                new Items(
                        "Equil",
                        "Ini adalah minuman Equil",
                        R.drawable.equil
                )
        );

        item_lists.add(
                new Items(
                        "Evian",
                        "Ini adalah minuman Evian",
                        R.drawable.evian
                )
        );

        item_lists.add(
                new Items(
                        "Nestle",
                        "Ini adalah minuman Nestle",
                        R.drawable.nestle
                )
        );

        item_lists.add(
                new Items(
                        "Vit",
                        "Ini adalah minuman Vit",
                        R.drawable.vit
                )
        );

        adapter = new CustRecyclerAdapter(this, item_lists);
        recyclerView.setAdapter(adapter);
    }
}
