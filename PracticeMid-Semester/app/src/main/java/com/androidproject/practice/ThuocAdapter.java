package com.androidproject.practice;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class ThuocAdapter extends RecyclerView.Adapter<ThuocAdapter.ThuocViewHolder> {
    private List<ItemData> list;

    public ThuocAdapter(List<ItemData> list) {
        this.list = list;
    }

    @NonNull @Override
    public ThuocViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_row, parent, false);
        return new ThuocViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ThuocViewHolder holder, int position) {
        ItemData item = list.get(position);
        holder.tvTen.setText(item.ten);
        holder.img.setImageResource(item.hinh);
    }

    @Override
    public int getItemCount() { return list.size(); }

    static class ThuocViewHolder extends RecyclerView.ViewHolder {
        TextView tvTen;
        ImageView img;
        public ThuocViewHolder(@NonNull View itemView) {
            super(itemView);
            tvTen = itemView.findViewById(R.id.tvTen);
            img = itemView.findViewById(R.id.img);
        }
    }
}