package com.example.miwok;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<Word> {
   private int mColourResourseId;
    public WordAdapter(@NonNull Context context, ArrayList<Word> pwords, int colourResourceId) {
        super(context,0, pwords);
        mColourResourseId = colourResourceId;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listNumberView = convertView;

        if(listNumberView == null){
            listNumberView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent , false);
        }

        Word currentNumber = getItem(position);

        TextView miwokTextview = (TextView) listNumberView.findViewById(R.id.miwok_language);
        miwokTextview.setText(currentNumber.getMiwokTranslation());

        TextView defaultTextView = (TextView) listNumberView.findViewById(R.id.default_language);
        defaultTextView.setText(currentNumber.getDefaultTranslation());

        ImageView imageView = (ImageView) listNumberView.findViewById(R.id.image);

        if(currentNumber.hasImage()) {
            imageView.setImageResource(currentNumber.getImageResourceId());
            imageView.setVisibility(View.VISIBLE);
        }
        else
        {
            imageView.setVisibility(View.GONE);
        }

        View textContainer = listNumberView.findViewById(R.id.text_container);
        int color = ContextCompat.getColor(getContext(), mColourResourseId);
        textContainer.setBackgroundColor(color);

        return listNumberView;
    }
}
