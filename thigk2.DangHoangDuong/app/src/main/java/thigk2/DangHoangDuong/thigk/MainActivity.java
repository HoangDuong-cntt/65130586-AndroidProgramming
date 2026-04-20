package thigk2.DangHoangDuong.thigk;
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
    public void openCN1(View v) {
        startActivity(new Intent(this, ChucNang1Activity.class));
    }
    public void openCN2(View v) {
        startActivity(new Intent(this, ChucNang2Activity.class));
    }
    public void openCN3(View v) {
        startActivity(new Intent(this, ChucNang3Activity.class));
    }
    public void openCN4(View v) {
        startActivity(new Intent(this, ChucNang4Activity.class));
    }
}