package com.example.listphotos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listView);


        ArrayList<Animal> arrayList = new ArrayList<>();

        arrayList.add(new Animal(R.drawable.dzik));
        arrayList.add(new Animal(R.drawable.jelen));
        arrayList.add(new Animal(R.drawable.kuna));
        arrayList.add(new Animal(R.drawable.rys));


    AnimalAdapter animalAdapter = new AnimalAdapter(this,R.layout.list_row,arrayList);

    listView.setAdapter(animalAdapter);

    }
}