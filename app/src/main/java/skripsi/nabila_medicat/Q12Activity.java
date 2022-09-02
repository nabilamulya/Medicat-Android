package skripsi.nabila_medicat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Q12Activity extends AppCompatActivity {
    Button lanjut12, kembali12;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q12);

        lanjut12 = (Button) findViewById(R.id.Lanjut_12);
//        kembali12 = (Button) findViewById(R.id.Kembali_12);

        lanjut12.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intentLanjut = new Intent(Q12Activity.this, Q13Activity.class);
                startActivity(intentLanjut);

//                Intent intentKembali = new Intent(Q12Activity.this, Q11Activity.class);
//                startActivity(intentKembali);
            }
        });
    }
}