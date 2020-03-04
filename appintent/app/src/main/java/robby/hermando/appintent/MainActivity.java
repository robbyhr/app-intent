package robby.hermando.appintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void klik(View view) {
        Intent baru = new Intent(MainActivity.this, Main2Activity.class);
                startActivity(baru);
    }

    public void klik3(View view) {
        Intent baru2 = new Intent(MainActivity.this, Main3Activity.class);
        startActivity(baru2);
    }
}
