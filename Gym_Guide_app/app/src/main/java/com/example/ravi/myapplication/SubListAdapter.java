package com.example.ravi.myapplication;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by ravi on 9/1/17.
 */

public class SubListAdapter extends ArrayAdapter<SubExercise>{
    ArrayList<SubExercise> exercises;
    Context context;
    ImageView imageView;
    TextView textView;


    public SubListAdapter(Context context , ArrayList<SubExercise> subExercises) {
        super(context, 0);
        this.context = context;
        this.exercises = subExercises;
    }



    @NonNull
    @Override
    public View getView(final int position, final View convertView, ViewGroup parent) {


        View view = LayoutInflater.from(context).inflate(R.layout.sample_item,null,false);
        imageView = (ImageView) view.findViewById(R.id.imageView);
        textView = (TextView) view.findViewById(R.id.item_title);

        imageView.setImageResource(exercises.get(position).img_id);
        textView.setText(exercises.get(position).title);

        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(context,DetailActivity.class);
                intent.putExtra("title",exercises.get(position).title);
                context.startActivity(intent);

            }
        });

        return view;//super.getView(position, convertView, parent);
    }

    @Override
    public int getCount() {
        return exercises.size();
    }
}

