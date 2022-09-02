package skripsi.nabila_medicat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Q6Activity extends AppCompatActivity {
    Button lanjut6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q6);

        lanjut6 = (Button) findViewById(R.id.Lanjut_6);


        lanjut6.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intentLanjut = new Intent(Q6Activity.this, Q7Activity.class);
                startActivity(intentLanjut);

            }
        });
    }
}