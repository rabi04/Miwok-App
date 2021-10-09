package com.example.miwokapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Resources;
import android.media.MediaPlayer;
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
        phrasesList.add(new Word("are_you_coming","grandfather"));
        phrasesList.add(new Word("Come_here","grandmother"));
        phrasesList.add(new Word("how_are_you_feeling","father"));
        phrasesList.add(new Word("im_coming","mother"));
        phrasesList.add(new Word("im_feeling_good","son"));
        phrasesList.add(new Word("lets_go","daughter"));
        WordAdapter phrasesAdapter = new WordAdapter(this,R.layout.list_item,phrasesList,R.color.category_phrases);
        ListView listView = findViewById(R.id.phrasesListView);
        listView.setAdapter(phrasesAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Word word = (Word) listView.getItemAtPosition(position);

                Resources res = getResources();
                String phraseAudioFile = "phrase_"+word.getDefaultTranslation();
                int phraseAudioId = res.getIdentifier(phraseAudioFile,"raw",getPackageName());
                MediaPlayer mediaPlayer = MediaPlayer.create(getApplicationContext(), phraseAudioId);
                mediaPlayer.start();


                Toast toast = Toast.makeText(getApplicationContext(),word.getDefaultTranslation(),Toast.LENGTH_SHORT);
                toast.show();
            }
        });
    }
}