package skripsi.nabila_medicat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Q24Activity extends AppCompatActivity {
    Button lanjut24, kembali24;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q24);

        lanjut24 = (Button) findViewById(R.id.Lanjut_24);
//        kembali24 = (Button) findViewById(R.id.Lanjut_24);

        lanjut24.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intentLanjut = new Intent(Q24Activity.this, Q25Activity.class);
                startActivity(intentLanjut);

//                Intent intentKembali = new Intent(Q24Activity.this, Q23Activity.class);
//                startActivity(intentKembali);
            }
        });
    }
}