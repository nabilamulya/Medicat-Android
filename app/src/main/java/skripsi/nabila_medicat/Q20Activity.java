package skripsi.nabila_medicat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Q20Activity extends AppCompatActivity {
    Button lanjut20, kembali20;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q20);

        lanjut20 = (Button) findViewById(R.id.Lanjut_20);
//        kembali20 = (Button) findViewById(R.id.Kembali_20);

        lanjut20.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intentLanjut = new Intent(Q20Activity.this, Q21Activity.class);
                startActivity(intentLanjut);
//
//                Intent intentKembali = new Intent(Q20Activity.this, Q19Activity.class);
//                startActivity(intentKembali);
            }
        });
    }
}