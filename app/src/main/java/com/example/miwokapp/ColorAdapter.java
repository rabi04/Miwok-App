package com.example.miwokapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

public class ColorAdapter extends ArrayAdapter<Color> {

    public ColorAdapter(@NonNull Context context, int resource, @NonNull ArrayList<Color> colorArrayList) {
        super(context, 0, colorArrayList);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }
        Color color = getItem(position);
        TextView defaultColor = listItemView.findViewById(R.id.defaultWord);
        defaultColor.setText(color.getColorName());
        return listItemView;
    }
}
