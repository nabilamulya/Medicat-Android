package skripsi.nabila_medicat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Q3Activity extends AppCompatActivity {
    Button lanjut3, kembali3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q3);

        lanjut3 = (Button) findViewById(R.id.Lanjut_3);
//        kembali3 = (Button) findViewById(R.id.Kembali_3);

        lanjut3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intentLanjut = new Intent(Q3Activity.this, Q4Activity.class);
                startActivity(intentLanjut);

            }
        });

//        kembali3.setOnClickListener(new View.OnClickListener() {
//
//            @Override
//            public void onClick(View view) {
//
//                Intent intentKembali = new Intent(Q3Activity.this, Q2Activity.class);
//                startActivity(intentKembali);
//            }
//        });
      }
}