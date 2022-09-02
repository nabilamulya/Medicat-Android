package skripsi.nabila_medicat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Q21Activity extends AppCompatActivity {
    Button lanjut21, kembali21;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q21);

        lanjut21 = (Button) findViewById(R.id.Lanjut_21);
//        kembali21 = (Button) findViewById(R.id.Kembali_21);

        lanjut21.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intentLanjut = new Intent(Q21Activity.this, Q22Activity.class);
                startActivity(intentLanjut);

//                Intent intentKembali = new Intent(Q21Activity.this, Q20Activity.class);
//                startActivity(intentKembali);
            }
        });
    }
}