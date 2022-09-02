package skripsi.nabila_medicat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Collections;

public class ResultActivity extends AppCompatActivity {
    Button home, detail;
    TextView hasil, nilaiAkhir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        Bundle extras = getIntent().getExtras();

        hasil = findViewById(R.id.hasilDiagnosis);
        nilaiAkhir = findViewById(R.id.nilaiDiagnosis);
        home = findViewById(R.id.beranda);
        detail = findViewById(R.id.lihatDetail);

        if(extras!=null){

            String nilai = ""+extras.getDouble("nilai",0.0);
            nilaiAkhir.setText(nilai);
            String namaPenyakit = extras.getString("namapenyakit","");
            hasil.setText(namaPenyakit);
            Log.e("Nilai : ", ""+nilai);
            Log.e("nama penakit :", ""+namaPenyakit);
        }

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentHome = new Intent(ResultActivity.this, MainActivity.class);
                startActivity(intentHome);
            }
        });

        detail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentDetail = new Intent(ResultActivity.this, EducatActivity.class);
                startActivity(intentDetail);
            }
        });

    }
}