package com.androidproject.danhsachtinhthanh;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        ArrayList<String> dsTentinhthanhVN;
        dsTentinhthanhVN =  new ArrayList<String>();
        dsTentinhthanhVN.add("Ha Noi");
        dsTentinhthanhVN.add("Thanh pho Ho Chi Minh");
        dsTentinhthanhVN.add("Khanh Hoa");
        dsTentinhthanhVN.add("Da Nang");
        dsTentinhthanhVN.add("Phu Yen");
        dsTentinhthanhVN.add("Lam Dong");

        ArrayAdapter<String> adapterTinhthanh;
        adapterTinhthanh = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,dsTentinhthanhVN);
        ListView lvTenTinhthanh = findViewById(R.id.lvDanhSachTT);
        lvTenTinhthanh.setAdapter(adapterTinhthanh);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}