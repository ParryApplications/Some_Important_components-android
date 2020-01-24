package com.example.paras.practice;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.Model;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
RecyclerView recycler_id;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recycler_id = (RecyclerView)findViewById(R.id.recycler_id);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recycler_id.setLayoutManager(layoutManager);
        List<Model> models = new ArrayList<>();
        models.add(new Model(R.drawable.ic_launcher_background,"Paras"));
        models.add(new Model(R.drawable.ic_launcher_background,"Paras"));
        models.add(new Model(R.drawable.ic_launcher_background,"Paras"));
        models.add(new Model(R.drawable.ic_launcher_background,"Paras"));
        models.add(new Model(R.drawable.ic_launcher_background,"Paras"));
        models.add(new Model(R.drawable.ic_launcher_background,"Paras"));
        models.add(new Model(R.drawable.ic_launcher_background,"Paras"));
        models.add(new Model(R.drawable.ic_launcher_background,"Paras"));
        models.add(new Model(R.drawable.ic_launcher_background,"Paras"));
        Adapter adapter = new Adapter(models);
        recycler_id.setAdapter(adapter);
        adapter.notifyDataSetChanged();
    }
}