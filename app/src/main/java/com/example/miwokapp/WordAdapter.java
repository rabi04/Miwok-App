package com.example.miwokapp;

import android.content.Context;
import android.media.MediaPlayer;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

public class WordAdapter extends ArrayAdapter<Word> {
    private long color;
    public WordAdapter(@NonNull Context context, int resource, @NonNull ArrayList<Word> wordArrayList,long color) {
        super(context, 0, wordArrayList);
        this.color = color;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }
        Word word = getItem(position);


        TextView miwokWord = listItemView.findViewById(R.id.miwokWord);
        miwokWord.setText(word.getmMiwokTranslation());
        TextView defaultWord = listItemView.findViewById(R.id.defaultWord);
        defaultWord.setText(word.getDefaultTranslation());
        LinearLayout wordLinearLayout = listItemView.findViewById(R.id.wordLinearLayout);
        wordLinearLayout.setBackgroundColor((int)color);
        ImageView imageView = listItemView.findViewById(R.id.image);
        imageView.setVisibility(View.GONE);
        if(word.isPhrasesActivity() == false){
            imageView.setVisibility(View.VISIBLE);
            imageView.setImageResource(word.getImageResourceId());
        }
        return listItemView;
    }
}
