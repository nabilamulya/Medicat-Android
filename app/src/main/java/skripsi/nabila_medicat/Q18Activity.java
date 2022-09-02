package skripsi.nabila_medicat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Q18Activity extends AppCompatActivity {
    Button lanjut18, kembali18;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q18);

        lanjut18 = (Button) findViewById(R.id.Lanjut_18);
//        kembali18 = (Button) findViewById(R.id.Kembali_18);

        lanjut18.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intentLanjut = new Intent(Q18Activity.this, Q19Activity.class);
                startActivity(intentLanjut);

//                Intent intentKembali = new Intent(Q18Activity.this, Q17Activity.class);
//                startActivity(intentKembali);
            }
        });
    }
}