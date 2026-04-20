package thigk2.DangHoangDuong.thigk;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class ChucNang1Activity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chuc_nang1);
        findViewById(R.id.btnDoi).setOnClickListener(v -> {
            String s = ((EditText)findViewById(R.id.edVND)).getText().toString();
            if(!s.isEmpty()) {
                double usd = Double.parseDouble(s) / 25400;
                ((TextView)findViewById(R.id.tvKQ)).setText(String.format("Kết quả: %.2f USD", usd));
            }
        });
    }
    public void finishActivity(View v) { finish(); }
}