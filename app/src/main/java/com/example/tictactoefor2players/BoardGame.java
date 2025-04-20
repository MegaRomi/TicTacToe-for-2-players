package com.example.tictactoefor2players;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.MotionEvent;
import android.view.View;

import androidx.annotation.NonNull;

public class BoardGame extends View {

    private  Context context;

    public BoardGame(Context context) {

        super(context);
        this.context = context;
    }


    @Override
    protected void onDraw(@NonNull Canvas canvas) {
        super.onDraw(canvas);


    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        if (event.getAction()==MotionEvent.ACTION_DOWN){
            float x= event.getX();
            float y = event.getY();
            ((GameActivity)context).setPositionToFirebase(0,0);
        }


        return false;
    }
}
