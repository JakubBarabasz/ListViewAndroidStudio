package com.example.zad2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    ListView listView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        listView=(ListView) findViewById(R.id.listview);

        ArrayList<String> arrayList=new ArrayList<>();

        arrayList.add("Rock");
        arrayList.add("Pop");
        arrayList.add("Metal");
        arrayList.add("Rap");
        arrayList.add("Disco");
        arrayList.add("Soul");
        arrayList.add("Techno");
        arrayList.add("Punk");
        arrayList.add("Blues");
        arrayList.add("Country");


        ArrayAdapter arrayAdapter=new ArrayAdapter(this,android.R.layout.simple_list_item_1, arrayList);

        listView.setAdapter(arrayAdapter);
    }
}