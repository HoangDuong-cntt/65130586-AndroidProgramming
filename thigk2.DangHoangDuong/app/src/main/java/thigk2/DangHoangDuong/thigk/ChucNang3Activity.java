package thigk2.DangHoangDuong.thigk;

import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;

public class ChucNang3Activity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chuc_nang3);

        ListView lv = findViewById(R.id.listView);
        ArrayList<ItemData> list = new ArrayList<>();

        // Hard-code 5 danh nhân (Ảnh, Tên, Quê quán)
        list.add(new ItemData("Võ Nguyên Giáp", "Quảng Bình", R.drawable.user_profile));
        list.add(new ItemData("Hồ Chí Minh", "Nghệ An", R.drawable.user_profile));
        list.add(new ItemData("Trần Hưng Đạo", "Nam Định", R.drawable.user_profile));
        list.add(new ItemData("Quang Trung", "Bình Định", R.drawable.user_profile));
        list.add(new ItemData("Nguyễn Trãi", "Hải Dương", R.drawable.user_profile));

        MyAdapter adapter = new MyAdapter(this, list);
        lv.setAdapter(adapter);
    }

    public void finishActivity(View v) {
        finish();
    }
}