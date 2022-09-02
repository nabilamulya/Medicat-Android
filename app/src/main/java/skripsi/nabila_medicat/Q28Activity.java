package skripsi.nabila_medicat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Q28Activity extends AppCompatActivity {
    Button lanjut28, kembali28;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q28);

        lanjut28 = (Button) findViewById(R.id.Lanjut_28);
//        kembali28 = (Button) findViewById(R.id.Kembali_28);

        lanjut28.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intentLanjut = new Intent(Q28Activity.this, Q29Activity.class);
                startActivity(intentLanjut);

//                Intent intentKembali = new Intent(Q28Activity.this, Q27Activity.class);
//                startActivity(intentKembali);
            }
        });
    }
}