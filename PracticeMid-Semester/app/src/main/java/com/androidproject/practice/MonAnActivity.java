package com.androidproject.practice;

import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;
import java.util.List;

public class MonAnActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mon_an);

        ListView lv = findViewById(R.id.listViewMonAn);
        List<ItemData> data = new ArrayList<>();

        // Thêm dữ liệu mẫu
        data.add(new ItemData("Phở Bò", "Đặc sản Hà Nội", R.mipmap.ic_launcher));
        data.add(new ItemData("Bún Chả", "Ngon tuyệt vời", R.mipmap.ic_launcher));
        data.add(new ItemData("Cơm Tấm", "Sài Gòn nức tiếng", R.mipmap.ic_launcher));

        MonAnAdapter adapter = new MonAnAdapter(this, data);
        lv.setAdapter(adapter);
    }
    public void backToMain(android.view.View v) {
        finish(); // Lệnh này sẽ đóng màn hình hiện tại và tự động hiện lại màn hình trước đó (MainActivity)
    }
}