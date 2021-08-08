package com.example.miwokapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
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
        
       /* using custom object word in Arraylist instead of string as it will be required to show words in custom created list_item
        //         of xml resource file . will display the value in log for checking whether it is working fine or not.*/
        //        // new word is the constructor of the word class which I have created.
        ArrayList<Word> itemList = new ArrayList<Word>();
        itemList.add(new Word("one","luttie"));
        itemList.add(new Word("two","du"));
        itemList.add(new Word("three","tin"));
        itemList.add(new Word("four","char"));
        //logging the translation in log.
        for(int i = 0; i < itemList.size(); i++){
            Word word = itemList.get(i);
            Log.i("Number Activity ",word.getDefaultTranslation()+" "+word.getmMiwokTranslation());
        }
        WordAdapter language = new WordAdapter(this,R.layout.list_item,itemList);
        ListView listView = findViewById(R.id.list);
        listView.setAdapter(language);

    }
}