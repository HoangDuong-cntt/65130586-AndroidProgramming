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
    public MyAdapter(Context ctx, List<ItemData> items) { super(ctx, 0, items); }
    @Override
    public View getView(int position, View v, ViewGroup parent) {
        if (v == null) v = LayoutInflater.from(getContext()).inflate(R.layout.item_row, parent, false);
        ItemData item = getItem(position);
        ((ImageView)v.findViewById(R.id.imgRow)).setImageResource(item.img);
        ((TextView)v.findViewById(R.id.txtT1)).setText(item.t1);
        ((TextView)v.findViewById(R.id.txtT2)).setText(item.t2);
        return v;
    }
}