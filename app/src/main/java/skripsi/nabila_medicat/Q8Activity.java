package skripsi.nabila_medicat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Q8Activity extends AppCompatActivity {
    Button lanjut8, kembali8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q8);

        lanjut8 = (Button) findViewById(R.id.Lanjut_8);
//        kembali8 = (Button) findViewById(R.id.Kembali_8);

        lanjut8.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intentLanjut = new Intent(Q8Activity.this, Q9Activity.class);
                startActivity(intentLanjut);

            }
        });
    }
}