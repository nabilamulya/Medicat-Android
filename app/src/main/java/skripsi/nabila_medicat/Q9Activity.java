package skripsi.nabila_medicat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Q9Activity extends AppCompatActivity {
    Button lanjut9, kembali9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q9);

        lanjut9 = (Button) findViewById(R.id.Lanjut_9);
//        kembali9 = (Button) findViewById(R.id.Kembali_8);

        lanjut9.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intentLanjut = new Intent(Q9Activity.this, Q10Activity.class);
                startActivity(intentLanjut);

//                Intent intentKembali = new Intent(Q9Activity.this, Q8Activity.class);
//                startActivity(intentKembali);
            }
        });
    }
}