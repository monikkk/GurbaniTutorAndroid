package com.example.monikkk.gurbanitutor;

import android.app.Activity;
import android.graphics.Typeface;
import android.content.Intent;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Somnath on 08-02-2016.
 */

public class Splash extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);

            // Font path
            String fontPath = "fonts/AMRLIPI.TTF";

            // text view label
            TextView txtGhost = (TextView) findViewById(R.id.TV2);

            // Loading Font Face
            Typeface tf = Typeface.createFromAsset(getAssets(), fontPath);

            // Applying font
            txtGhost.setTypeface(tf);

            final ImageView iv = (ImageView) findViewById(R.id.imageView);
            final Animation an = AnimationUtils.loadAnimation(getBaseContext(), R.anim.rotate);
            //final Animation an2 = AnimationUtils.loadAnimation(getBaseContext(),R.anim.abc_fade_out);
            iv.startAnimation(an);
            an.setAnimationListener(new Animation.AnimationListener() {
                @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                iv.startAnimation(an);
                finish();
                Intent i = new Intent(getBaseContext(), MainStartActivity.class);
                startActivity(i);
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });
    }
}

