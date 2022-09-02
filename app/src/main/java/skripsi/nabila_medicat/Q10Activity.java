package skripsi.nabila_medicat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Q10Activity extends AppCompatActivity {
    Button lanjut10, kembali10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q10);

        lanjut10 = (Button) findViewById(R.id.Lanjut_10);
//        kembali10 = (Button) findViewById(R.id.Kembali_10);

        lanjut10.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intentLanjut = new Intent(Q10Activity.this, Q11Activity.class);
                startActivity(intentLanjut);

//                Intent intentKembali = new Intent(Q10Activity.this, Q9Activity.class);
//                startActivity(intentKembali);
            }
        });
    }
}