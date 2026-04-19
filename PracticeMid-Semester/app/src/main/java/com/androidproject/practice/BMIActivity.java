package com.androidproject.practice;
import android.os.Bundle;
import android.view.View;
import android.widget.*;
import androidx.appcompat.app.AppCompatActivity;

public class BMIActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bmi);
        EditText edCao = findViewById(R.id.edChieuCao);
        EditText edNang = findViewById(R.id.edCanNang);
        Button btn = findViewById(R.id.btnTinh);
        TextView tv = findViewById(R.id.tvKQ);

        btn.setOnClickListener(v -> {
            float cao = Float.parseFloat(edCao.getText().toString()) / 100;
            float nang = Float.parseFloat(edNang.getText().toString());
            float bmi = nang / (cao * cao);
            String loai = (bmi < 18.5) ? "Gầy" : (bmi < 25) ? "Bình thường" : "Béo phì";
            tv.setText("BMI: " + String.format("%.1f", bmi) + " - " + loai);
        });
    }
    public void backToMain(android.view.View v) {
        finish(); // Lệnh này sẽ đóng màn hình hiện tại và tự động hiện lại màn hình trước đó (MainActivity)
    }
}