package skripsi.nabila_medicat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Q14Activity extends AppCompatActivity {
    Button lanjut14, kembali14;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q14);

        lanjut14 = (Button) findViewById(R.id.Lanjut_14);
//        kembali14 = (Button) findViewById(R.id.Kembali_14);

        lanjut14.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intentLanjut = new Intent(Q14Activity.this, Q15Activity.class);
                startActivity(intentLanjut);

//                Intent intentKembali = new Intent(Q14Activity.this, Q13Activity.class);
//                startActivity(intentKembali);
            }
        });
    }
}