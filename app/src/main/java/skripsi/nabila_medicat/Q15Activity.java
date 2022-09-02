package skripsi.nabila_medicat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Q15Activity extends AppCompatActivity {
    Button lanjut15, kembali15;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q15);

        lanjut15 = (Button) findViewById(R.id.Lanjut_15);
//        kembali15 = (Button) findViewById(R.id.Kembali_15);

        lanjut15.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intentLanjut = new Intent(Q15Activity.this, Q16Activity.class);
                startActivity(intentLanjut);

//                Intent intentKembali = new Intent(Q15Activity.this, Q14Activity.class);
//                startActivity(intentKembali);
            }
        });
    }
}