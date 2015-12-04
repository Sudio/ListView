package com.xueyu.listviewholder;

import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;

import java.util.Currency;

/**
 * Created by Flim on 2015/12/4.
 */
public class MyTouchListener implements View.OnTouchListener {
    float mFirstY = 0;
    float mCurrentY = 0;
    int direction = 0;
    final int mTouchSlop= ViewConfiguration.get(MyApplication.getmContext()).getScaledTouchSlop();
    public boolean onTouch(View v, MotionEvent event) {
        switch (event.getAction()){
            case MotionEvent.ACTION_DOWN:
                mFirstY = event.getY();
                break;
            case MotionEvent.ACTION_MOVE:
                mCurrentY = event.getY();
                if(mCurrentY-mFirstY>mTouchSlop){
                    direction = 0;//down
                    Log.e("TEST","DOWN");
                }else if(mFirstY - mCurrentY > mTouchSlop){
                    direction = 1;//up
                    Log.e("TEST","UP");
                }
                if(direction ==1){
                    if(true){}
                }
                break;
            case MotionEvent.ACTION_UP:
                break;

        }
        return false;
    }
}
