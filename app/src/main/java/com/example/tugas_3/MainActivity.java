package com.example.tugas_3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private ArrayList<NFLStore> nfl = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.rv_recyclerview);
        recyclerView.setHasFixedSize(true);

        nfl.addAll(NFLData.getListData());
        showRecyclerView();
    }

    private void showRecyclerView() {
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        NFLAdapter listHeroAdapter = new NFLAdapter(nfl, this);
        recyclerView.setAdapter(listHeroAdapter);
    }
}