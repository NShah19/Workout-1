package com.example.kho.workout;

import android.content.Intent;
import android.view.View;
import android.widget.ListView;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button startWorkoutButton;
    Button editWorkoutButton;
    Button tipsButton;
    Button optionsButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editWorkoutButton = (Button)findViewById(R.id.editButton);
        editWorkoutButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, editWorkoutActivity.class);
                startActivity(i);
            }
        });

        tipsButton = (Button)findViewById(R.id.workoutButton);
        tipsButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, workoutTips.class);
                startActivity(i);
            }
        });

    }
}


