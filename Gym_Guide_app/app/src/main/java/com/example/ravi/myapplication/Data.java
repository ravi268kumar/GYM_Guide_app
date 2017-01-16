package com.example.ravi.myapplication;

    import android.support.v7.app.AppCompatActivity;
    import android.os.Bundle;
    import android.widget.ListView;

    import java.util.ArrayList;

public class Data extends AppCompatActivity {

        ArrayList<SubExercise> abdominal;
        ArrayList<SubExercise> Biceps;
        ArrayList<SubExercise> Chest;
        ArrayList<SubExercise> Legs;
        ArrayList<SubExercise> Shoulder;
        ArrayList<SubExercise> Triceps;
        ArrayList<SubExercise> Stretching;

        ListView subListView;
        private ArrayList<SubExercise> back;


        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_sub_exercise);

            String title = getIntent().getExtras().getString("title");

            abdominal = new ArrayList<>();
            abdominal.add(new SubExercise(R.drawable.ab_roller, "AB ROLLER"));
            abdominal.add(new SubExercise(R.drawable.bicycle_crunches, "BICYCLE CRUNCHES"));

            abdominal.add(new SubExercise(R.drawable.bottoms_up, "BOTTOMS UP STANDING"));
            abdominal.add(new SubExercise(R.drawable.abs_crunch, "CRUNCHES"));

            abdominal.add(new SubExercise(R.drawable.decline_crunches, "DECLINE CRUNCHES"));
            abdominal.add(new SubExercise(R.drawable.hanging_upside, "HANGING UPSIDE"));

            abdominal.add(new SubExercise(R.drawable.cable_seated_crunches, "CABLESEATED CRUNCHES"));
            abdominal.add(new SubExercise(R.drawable.lying_leg_raise, "LYING LEG RAISE"));

            abdominal.add(new SubExercise(R.drawable.plank, "PLANK"));
            abdominal.add(new SubExercise(R.drawable.side_lateral_bend, "SIDELATERAL BENT"));

            abdominal.add(new SubExercise(R.drawable.side_plank, "SIDE PLANK"));
            abdominal.add(new SubExercise(R.drawable.v_up_abs, "V-UP ABS"));

            abdominal.add(new SubExercise(R.drawable.bent_knee_hip_raise, "NENT KNEE HIP RAISE"));
            abdominal.add(new SubExercise(R.drawable.butts_up, "BUTTS UP"));

            abdominal.add(new SubExercise(R.drawable.cable_twists, "CABLE TWISTS"));
            abdominal.add(new SubExercise(R.drawable.decline_oblique_crun, "DECLINE OBLIQUE CRUNCHES"));



            back = new ArrayList<>();


            back.add(new SubExercise(R.drawable.plank, "PLANK"));
            back.add(new SubExercise(R.drawable.side_lateral_bend, "SIDELATERAL BENT"));

            back.add(new SubExercise(R.drawable.side_plank, "SIDE PLANK"));
            back.add(new SubExercise(R.drawable.v_up_abs, "V-UP ABS"));


            Biceps =new ArrayList<>();

            Biceps.add(new SubExercise(R.drawable.side_plank, "SIDE PLANK"));
            Biceps.add(new SubExercise(R.drawable.v_up_abs, "V-UP ABS"));

            Chest =new ArrayList<>();
            Chest.add(new SubExercise(R.drawable.v_up_abs, "V-UP ABS"));

            Legs =new ArrayList<>();
            Legs.add(new SubExercise(R.drawable.v_up_abs, "V-UP ABS"));

            Shoulder =new ArrayList<>();
            Legs.add(new SubExercise(R.drawable.v_up_abs, "V-UP ABS"));


            Triceps =new ArrayList<>();
            Legs.add(new SubExercise(R.drawable.v_up_abs, "V-UP ABS"));

            Stretching =new ArrayList<>();
            Legs.add(new SubExercise(R.drawable.v_up_abs, "V-UP ABS"));


            subListView = (ListView) findViewById(R.id.subList);







            switch (title){
                case "ABDOMINAL":
                    subListView.setAdapter(new SubListAdapter(this, abdominal));
                    break;
                case "BACK":
                    subListView.setAdapter(new SubListAdapter(this, back));
                    break;
                case "BICEPS":
                    break;
                case "CHEST":
                    break;
                case "LEGS":
                    break;
                case "SHOULDER":
                    break;
                case "TRICEPS":
                    break;
                case "STRETCHING":
                    break;
                default:
                    break;

            }


        }
    }


