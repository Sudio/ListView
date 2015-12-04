package com.xueyu.listviewholder;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.AbsListView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private static String TAG = "TEST";
    private ListView listView;
    private List<String> mDatas;
    private ViewHolderAdapter listAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mDatas = new ArrayList<String>();
        listView = (ListView) findViewById(R.id.listview);
        listAdapter = new ViewHolderAdapter(mDatas, this);
        for (int i = 0; i < 20; i++) {
            String data = "listview" + i;
            mDatas.add(data);
        }
        listView.setAdapter(listAdapter);


        listView.setOnScrollListener(new AbsListView.OnScrollListener() {
            @Override
            public void onScrollStateChanged(AbsListView view, int scrollState) {
                switch (scrollState) {
                    case SCROLL_STATE_IDLE:
                        Log.e(TAG, "SCROLL_STATE_IDLE");
                        break;
                    case SCROLL_STATE_TOUCH_SCROLL:
                        Log.e(TAG, "SCROLLING");
                        break;
                    case SCROLL_STATE_FLING:
                        Log.e(TAG, "FLING");
                        break;
                }
            }

            @Override
            public void onScroll(AbsListView view, int firstVisibleItem, int visibleItemCount, int totalItemCount) {
//                Log.d(TAG,"onScroll");
                int lastVisibleItem = firstVisibleItem + visibleItemCount;
                Log.e(TAG, firstVisibleItem + "\t" + visibleItemCount + "\t" + totalItemCount);
            }
        });

    }

    public void btnAdd(View view) {
        mDatas.add("new");
        listAdapter.notifyDataSetChanged();
        listView.setSelection(mDatas.size() - 1);
    }
}
