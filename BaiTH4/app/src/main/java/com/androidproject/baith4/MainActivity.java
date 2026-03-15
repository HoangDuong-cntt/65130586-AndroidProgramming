package com.androidproject.baith4;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
    public void Xulycong(View v){
        EditText editTextSo1 = (EditText)findViewById(R.id.edtSo1);
        EditText editTextSo2 = (EditText)findViewById(R.id.edtSo2);
        String sothu1 = editTextSo1.getText().toString();
        String sothu2 = editTextSo2.getText().toString();
        float soA = Float.parseFloat(sothu1);
        float soB = Float.parseFloat(sothu2);
        float Tong = soA + soB;
        EditText editTextKetQua = (EditText) findViewById(R.id.edtKQ);
        String chuoiKQ = String.valueOf(Tong);
        editTextKetQua.setText(chuoiKQ);
    }
    public void Xulytru(View v){
        EditText editTextSo1 = (EditText)findViewById(R.id.edtSo1);
        EditText editTextSo2 = (EditText)findViewById(R.id.edtSo2);
        String sothu1 = editTextSo1.getText().toString();
        String sothu2 = editTextSo2.getText().toString();
        float soA = Float.parseFloat(sothu1);
        float soB = Float.parseFloat(sothu2);
        float Tru = soA - soB;
        EditText editTextKetQua = (EditText) findViewById(R.id.edtKQ);
        String chuoiKQ = String.valueOf(Tru);
        editTextKetQua.setText(chuoiKQ);

    }
    public void Xulynhan(View v){
        EditText editTextSo1 = (EditText)findViewById(R.id.edtSo1);
        EditText editTextSo2 = (EditText)findViewById(R.id.edtSo2);
        String sothu1 = editTextSo1.getText().toString();
        String sothu2 = editTextSo2.getText().toString();
        float soA = Float.parseFloat(sothu1);
        float soB = Float.parseFloat(sothu2);
        float Nhan = soA * soB;
        EditText editTextKetQua = (EditText) findViewById(R.id.edtKQ);
        String chuoiKQ = String.valueOf(Nhan);
        editTextKetQua.setText(chuoiKQ);

    }
    public void Xulychia(View v){
        EditText editTextSo1 = (EditText)findViewById(R.id.edtSo1);
        EditText editTextSo2 = (EditText)findViewById(R.id.edtSo2);
        String sothu1 = editTextSo1.getText().toString();
        String sothu2 = editTextSo2.getText().toString();
        float soA = Float.parseFloat(sothu1);
        float soB = Float.parseFloat(sothu2);
        float Chia = soA / soB;
        EditText editTextKetQua = (EditText) findViewById(R.id.edtKQ);
        String chuoiKQ = String.valueOf(Chia);
        editTextKetQua.setText(chuoiKQ);
    }
}
