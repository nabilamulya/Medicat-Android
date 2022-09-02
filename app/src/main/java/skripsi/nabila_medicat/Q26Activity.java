package skripsi.nabila_medicat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Q26Activity extends AppCompatActivity {
    Button lanjut26, kembali26;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q26);

        lanjut26 = (Button) findViewById(R.id.Lanjut_26);
//        kembali26 = (Button) findViewById(R.id.Lanjut_26);

        lanjut26.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intentLanjut = new Intent(Q26Activity.this, Q27Activity.class);
                startActivity(intentLanjut);

//                Intent intentKembali = new Intent(Q26Activity.this, Q25Activity.class);
//                startActivity(intentKembali);
            }
        });
    }
}