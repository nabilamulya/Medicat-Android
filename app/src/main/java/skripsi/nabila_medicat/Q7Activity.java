package skripsi.nabila_medicat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Q7Activity extends AppCompatActivity {
    Button lanjut7, kembali7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q7);

        lanjut7 = (Button) findViewById(R.id.Lanjut_7);
//        kembali7 = (Button) findViewById(R.id.Kembali_7);

        lanjut7.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intentLanjut = new Intent(Q7Activity.this, Q8Activity.class);
                startActivity(intentLanjut);

//                Intent intentKembali = new Intent(Q7Activity.this, Q6Activity.class);
//                startActivity(intentKembali);
            }
        });
    }
}