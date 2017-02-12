package com.example.kho.workout;

import android.content.Intent;
import android.speech.RecognizerIntent;
import android.speech.tts.TextToSpeech;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.List;
import java.util.Locale;

import static android.speech.tts.TextToSpeech.Engine.KEY_PARAM_STREAM;

public class startWorkActivity extends AppCompatActivity{
    private TextToSpeech tts;
    private Button speakButton;
    private EditText inputText;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_work);

//        inputText = (EditText) findViewById(R.id.editText1);
//        tts = new TextToSpeech(this, this);
//
//        speakButton = (Button) findViewById(R.id.button1);
//        // button on click event
//        speakButton.setOnClickListener(new View.OnClickListener() {
//
//            @Override
//            public void onClick(View arg0) {
//                speakText();
//            }
//
//        });
    }

//    @Override
//    public void onDestroy() {
//        // Don't forget to shutdown tts!
//        if (tts != null) {
//            tts.stop();
//            tts.shutdown();
//        }
//        super.onDestroy();
//    }
//
//    @Override
//    public void onInit(int status) {
//
//        if (status == TextToSpeech.SUCCESS) {
//
//            int result = tts.setLanguage(Locale.US);
//
//            if (result == TextToSpeech.LANG_MISSING_DATA
//                    || result == TextToSpeech.LANG_NOT_SUPPORTED) {
//                Log.e("TTS", "This Language is not supported");
//            } else {
//                speakButton.setEnabled(true);
//                speakText();
//            }
//
//        } else {
//            Log.e("TTS", "Initilization Failed!");
//        }
//
//    }
//
//    private void speakText() {
//
//        CharSequence toSpeak = inputText.getText().toString();
//
//        tts.speak(toSpeak, TextToSpeech.QUEUE_FLUSH, null);
//    }

//    private static final int SPEECH_REQUEST_CODE = 0;
//    Button startWorkout;
//    TextToSpeech engine;
//
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_start_work);
//
//        engine = new TextToSpeech(this, this);
//
//        startWorkout = (Button)findViewById(R.id.startButton);
//        startWorkout.setOnClickListener(new View.OnClickListener() {
//            public void onClick(View view) {
////                speech();
//                engine.speak("Beginning", TextToSpeech.QUEUE_ADD, Bundle(KEY_PARAM_STREAM), "ID");
//            }
//        });
//
//    }
//
//    @Override
//    public void onInit(int status) {
//        Log.d("Speech", "OnInit - Status ["+status+"]");
//        if (status == TextToSpeech.SUCCESS) {
//            Log.d("Speech", "Success!");
//            engine.setLanguage(Locale.UK);
//        }
//    }
//
//
//    private void speech() {
//        engine.speak("Beginning Workout.  Say Done to continue exercise.", TextToSpeech.QUEUE_FLUSH, null, null);
//    }

}
