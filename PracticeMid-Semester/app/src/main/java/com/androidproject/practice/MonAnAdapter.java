package com.androidproject.practice;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.List;

public class MonAnAdapter extends BaseAdapter {
    private Context context;
    private List<ItemData> list;

    public MonAnAdapter(Context context, List<ItemData> list) {
        this.context = context;
        this.list = list;
    }

    @Override
    public int getCount() { return list.size(); }

    @Override
    public Object getItem(int i) { return list.get(i); }

    @Override
    public long getItemId(int i) { return i; }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = LayoutInflater.from(context).inflate(R.layout.item_row, viewGroup, false);
        }

        ItemData item = list.get(i);
        TextView ten = view.findViewById(R.id.tvTen);
        ImageView hinh = view.findViewById(R.id.img);

        ten.setText(item.ten);
        hinh.setImageResource(item.hinh);

        return view;
    }
}