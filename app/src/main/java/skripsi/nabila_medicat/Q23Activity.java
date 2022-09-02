package skripsi.nabila_medicat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Q23Activity extends AppCompatActivity {
    Button lanjut23, kembali23;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q23);

        lanjut23 = (Button) findViewById(R.id.Lanjut_23);
//        kembali23 = (Button) findViewById(R.id.Kembali_23);

        lanjut23.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intentLanjut = new Intent(Q23Activity.this, Q24Activity.class);
                startActivity(intentLanjut);
//
//                Intent intentKembali = new Intent(Q23Activity.this, Q22Activity.class);
//                startActivity(intentKembali);
            }
        });
    }
}