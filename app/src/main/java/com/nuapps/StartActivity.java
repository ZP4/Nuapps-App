package com.nuapps;

import android.graphics.Color;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class StartActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

        setTitle("");
        Typeface custom_font = Typeface.createFromAsset(getAssets(),  "fonts/SourceCodePro-Bold.ttf");

        TypeWriter startActWriter = (TypeWriter)findViewById(R.id.Typewriter);
        startActWriter.setCharacterDelay(175);
        startActWriter.setTypeface(custom_font);
        startActWriter.setTextColor(Color.BLACK);
        startActWriter.animateText("Nuapps_");

    }
}
