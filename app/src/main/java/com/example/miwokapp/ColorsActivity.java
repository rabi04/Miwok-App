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
        ArrayList<Word> colorList = new ArrayList<Word>();
        colorList.add(new Word("orange","orange",R.drawable.color_brown));
        colorList.add(new Word("Yellow","yellow",R.drawable.color_dusty_yellow));
        colorList.add(new Word("Red","red",R.drawable.color_red));
        colorList.add(new Word("Green","green",R.drawable.color_green));
        colorList.add(new Word("Gold","Gold",R.drawable.color_dusty_yellow));
        colorList.add(new Word("Silver","silver",R.drawable.color_brown));
        colorList.add(new Word("Bronze","Bronze",R.drawable.color_gray));

        WordAdapter colorListItem = new WordAdapter(this, R.layout.list_item, colorList , R.color.category_colors);
        ListView colorListView =  findViewById(R.id.colorListView);
        colorListView.setAdapter(colorListItem);
    }
}