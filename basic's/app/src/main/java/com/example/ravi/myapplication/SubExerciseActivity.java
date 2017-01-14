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
        first_sub.add(new SubExercise(R.drawable.ab_roller, "AB ROLLER"));
        first_sub.add(new SubExercise(R.drawable.bicycle_crunches, "BICYCLE CRUNCHES"));

        first_sub.add(new SubExercise(R.drawable.bottoms_up, "BOTTOMS UP STANDING"));
        first_sub.add(new SubExercise(R.drawable.abs_crunch, "CRUNCHES"));

        first_sub.add(new SubExercise(R.drawable.decline_crunches, "DECLINE CRUNCHES"));
        first_sub.add(new SubExercise(R.drawable.hanging_upside, "HANGING UPSIDE"));

        first_sub.add(new SubExercise(R.drawable.cable_seated_crunches, "CABLESEATED CRUNCHES"));
        first_sub.add(new SubExercise(R.drawable.lying_leg_raise, "LYING LEG RAISE"));

        first_sub.add(new SubExercise(R.drawable.plank, "PLANK"));
        first_sub.add(new SubExercise(R.drawable.side_lateral_bend, "SIDELATERAL BENT"));

        first_sub.add(new SubExercise(R.drawable.side_plank, "SIDE PLANK"));
        first_sub.add(new SubExercise(R.drawable.v_up_abs, "V-UP ABS"));

        first_sub.add(new SubExercise(R.drawable.bent_knee_hip_raise, "NENT KNEE HIP RAISE"));
        first_sub.add(new SubExercise(R.drawable.butts_up, "BUTTS UP"));

        first_sub.add(new SubExercise(R.drawable.cable_twists, "CABLE TWISTS"));
        first_sub.add(new SubExercise(R.drawable.decline_oblique_crun, "DECLINE OBLIQUE CRUNCHES"));





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
