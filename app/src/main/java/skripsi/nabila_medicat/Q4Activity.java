package skripsi.nabila_medicat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Q4Activity extends AppCompatActivity {
    Button lanjut4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q4);

        lanjut4 = (Button) findViewById(R.id.Lanjut_4);
//        kembali4 = (Button) findViewById(R.id.Kembali_4);

        lanjut4.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intentLanjut = new Intent(Q4Activity.this, Q5Activity.class);
                startActivity(intentLanjut);

                Intent intentKembali = new Intent(Q4Activity.this, Q3Activity.class);
                startActivity(intentKembali);
            }
        });

    }
}