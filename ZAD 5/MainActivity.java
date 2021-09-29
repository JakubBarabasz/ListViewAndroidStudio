package com.example.studentslist;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    ListView listView;



    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView mListView = (ListView) findViewById(R.id.listView);

        //Create the Person objects
        Product cheese = new Product("Cheese","2$");
        Product ham = new Product("Ham","4$");
        Product bread = new Product("Bread","1.5$");
        Product apple = new Product("Apple","1$");
        Product orange = new Product("Orange","2$");
        Product strawberry = new Product("Strawberry","2$");
        Product yoghurt = new Product("Yoghurt","3$");
        Product coffee = new Product("Coffee","5$");
        Product grapes = new Product("Grapes","3$");
        Product water = new Product("Water","0.5$");






        ArrayList<Product>productList = new ArrayList<>();
        productList.add(cheese);
        productList.add(ham);
        productList.add(bread);
        productList.add(apple);
        productList.add(orange);
        productList.add(strawberry);
        productList.add(yoghurt);
        productList.add(coffee);
        productList.add(grapes);
        productList.add(water);



        ProductListAdapter adapter = new ProductListAdapter(this, R.layout.adapter_view_layout, productList);
        mListView.setAdapter(adapter);
    }
}

