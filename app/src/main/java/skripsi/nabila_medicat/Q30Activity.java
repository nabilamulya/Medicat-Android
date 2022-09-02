package skripsi.nabila_medicat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Q30Activity extends AppCompatActivity {
    Button selesai, kembali30;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q30);

        selesai = (Button) findViewById(R.id.selesai);
//        kembali30 = (Button) findViewById(R.id.Kembali_30);
//
        selesai.setOnClickListener(new View.OnClickListener() {
//
            @Override
            public void onClick(View view) {
                Intent intentSelesai = new Intent(Q30Activity.this, ResultActivity.class);
                startActivity(intentSelesai);

//                Intent intentKembali = new Intent(Q30Activity.this, Q29Activity.class);
//                startActivity(intentKembali);
            }
        });
    }
}