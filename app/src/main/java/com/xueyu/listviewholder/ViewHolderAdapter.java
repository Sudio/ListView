package com.xueyu.listviewholder;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import static android.R.drawable.ic_dialog_info;

/**
 * Created by Flim on 2015/12/3.
 */
public class ViewHolderAdapter extends BaseAdapter {
    private List<String> mData;
    private LayoutInflater mInflater;

    public ViewHolderAdapter(List<String> mData, Context context) {
        this.mData = mData;
        this.mInflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return mData.size();
    }

    @Override
    public Object getItem(int position) {
        return mData.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder = null;
        if(convertView !=null){
            viewHolder = (ViewHolder) convertView.getTag();
        }else{
            viewHolder = new ViewHolder();
            convertView = mInflater.inflate(R.layout.item,null);
            viewHolder.img = (ImageView) convertView.findViewById(R.id.img_item);
            viewHolder.title = (TextView) convertView.findViewById(R.id.txt_item);
            convertView.setTag(viewHolder);

        }
        viewHolder.img.setBackgroundResource(android.R.drawable.editbox_background);
        viewHolder.title.setText(mData.get(position));
        return convertView;
    }

    public final class ViewHolder{
        public ImageView img;
        public TextView title;
    }
}
