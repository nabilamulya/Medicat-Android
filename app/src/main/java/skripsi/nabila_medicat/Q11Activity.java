package skripsi.nabila_medicat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Q11Activity extends AppCompatActivity {
    Button lanjut11, kembali11;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q11);

        lanjut11 = (Button) findViewById(R.id.Lanjut_11);
//        kembali11 = (Button) findViewById(R.id.Kembali_11);

        lanjut11.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intentLanjut = new Intent(Q11Activity.this, Q12Activity.class);
                startActivity(intentLanjut);

//                Intent intentKembali = new Intent(Q11Activity.this, Q10Activity.class);
//                startActivity(intentKembali);
            }
        });
    }
}