package com.example.miwokapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_family);
        ArrayList<Word> familyMember = new ArrayList<Word>();
        familyMember.add(new Word("grandfather","grandfather",R.drawable.family_grandfather));
        familyMember.add(new Word("grandmother","grandfather",R.drawable.family_grandmother));
        familyMember.add(new Word("father","grandfather",R.drawable.family_father));
        familyMember.add(new Word("mother","grandfather",R.drawable.family_mother));
        familyMember.add(new Word("older brother","grandfather",R.drawable.family_older_brother));
        familyMember.add(new Word("daughter","grandfather",R.drawable.family_daughter));
        familyMember.add(new Word("young brother","grandfather",R.drawable.family_younger_brother));
        familyMember.add(new Word("older sister","grandfather",R.drawable.family_older_sister));
        familyMember.add(new Word("young sister","grandfather",R.drawable.family_younger_sister));
        familyMember.add(new Word("son","grandfather",R.drawable.family_son));
        WordAdapter family = new WordAdapter(this,R.layout.list_item,familyMember , R.color.category_family);
        ListView listView = findViewById(R.id.list);
        listView.setAdapter(family);
    }
}