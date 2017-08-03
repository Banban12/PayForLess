package com.example.ban.recylerview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.gnirt69.recyclerviewoptionmenu.RecyclerItem;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private MyAdapter adapter;
    private List<RecyclerItem> listItems;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        listItems = new ArrayList<>();
        //Generate sample data

        for (int i = 0; i<10; i++) {
            listItems.add(new RecyclerItem("Item " + (i + 1), "Welcome to Pay for less " + (i+1)));
        }

        //Set adapter
        adapter = new MyAdapter(listItems, this);
        recyclerView.setAdapter(adapter);
    }
}
