package com.example.ravikumarpatel.gym_guide_app;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);


        String title = getIntent().getExtras().getString("title");

        Toast.makeText(this,title,Toast.LENGTH_LONG).show();

    }
}
