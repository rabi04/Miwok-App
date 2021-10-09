package com.example.miwokapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Resources;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colors);
        ArrayList<Word> colorList = new ArrayList<Word>();
        colorList.add(new Word("black","orange",R.drawable.color_brown));
        colorList.add(new Word("brown","yellow",R.drawable.color_dusty_yellow));
        colorList.add(new Word("red","red",R.drawable.color_red));
        colorList.add(new Word("gray","green",R.drawable.color_green));
        colorList.add(new Word("green","Gold",R.drawable.color_dusty_yellow));
        colorList.add(new Word("white","silver",R.drawable.color_brown));
        //colorList.add(new Word("Bronze","Bronze",R.drawable.color_gray));

        WordAdapter colorListItem = new WordAdapter(this, R.layout.list_item, colorList , R.color.category_colors);
        ListView colorListView =  findViewById(R.id.colorListView);
        colorListView.setAdapter(colorListItem);
        //MediaPlayer mediaPlayer = MediaPlayer.create(this,R.raw.color_green);
        colorListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Word word = colorListItem.getItem(position);
                Resources res = getResources();
                String colorAudioFile = "color_"+word.getDefaultTranslation();
                int colorAudioFileId = res.getIdentifier(colorAudioFile,"raw",getPackageName());
                MediaPlayer mediaPlayer = MediaPlayer.create(getApplicationContext(),colorAudioFileId);
                mediaPlayer.start();
                Toast toast = Toast.makeText(getApplicationContext(),word.getDefaultTranslation(),Toast.LENGTH_SHORT);
                toast.show();
            }
        });
    }
}