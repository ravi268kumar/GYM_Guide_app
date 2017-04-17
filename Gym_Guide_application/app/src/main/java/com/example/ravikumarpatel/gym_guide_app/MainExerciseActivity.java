package com.example.ravikumarpatel.gym_guide_app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainExerciseActivity extends AppCompatActivity {

    ArrayList<Exercise> arrayList;
    ListView mainListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_exercise);

        arrayList = new ArrayList<>();
        arrayList.add(new Exercise(R.drawable.abdominal,"ABDOMINAL"));
        arrayList.add(new Exercise(R.drawable.back,"BACK"));
        arrayList.add(new Exercise(R.drawable.biceps_best,"BICEPS"));
        arrayList.add(new Exercise(R.drawable.chest,"CHEST"));
        arrayList.add(new Exercise(R.drawable.legs,"LEGS"));
        arrayList.add(new Exercise(R.drawable.shoulders,"SHOULDERS"));
        arrayList.add(new Exercise(R.drawable.triceps,"TRICEPS"));
        arrayList.add(new Exercise(R.drawable.stretching,"STRETCHING"));


        mainListView = (ListView) findViewById(R.id.mainList);

        mainListView.setAdapter(new MainListAdapter(this,arrayList));
    }
}
