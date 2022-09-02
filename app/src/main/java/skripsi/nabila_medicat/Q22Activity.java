package skripsi.nabila_medicat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Q22Activity extends AppCompatActivity {
    Button lanjut22, kembali22;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q22);

        lanjut22 = (Button) findViewById(R.id.Lanjut_22);
//        kembali22 = (Button) findViewById(R.id.Kembali_22);

        lanjut22.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intentLanjut = new Intent(Q22Activity.this, Q23Activity.class);
                startActivity(intentLanjut);


            }
        });
    }
}