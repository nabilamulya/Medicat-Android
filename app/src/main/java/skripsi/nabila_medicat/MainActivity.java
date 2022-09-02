package skripsi.nabila_medicat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    ImageView diagnocat, educat, medicplace;
    ImageButton back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        diagnocat = (ImageView) findViewById(R.id.Diagnocat);
        educat = (ImageView) findViewById(R.id.Educat);
        medicplace = (ImageView) findViewById(R.id.Medicplace);
        back = findViewById(R.id.imgB_back);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentBack = new Intent(MainActivity.this, IntroActivity.class);
                startActivity(intentBack);
            }
        });


        diagnocat.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intentDiagnocat = new Intent(MainActivity.this, DiagnocatActivity.class);
                startActivity(intentDiagnocat);

            }
        });

        educat.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intentDiagnocat = new Intent(MainActivity.this, EducatActivity.class);
                startActivity(intentDiagnocat);

            }
        });

        medicplace.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intentMedicplace = new Intent(MainActivity.this, MedicplaceActivity.class);
                startActivity(intentMedicplace);

            }
        });
    }
}