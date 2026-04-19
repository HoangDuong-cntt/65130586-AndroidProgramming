package com.androidproject.practice;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void navigate(View v) {
        int id = v.getId();
        if (id == R.id.btnBMI) startActivity(new Intent(this, BMIActivity.class));
        else if (id == R.id.btnMonAn) startActivity(new Intent(this, MonAnActivity.class));
        else if (id == R.id.btnBaiThuoc) startActivity(new Intent(this, ThuocActivity.class));
        else if (id == R.id.btnGioiThieu) startActivity(new Intent(this, IntroActivity.class));
    }
}