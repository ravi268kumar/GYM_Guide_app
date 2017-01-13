package com.example.ravi.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class SubExerciseActivity extends AppCompatActivity {

    ArrayList<SubExercise> first_sub;
    ArrayList<SubExercise> second_sub;
    ListView subListView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub_exercise);

        String title = getIntent().getExtras().getString("title");

        first_sub = new ArrayList<>();
        first_sub.add(new SubExercise(R.drawable.img, "Abroller"));
        first_sub.add(new SubExercise(R.drawable.img2, "Biceps"));


        second_sub = new ArrayList<>();
        second_sub.add(new SubExercise(R.drawable.img, "Sit Ups"));
        second_sub.add(new SubExercise(R.drawable.img2, "Runnings"));


        subListView = (ListView) findViewById(R.id.subList);


        if (title.equals("First")) {
            subListView.setAdapter(new SubListAdapter(this, first_sub));

        } else {

            subListView.setAdapter(new SubListAdapter(this, second_sub));

        }


    }
}
