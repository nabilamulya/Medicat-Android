package skripsi.nabila_medicat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Q27Activity extends AppCompatActivity {
    Button lanjut27, kembali27;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q27);

        lanjut27 = (Button) findViewById(R.id.Lanjut_27);
//        kembali27 = (Button) findViewById(R.id.Kembali_27);

        lanjut27.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intentLanjut = new Intent(Q27Activity.this, Q28Activity.class);
                startActivity(intentLanjut);
//
//                Intent intentKembali = new Intent(Q27Activity.this, Q26Activity.class);
//                startActivity(intentKembali);
            }
        });
    }
}