package skripsi.nabila_medicat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Q16Activity extends AppCompatActivity {
    Button lanjut16, kembali16;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q16);

        lanjut16 = (Button) findViewById(R.id.Lanjut_16);
//        kembali16 = (Button) findViewById(R.id.Kembali_16);

        lanjut16.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intentLanjut = new Intent(Q16Activity.this, Q17Activity.class);
                startActivity(intentLanjut);

//                Intent intentKembali = new Intent(Q16Activity.this, Q15Activity.class);
//                startActivity(intentKembali);
            }
        });
    }
}