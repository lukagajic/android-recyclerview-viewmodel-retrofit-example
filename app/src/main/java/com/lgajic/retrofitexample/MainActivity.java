package com.lgajic.retrofitexample;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.lgajic.retrofitexample.adapter.HeroesAdapter;
import com.lgajic.retrofitexample.model.Hero;
import com.lgajic.retrofitexample.viewmodel.HeroesViewModel;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private HeroesAdapter adapter;
    private HeroesViewModel heroesViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initComponents();
    }

    private void initComponents() {
        recyclerView = findViewById(R.id.recycler_view);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        heroesViewModel = new ViewModelProvider(this).get(HeroesViewModel.class);

        heroesViewModel.getHeroes().observe(this, (heroes) -> {
            adapter = new HeroesAdapter(MainActivity.this, heroes);
            recyclerView.setAdapter(adapter);
        });
    }
}