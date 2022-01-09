package com.example.zhest;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GestureDetectorCompat;

import android.os.Bundle;
import android.view.GestureDetector;
import android.view.Gravity;
import android.view.MotionEvent;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
        implements GestureDetector.OnGestureListener, GestureDetector.OnDoubleTapListener {
    private GestureDetectorCompat gestureDetector;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gestureDetector=new GestureDetectorCompat(this,this);
        gestureDetector.setOnDoubleTapListener(this);
    }

    public boolean onTouchEvent (MotionEvent event){
        if (this.gestureDetector.onTouchEvent(event)) {
            return  true;}
        return  super.onTouchEvent(event);
        }

    @Override
    public boolean releaseInstance() {
        return false;
    }


    @Override
    public boolean onSingleTapConfirmed(MotionEvent e) {
        return false;
    }

    @Override
    public boolean onDoubleTap(MotionEvent e) {
        Toast toast1= Toast.makeText(MainActivity.this,
                "Двойное нажатие", Toast.LENGTH_SHORT);
        toast1.setGravity(Gravity.CENTER,0,10);
        toast1.show();
        return true;
    }

    @Override
    public boolean onDoubleTapEvent(MotionEvent e) {
        return false;
    }

    @Override
    public boolean onDown(MotionEvent e) {
        return false;
    }

    @Override
    public void onShowPress(MotionEvent e) {

    }

    @Override
    public boolean onSingleTapUp(MotionEvent e) {
        Toast toast3= Toast.makeText(MainActivity.this,
                "Отпущенное одиночное нажатие", Toast.LENGTH_SHORT);
        toast3.setGravity(Gravity.CENTER,0,10);
        toast3.show();
        return true;

    }

    @Override
    public boolean onScroll(MotionEvent e1, MotionEvent e2, float distanceX, float distanceY) {
        Toast toast3= Toast.makeText(MainActivity.this,
                "Скроллинг", Toast.LENGTH_SHORT);
        toast3.setGravity(Gravity.CENTER,0,10);
        toast3.show();
        return false;
    }

    @Override
    public void onLongPress(MotionEvent e) {
        Toast toast2= Toast.makeText(MainActivity.this,
                "Долгое нажатие", Toast.LENGTH_SHORT);
        toast2.setGravity(Gravity.CENTER,0,10);
        toast2.show();
    }

    @Override
    public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY) {
        Toast toast3= Toast.makeText(MainActivity.this,
                "Свайпинг", Toast.LENGTH_SHORT);
        toast3.setGravity(Gravity.CENTER,0,10);
        toast3.show();
        return false;
    }
}