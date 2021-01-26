package com.example.miwok;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> words = new ArrayList<Word>();

        words.add(new Word("lutti", "one", R.drawable.number_one));
        words.add(new Word("otiiko", "two", R.drawable.number_two));
        words.add(new Word("tolookosu", "three", R.drawable.number_three));
        words.add(new Word("oyyisa", "four", R.drawable.number_four));
        words.add(new Word("massokka", "five", R.drawable.number_five));
        words.add(new Word("temmokka", "six", R.drawable.number_six));
        words.add(new Word("kenekaku", "seven", R.drawable.number_seven));
        words.add(new Word("kawinta", "eight", R.drawable.number_eight));
        words.add(new Word("wo’e", "nine", R.drawable.number_nine));
        words.add(new Word("na’aacha", "ten", R.drawable.number_ten));


//        LinearLayout rootview = (LinearLayout) findViewById(R.id.rootview);

//        ArrayAdapter<Word> itemsAdapter = new ArrayAdapter<String>(this, android.R.layout.list_item, words);

        WordAdapter adapter = new WordAdapter(this, words, R.color.category_numbers);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);

//        int index = 0;
//
//        while (index < words.size()){
//            TextView wordView = new TextView(this);
//            wordView.setText(words.get(index));
//            rootview.addView(wordView);
//            index++;
//        }
//
//        for(int index=0; index<words.size() ; index++)
//        {
//            TextView wordView = new TextView(this);
//            wordView.setText(words.get(index));
//            rootview.addView(wordView);
//        }


    }
}