package com.example.monikkk.gurbanitutor;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.view.MotionEvent;
import android.view.GestureDetector;
import android.support.v4.view.GestureDetectorCompat;
import android.media.MediaPlayer;
import android.net.Uri;
import android.app.Activity;
import android.view.Menu;
import android.widget.MediaController;
import android.widget.VideoView;
import android.media.MediaPlayer;
import android.os.Environment;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;



public class ReadingActivity extends AppCompatActivity implements GestureDetector.OnGestureListener,GestureDetector.OnDoubleTapListener {
    private TextView tv1;
    private TextView tv2;
    private GestureDetectorCompat gdc1;
    private MediaPlayer mp;
    Button play,pause;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reading);

        play=(Button)findViewById(R.id.button2);
        pause=(Button)findViewById(R.id.button);
        tv1=(TextView) findViewById(R.id.textView10);
        tv2=(TextView) findViewById(R.id.textView8);
        this.gdc1=new GestureDetectorCompat(this,this);
        gdc1.setOnDoubleTapListener(this);

        mp= MediaPlayer.create(this,R.raw.a1);

        // Font path
        String fontPath = "fonts/AMRLIPI.TTF";

        // text view label
        TextView txtGhost1 = (TextView) findViewById(R.id.textView10);
        TextView txtGhost2 = (TextView) findViewById(R.id.textView8);
        // Loading Font Face
        Typeface tf = Typeface.createFromAsset(getAssets(), fontPath);

        // Applying font
        txtGhost1.setTypeface(tf);
        txtGhost2.setTypeface(tf);

    }

    public void playButtonMethod(View view)
    {mp.start();}

    public void pauseButtonMethod(View view)
    {mp.pause();}

    @Override
    public boolean onSingleTapConfirmed(MotionEvent e) {
        mp.pause();
        return true;
    }

    @Override
    public boolean onDoubleTap(MotionEvent e) {
        mp.start();
        return true;
    }

    @Override
    public boolean onDoubleTapEvent(MotionEvent e) {
        return true;
    }

    @Override
    public boolean onDown(MotionEvent e) {
        return true;
    }

    @Override
    public void onShowPress(MotionEvent e) {

    }

    @Override
    public boolean onSingleTapUp(MotionEvent e) {
        return true;
    }

    @Override
    public boolean onScroll(MotionEvent e1, MotionEvent e2, float distanceX, float distanceY) {
        return true;
    }

    @Override
    public void onLongPress(MotionEvent e) {
    }

    @Override
    public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY) {
        return true;
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        this.gdc1.onTouchEvent(event);
        return super.onTouchEvent(event);
    }
}