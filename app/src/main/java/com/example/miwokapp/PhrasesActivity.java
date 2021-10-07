package com.example.miwokapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

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
        ListView listView = findViewById(R.id.phrasesListView);
        listView.setAdapter(phrasesAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Word word = (Word) listView.getItemAtPosition(position);
                Toast toast = Toast.makeText(getApplicationContext(),word.getDefaultTranslation(),Toast.LENGTH_SHORT);
                toast.show();
            }
        });
    }
}