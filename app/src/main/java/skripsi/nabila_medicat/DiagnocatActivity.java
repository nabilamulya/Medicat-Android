package skripsi.nabila_medicat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DiagnocatActivity extends AppCompatActivity {
    Button mulai;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diagnocat);

        mulai = (Button) findViewById(R.id.mulaiDiagnosis);

        mulai.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intentMulai = new Intent(DiagnocatActivity.this, Q1Activity.class);
                intentMulai.putExtra("q",1);
                startActivity(intentMulai);
            }
        });
    }
}