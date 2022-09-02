package skripsi.nabila_medicat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Q17Activity extends AppCompatActivity {
    Button lanjut17, kembali17;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q17);

        lanjut17 = (Button) findViewById(R.id.Lanjut_17);
//        kembali17 = (Button) findViewById(R.id.Kembali_17);

        lanjut17.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intentLanjut = new Intent(Q17Activity.this, Q18Activity.class);
                startActivity(intentLanjut);

//                Intent intentKembali = new Intent(Q17Activity.this, Q16Activity.class);
//                startActivity(intentKembali);
            }
        });
    }
}