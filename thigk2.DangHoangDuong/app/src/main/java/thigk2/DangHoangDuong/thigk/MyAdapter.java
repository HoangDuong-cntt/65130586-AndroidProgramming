package thigk2.DangHoangDuong.thigk;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.List;

public class MyAdapter extends ArrayAdapter<ItemData> {
    // Sửa Constructor này cho đúng
    public MyAdapter(Context context, List<ItemData> objects) {
        super(context, 0, objects);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.item_row, parent, false);
        }

        ItemData item = getItem(position);

        ImageView img = convertView.findViewById(R.id.imgRow);
        TextView txt1 = convertView.findViewById(R.id.txtT1);
        TextView txt2 = convertView.findViewById(R.id.txtT2);

        if (item != null) {
            img.setImageResource(item.img);
            txt1.setText(item.t1);
            txt2.setText(item.t2);
        }

        return convertView;
    }
}