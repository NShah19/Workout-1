package com.example.kho.workout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;



public class workoutTips extends AppCompatActivity {
    Button armCircle;
    TextView armCircleText;
    Button planks;
    TextView planksText;
    Button shoulderCircle;
    TextView shoulderCircleText;

    Button benchPress;
    TextView benchPressText;
    Button deadLift;
    TextView deadLiftText;
    Button dips;
    TextView dipsText;
    Button invertedRows;
    TextView invertedRowsText;
    Button kneeLifts;
    TextView kneeLiftsText;
    Button latPulldowns;
    TextView latPulldownsText;
    Button pullups;
    TextView pullupsText;
    Button pushups;
    TextView pushupsText;
    Button overheadPress;
    TextView overheadPressText;
    Button squat;
    TextView squatText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_workout_tips);

        armCircle = (Button)findViewById(R.id.armCircleButton);
        armCircleText = (TextView)findViewById(R.id.armCircleText);
        armCircle.setOnClickListener(new View.OnClickListener() {
            int i = 1;
            public void onClick(View view) {
                if(i == 1) {
                    armCircleText.setVisibility(View.VISIBLE);
                    i *= -1;
                } else {
                    armCircleText.setVisibility(View.GONE);
                    i*=-1;
                }

            }
        });

        planks = (Button)findViewById(R.id.planksButton);
        planksText = (TextView)findViewById(R.id.plankText);
        planks.setOnClickListener(new View.OnClickListener() {
            int i = 1;
            public void onClick(View view) {
                if(i == 1) {
                    planksText.setVisibility(View.VISIBLE);
                    i *= -1;
                } else {
                    planksText.setVisibility(View.GONE);
                    i*=-1;
                }

            }
        });

        shoulderCircle = (Button)findViewById(R.id.shoulderCirclesButton);
        shoulderCircleText = (TextView)findViewById(R.id.shoulderCirclesText);
        shoulderCircle.setOnClickListener(new View.OnClickListener() {
            int i = 1;
            public void onClick(View view) {
                if(i == 1) {
                    shoulderCircleText.setVisibility(View.VISIBLE);
                    i *= -1;
                } else {
                    shoulderCircleText.setVisibility(View.GONE);
                    i*=-1;
                }

            }
        });

        benchPress = (Button)findViewById(R.id.benchPressButton);
        benchPressText = (TextView)findViewById(R.id.benchPressText);
        benchPress.setOnClickListener(new View.OnClickListener() {
            int i = 1;
            public void onClick(View view) {
                if(i == 1) {
                    benchPressText.setVisibility(View.VISIBLE);
                    i *= -1;
                } else {
                    benchPressText.setVisibility(View.GONE);
                    i*=-1;
                }

            }
        });

        deadLift = (Button)findViewById(R.id.deadliftButton);
        deadLiftText = (TextView)findViewById(R.id.deadliftText);
        deadLift.setOnClickListener(new View.OnClickListener() {
            int i = 1;
            public void onClick(View view) {
                if(i == 1) {
                    deadLiftText.setVisibility(View.VISIBLE);
                    i *= -1;
                } else {
                    deadLiftText.setVisibility(View.GONE);
                    i*=-1;
                }

            }
        });

        dips = (Button)findViewById(R.id.dipsButton);
        dipsText = (TextView)findViewById(R.id.dipsText);
        dips.setOnClickListener(new View.OnClickListener() {
            int i = 1;
            public void onClick(View view) {
                if(i == 1) {
                    dipsText.setVisibility(View.VISIBLE);
                    i *= -1;
                } else {
                    dipsText.setVisibility(View.GONE);
                    i*=-1;
                }

            }
        });

        invertedRows = (Button)findViewById(R.id.invertedRowsButton);
        invertedRowsText = (TextView)findViewById(R.id.invertedRowsText);
        invertedRows.setOnClickListener(new View.OnClickListener() {
            int i = 1;
            public void onClick(View view) {
                if(i == 1) {
                    invertedRowsText.setVisibility(View.VISIBLE);
                    i *= -1;
                } else {
                    invertedRowsText.setVisibility(View.GONE);
                    i*=-1;
                }

            }
        });

        kneeLifts = (Button)findViewById(R.id.kneeLiftsButton);
        kneeLiftsText = (TextView)findViewById(R.id.kneeLiftsText);
        kneeLifts.setOnClickListener(new View.OnClickListener() {
            int i = 1;
            public void onClick(View view) {
                if(i == 1) {
                    kneeLiftsText.setVisibility(View.VISIBLE);
                    i *= -1;
                } else {
                    kneeLiftsText.setVisibility(View.GONE);
                    i*=-1;
                }

            }
        });

        latPulldowns = (Button)findViewById(R.id.latPulldownButton);
        latPulldownsText = (TextView)findViewById(R.id.latPulldownText);
        latPulldowns.setOnClickListener(new View.OnClickListener() {
            int i = 1;
            public void onClick(View view) {
                if(i == 1) {
                    latPulldownsText.setVisibility(View.VISIBLE);
                    i *= -1;
                } else {
                    latPulldownsText.setVisibility(View.GONE);
                    i*=-1;
                }

            }
        });

        pullups = (Button)findViewById(R.id.pullupsButton);
        pullupsText = (TextView)findViewById(R.id.pullupsText);
        pullups.setOnClickListener(new View.OnClickListener() {
            int i = 1;
            public void onClick(View view) {
                if(i == 1) {
                    pullupsText.setVisibility(View.VISIBLE);
                    i *= -1;
                } else {
                    pullupsText.setVisibility(View.GONE);
                    i*=-1;
                }

            }
        });

        pushups = (Button)findViewById(R.id.pushUpsButton);
        pushupsText = (TextView)findViewById(R.id.pushUpsText);
        pushups.setOnClickListener(new View.OnClickListener() {
            int i = 1;
            public void onClick(View view) {
                if(i == 1) {
                    pushupsText.setVisibility(View.VISIBLE);
                    i *= -1;
                } else {
                    pushupsText.setVisibility(View.GONE);
                    i*=-1;
                }

            }
        });

        overheadPress = (Button)findViewById(R.id.overheadPressButton);
        overheadPressText = (TextView)findViewById(R.id.overheadPressText);
        overheadPress.setOnClickListener(new View.OnClickListener() {
            int i = 1;
            public void onClick(View view) {
                if(i == 1) {
                    overheadPressText.setVisibility(View.VISIBLE);
                    i *= -1;
                } else {
                    overheadPressText.setVisibility(View.GONE);
                    i*=-1;
                }

            }
        });

        squat = (Button)findViewById(R.id.squatButton);
        squatText = (TextView)findViewById(R.id.squatText);
        squat.setOnClickListener(new View.OnClickListener() {
            int i = 1;
            public void onClick(View view) {
                if(i == 1) {
                    squatText.setVisibility(View.VISIBLE);
                    i *= -1;
                } else {
                    squatText.setVisibility(View.GONE);
                    i*=-1;
                }

            }
        });
    }

    public void expandTextView(){

    }
}
