package skripsi.nabila_medicat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Q29Activity extends AppCompatActivity {
    Button lanjut29, kembali29;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q29);

        lanjut29 = (Button) findViewById(R.id.Lanjut_29);
//        kembali29 = (Button) findViewById(R.id.Kembali_29);

        lanjut29.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intentLanjut = new Intent(Q29Activity.this, Q30Activity.class);
                startActivity(intentLanjut);
//
//                Intent intentKembali = new Intent(Q29Activity.this, Q28Activity.class);
//                startActivity(intentKembali);
            }
        });
    }
}