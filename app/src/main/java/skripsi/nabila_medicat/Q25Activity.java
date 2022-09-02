package skripsi.nabila_medicat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Q25Activity extends AppCompatActivity {
    Button lanjut25, kembali25;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q25);

        lanjut25 = (Button) findViewById(R.id.Lanjut_25);
//        kembali25 = (Button) findViewById(R.id.Kembali_25);

        lanjut25.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intentLanjut = new Intent(Q25Activity.this, Q26Activity.class);
                startActivity(intentLanjut);

//                Intent intentKembali = new Intent(Q25Activity.this, Q24Activity.class);
//                startActivity(intentKembali);
            }
        });
    }
}