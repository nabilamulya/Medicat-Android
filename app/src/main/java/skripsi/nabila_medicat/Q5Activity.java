package skripsi.nabila_medicat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Q5Activity extends AppCompatActivity {
    Button lanjut5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q5);

        lanjut5 = (Button) findViewById(R.id.Lanjut_5);


        lanjut5.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intentLanjut = new Intent(Q5Activity.this, Q6Activity.class);
                startActivity(intentLanjut);

            }
        });
    }
}