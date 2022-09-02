package skripsi.nabila_medicat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Q13Activity extends AppCompatActivity {
    Button lanjut13, kembali13;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q13);

        lanjut13 = (Button) findViewById(R.id.Lanjut_13);
//        kembali13 = (Button) findViewById(R.id.Kembali_13);

        lanjut13.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intentLanjut = new Intent(Q13Activity.this, Q14Activity.class);
                startActivity(intentLanjut);

//                Intent intentKembali = new Intent(Q13Activity.this, Q12Activity.class);
//                startActivity(intentKembali);
            }
        });
    }
}