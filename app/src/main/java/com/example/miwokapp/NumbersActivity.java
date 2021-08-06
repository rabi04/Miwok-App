package com.example.miwokapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);
        ArrayList <String> number = new ArrayList<String>();
        number.add("one");
        number.add("two");
        number.add("three");
        number.add("four");
        number.add("five");
     /*   LinearLayout rootView = findViewById(R.id.rootView);
        for(int i = 0; i < number.size() ; i++) {
            TextView textView = new TextView(this);
            textView.setText(number.get(i));
            textView.setPadding(10,10,10,10);
            rootView.addView(textView);
        }        */
        // Using listview and arrayadapter for memory optimization.
        ArrayAdapter<String> itemAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,number);
        ListView listview = findViewById(R.id.list);
        listview.setAdapter(itemAdapter);
    }
}