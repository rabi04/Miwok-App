package com.example.miwokapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colors);
        ArrayList<Color> colorList = new ArrayList<Color>();
        colorList.add(new Color("orange"));
        colorList.add(new Color("Yellow"));
        colorList.add(new Color("Red"));
        colorList.add(new Color("Green"));
        colorList.add(new Color("Gold"));
        colorList.add(new Color("Silver"));
        colorList.add(new Color("Bronze"));

        ColorAdapter colorListItem = new ColorAdapter(this,R.layout.list_item,colorList);
        ListView colorListView =  findViewById(R.id.colorListView);
        colorListView.setAdapter(colorListItem);
    }
}