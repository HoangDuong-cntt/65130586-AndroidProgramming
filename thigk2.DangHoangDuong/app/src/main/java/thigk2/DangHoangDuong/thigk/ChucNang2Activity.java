package thigk2.DangHoangDuong.thigk;

import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;

public class ChucNang2Activity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        ListView lv = findViewById(R.id.listView);
        ArrayList<ItemData> list = new ArrayList<>();

        list.add(new ItemData("Tiến Quân Ca", "Văn Cao", R.mipmap.ic_launcher));
        list.add(new ItemData(" Đặng Hoàng Dương", "Ca khúc đặc biệt", R.drawable.user_profile));
        list.add(new ItemData("Giải phóng Miền Nam", "Lưu Hữu Phước", R.mipmap.ic_launcher));
        list.add(new ItemData("Cô gái vót chông", "Hoàng Hiệp", R.mipmap.ic_launcher));
        list.add(new ItemData("Hành khúc ngày và đêm", "Phan Huỳnh Điểu", R.mipmap.ic_launcher));
        list.add(new ItemData("Trường Sơn Đông", "Hoàng Hiệp", R.mipmap.ic_launcher));
        list.add(new ItemData("Hò kéo pháo", "Hoàng Vân", R.mipmap.ic_launcher));
        list.add(new ItemData("Chào anh giải phóng", "Hoàng Vân", R.mipmap.ic_launcher));
        list.add(new ItemData("Sóc Bom Bo", "Xuân Hồng", R.mipmap.ic_launcher));
        list.add(new ItemData("Bài ca hy vọng", "Văn Ký", R.mipmap.ic_launcher));

        MyAdapter adapter = new MyAdapter(this, list);
        lv.setAdapter(adapter);
    }

    public void finishActivity(View v) {
        finish();
    }
}