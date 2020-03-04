package robby.hermando.appintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Main3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
    }

    public void klik1(View view) {
        Intent baru3 = new Intent(Main3Activity.this, MainActivity.class);
        startActivity(baru3);
    }
}
