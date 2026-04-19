package com.androidproject.practice;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class ThuocActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thuoc);

        RecyclerView rv = findViewById(R.id.recyclerViewThuoc);
        rv.setLayoutManager(new LinearLayoutManager(this));

        List<ItemData> data = new ArrayList<>();
        data.add(new ItemData("Panadol", "Giảm đau, hạ sốt", R.mipmap.ic_launcher));
        data.add(new ItemData("Amoxicillin", "Thuốc kháng sinh", R.mipmap.ic_launcher));
        data.add(new ItemData("Vitamin C", "Tăng đề kháng", R.mipmap.ic_launcher));

        ThuocAdapter adapter = new ThuocAdapter(data);
        rv.setAdapter(adapter);

    }
    public void backToMain(View v) {
        finish(); // Lệnh này sẽ đóng activity hiện tại và quay về cái trước đó
    }
}