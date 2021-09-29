package com.example.students;

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


        ArrayList<Student> arrayList = new ArrayList<>();

        arrayList.add(new Student("Marek","17lat","2a","1.77cm","Technikum"));
        arrayList.add(new Student("Piotr","19lat","4a","1.87cm","Liceum"));
        arrayList.add(new Student("Andrzej","18lat","3a","1.76cm","Technikum"));
        arrayList.add(new Student("Błażej","19lat","4a","1.60cm","Liceum"));


        StudentAdapter studentAdapter = new StudentAdapter(this,R.layout.list_row,arrayList);

        listView.setAdapter(studentAdapter);

    }
}