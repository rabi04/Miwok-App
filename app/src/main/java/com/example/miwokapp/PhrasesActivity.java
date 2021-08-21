package com.example.miwokapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phrases);
        ArrayList<Word> phrasesList = new ArrayList<Word>();
        phrasesList.add(new Word("grandfather","grandfather"));
        phrasesList.add(new Word("grandmother","grandmother"));
        phrasesList.add(new Word("father","father"));
        phrasesList.add(new Word("mother","mother"));
        phrasesList.add(new Word("son","son"));
        phrasesList.add(new Word("daughter","daughter"));
        WordAdapter phrasesAdapter = new WordAdapter(this,R.layout.list_item,phrasesList,R.color.category_phrases);
        ListView listView = findViewById(R.id.list);
        listView.setAdapter(phrasesAdapter);
    }
}