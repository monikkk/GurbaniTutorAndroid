package com.example.monikkk.gurbanitutor;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.content.Intent;
import android.view.View;

public class MainStartActivity extends AppCompatActivity {

    public void onBackPressed()
    {
        moveTaskToBack(true);
        android.os.Process.killProcess(android.os.Process.myPid());
        System.exit(1);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_start);

        // Font path
        String fontPath = "fonts/AMRLIPI.TTF";

        // text view label
        TextView txtGhost = (TextView) findViewById(R.id.textView2);

        // Loading Font Face
        Typeface tf = Typeface.createFromAsset(getAssets(), fontPath);

        // Applying font
        txtGhost.setTypeface(tf);
    }
    public void ResumeButtonMethod(View view)
    {
        Intent i = new Intent(this,ReadingActivity.class);
        startActivity(i);
    }
}
