package com.example.kho.workout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;


public class editWorkoutActivity extends AppCompatActivity {
    private Button addExercise;
    private EditText exerciseName;
    private EditText numSets;
    private EditText numReps;

    private ListView exerciseList;
    private ListView setsList;
    private ListView repsList;

    private ArrayList<String> exerciseArray;
    private ArrayList<String> setsArray;
    private ArrayList<String> repsArray;


    private ArrayAdapter<String> exerciseAdapter;
    private ArrayAdapter<String> setsAdapter;
    private ArrayAdapter<String> repsAdapter;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_workout);

        exerciseList = (ListView) findViewById(R.id.exListView);
        setsList = (ListView) findViewById(R.id.setsListView);
        repsList = (ListView) findViewById(R.id.repsListView);

        addExercise = (Button) findViewById(R.id.enterValues);
        exerciseName = (EditText) findViewById(R.id.newExercise);
        numSets = (EditText) findViewById(R.id.newSets);
        numReps = (EditText) findViewById(R.id.newReps);

        exerciseArray = new ArrayList<String>();
        exerciseAdapter = new ArrayAdapter<String>(
                this,
                android.R.layout.simple_list_item_1,
                exerciseArray
        );
        exerciseList.setAdapter(exerciseAdapter);

        setsArray = new ArrayList<String>();
        setsAdapter = new ArrayAdapter<String>(
                this,
                android.R.layout.simple_list_item_1,
                setsArray
        );
        setsList.setAdapter(setsAdapter);

        repsArray = new ArrayList<String>();
        repsAdapter = new ArrayAdapter<String>(
                this,
                android.R.layout.simple_list_item_1,
                repsArray
        );
        repsList.setAdapter(repsAdapter);

        exerciseAdapter.add("Bench Press");
        setsAdapter.add("3");
        repsAdapter.add("15");

        exerciseAdapter.add("Bicep Curls");
        setsAdapter.add("2");
        repsAdapter.add("20");

        //respond to our button presses

        addExercise.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String input1 = exerciseName.getText().toString();
                String input2 = numSets.getText().toString();
                String input3 = numReps.getText().toString();
                if (input1.isEmpty() || input2.isEmpty() || input3.isEmpty()) {
                    return;
                }
                exerciseAdapter.add(input1);
                exerciseName.setText("");

                setsAdapter.add(input2);
                numSets.setText("");

                repsAdapter.add(input3);
                numReps.setText("");

            }

        });

    }

}
