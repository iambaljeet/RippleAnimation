package com.baljeet.rippleanimation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.baljeet.rippleanimation.view.RippleBackground;

public class MainActivity extends AppCompatActivity {

    private RippleBackground rippleBackground;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rippleBackground = findViewById(R.id.content);

        rippleBackground.startRippleAnimation();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        rippleBackground.stopRippleAnimation();
    }
}