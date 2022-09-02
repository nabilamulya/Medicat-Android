package skripsi.nabila_medicat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Q19Activity extends AppCompatActivity {
    Button lanjut19, kembali19;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q19);

        lanjut19 = (Button) findViewById(R.id.Lanjut_19);
//        kembali19 = (Button) findViewById(R.id.Kembali_19);

        lanjut19.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intentLanjut = new Intent(Q19Activity.this, Q20Activity.class);
                startActivity(intentLanjut);

//                Intent intentKembali = new Intent(Q19Activity.this, Q18Activity.class);
//                startActivity(intentKembali);
            }
        });
    }
}