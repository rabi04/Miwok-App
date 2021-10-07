package com.example.miwokapp;

import androidx.appcompat.app.AppCompatActivity;

import android.icu.text.Transliterator;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

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
        itemList.add(new Word("one","luttie",R.drawable.number_one));
        itemList.add(new Word("two","du",R.drawable.number_two));
        itemList.add(new Word("three","tin",R.drawable.number_three));
        itemList.add(new Word("four","char",R.drawable.number_four));
        itemList.add(new Word("five","char",R.drawable.number_five));
        itemList.add(new Word("six","char",R.drawable.number_six));
        itemList.add(new Word("seven","char",R.drawable.number_seven));
        itemList.add(new Word("eight","char",R.drawable.number_eight));
        itemList.add(new Word("nine","char",R.drawable.number_nine));
        itemList.add(new Word("ten","char",R.drawable.number_ten));
        //logging the translation in log.
        for(int i = 0; i < itemList.size(); i++){
            Word word = itemList.get(i);
            Log.i("Number Activity ",word.getDefaultTranslation()+" "+word.getmMiwokTranslation());
        }
        WordAdapter language = new WordAdapter(this,R.layout.list_item,itemList, R.color.category_numbers);
        ListView listView = findViewById(R.id.numberListView);
        listView.setAdapter(language);

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