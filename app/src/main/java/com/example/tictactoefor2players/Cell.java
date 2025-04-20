package com.example.tictactoefor2players;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;

public class Cell {
    private int x,y;
    private  int cellWidth;
    private Bitmap bitmapX,bitmapO;

    private final int Xval = 0;
    private final int Oval = 1;
    private final int Emptyval = 2;

    private int val;
    private Paint p;


    public Cell(int x, int y, int cellWidth, Bitmap bitmapX, Bitmap bitmapO) {
        this.x = x;
        this.y = y;
        this.cellWidth = cellWidth;
        this.bitmapX = bitmapX;
        this.bitmapO = bitmapO;

        this.val =Emptyval;
        p= new Paint();
        p.setStrokeWidth(50);
        p.setStyle(Paint.Style.STROKE);

    }

    public void draw(Canvas canvas)
        {
            canvas.drawRect(x,y,x+cellWidth,y+cellWidth,p);
            if (val==Xval){
                canvas.drawBitmap(bitmapX,x+10,y+10,null);
            }
            if (val==Oval){
                canvas.drawBitmap(bitmapO,x+10,y+10,null);
            }

    }
}
