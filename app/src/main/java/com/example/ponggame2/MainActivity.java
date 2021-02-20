package com.example.ponggame2;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Point;
import android.os.Bundle;
import android.view.Display;

public class MainActivity extends AppCompatActivity {
    private PongGame mPongGame;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Display display = getWindowManager().getDefaultDisplay();
        Point size = new Point();
        display.getSize(size);
        mPongGame = new PongGame(this, size.x, size.y);
        setContentView(mPongGame  );
        super.onCreate(savedInstanceState);
    }
    @Override
    protected void onResume() {
        super.onResume();
        mPongGame.resume();
    }
    @Override
    protected void onPause() {
        super.onPause();
        mPongGame.pause();
    }
}
