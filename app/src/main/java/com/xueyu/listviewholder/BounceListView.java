package com.xueyu.listviewholder;

import android.content.Context;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.widget.ListView;

/**
 * Created by Flim on 2015/12/4.
 */
public class BounceListView extends ListView {
    private Context mContext;
    public BounceListView(Context context) {
        super(context);
        mContext = context;
    }

    public BounceListView(Context context, AttributeSet attrs) {
        super(context, attrs);
        mContext = context;
    }

    public BounceListView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        mContext = context;
    }

    @Override
    protected boolean overScrollBy(int deltaX, int deltaY, int scrollX, int scrollY, int scrollRangeX, int scrollRangeY, int maxOverScrollX, int maxOverScrollY, boolean isTouchEvent) {
        maxOverScrollY = initView(maxOverScrollY);

        return super.overScrollBy(deltaX, deltaY, scrollX, scrollY, scrollRangeX, scrollRangeY, maxOverScrollX, maxOverScrollY, isTouchEvent);
    }

    public int initView(int mMaxOverDistance){
        DisplayMetrics metrics = mContext.getResources().getDisplayMetrics();
        float density = metrics.density;
        mMaxOverDistance = (int) (density*mMaxOverDistance);
        return mMaxOverDistance;
    }
}
