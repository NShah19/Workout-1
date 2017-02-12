package com.example.kho.workout;

import android.support.v7.app.AppCompatActivity;
import android.speech.tts.TextToSpeech;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.Locale;

import static android.speech.tts.TextToSpeech.Engine.KEY_PARAM_STREAM;

public class startWorkActivity extends AppCompatActivity implements TextToSpeech.OnInitListener{
    EditText getTextToSpeak;
    Button speak;
    TextToSpeech tts;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_work);

        tts = new TextToSpeech(this, this);
//        getTextToSpeak = (EditText) findViewById(R.id.editTextT);
        speak = (Button)findViewById(R.id.startButton);
        speak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                speakOutNow();
            }
        });


    }

    @Override
    public void onInit (int text) {
        if(text == TextToSpeech.SUCCESS){
            int language = tts.setLanguage(Locale.ENGLISH);
            if(language == TextToSpeech.LANG_MISSING_DATA || language == TextToSpeech.LANG_NOT_SUPPORTED){
                speak.setEnabled(true);
                speakOutNow();
            } else {

            }
        } else {

        }
    }

    private void speakOutNow (){
        String text = "Beginning Workout";
        tts.speak(text, TextToSpeech.QUEUE_FLUSH, null);
    }
}
