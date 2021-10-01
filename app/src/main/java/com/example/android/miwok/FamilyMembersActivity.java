package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyMembersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> word = new ArrayList<Word>();
        word.add(new Word("father", "әpә",R.drawable.family_father,R.raw.family_father));
        word.add(new Word("mother", "әṭa",R.drawable.family_mother,R.raw.family_mother));
        word.add(new Word("son", "angsi",R.drawable.family_son,R.raw.family_son));
        word.add(new Word("daughter", "tune",R.drawable.family_daughter,R.raw.family_daughter));
        word.add(new Word("older brother", "taachi",R.drawable.family_older_brother,R.raw.family_older_brother));
        word.add(new Word("younger brother", "chalitti",R.drawable.family_younger_brother,R.raw.family_younger_brother));
        word.add(new Word("older sister", "teṭe",R.drawable.family_older_sister,R.raw.family_older_sister));
        word.add(new Word("younger sister", "kolliti",R.drawable.family_younger_sister,R.raw.family_younger_sister));
        word.add(new Word("grandmother", "ama",R.drawable.family_grandmother,R.raw.family_grandmother));
        word.add(new Word("grandfather", "paapa",R.drawable.family_grandfather,R.raw.family_grandfather));
        word.add(new Word("father", "әpә",R.drawable.family_father,R.raw.family_father));
        word.add(new Word("mother", "әṭa",R.drawable.family_mother,R.raw.family_mother));
        word.add(new Word("son", "angsi",R.drawable.family_son,R.raw.family_son));
        word.add(new Word("daughter", "tune",R.drawable.family_daughter,R.raw.family_daughter));
        word.add(new Word("older brother", "taachi",R.drawable.family_older_brother,R.raw.family_older_brother));
        word.add(new Word("younger brother", "chalitti",R.drawable.family_younger_brother,R.raw.family_younger_brother));
        word.add(new Word("older sister", "teṭe",R.drawable.family_older_sister,R.raw.family_older_sister));
        word.add(new Word("younger sister", "kolliti",R.drawable.family_younger_sister,R.raw.family_younger_sister));
        word.add(new Word("grandmother", "ama",R.drawable.family_grandmother,R.raw.family_grandmother));
        word.add(new Word("grandfather", "paapa",R.drawable.family_grandfather,R.raw.family_grandfather));


        WordAdapter wordAdapter = new WordAdapter(this, word,R.color.category_family);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(wordAdapter);
    }
}
