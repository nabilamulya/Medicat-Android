package skripsi.nabila_medicat;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

public class DetailEducatActivity extends AppCompatActivity {

    ImageView imageView;
    TextView title, description, solution;
    int position;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_educat);

//        ActionBar actionBar = getSupportActionBar();

//        if (actionBar != null) {
//            actionBar.setDisplayHomeAsUpEnabled(true);
//            actionBar.setDisplayShowHomeEnabled(true);
//            // aslo set in menifest
//        }
        imageView = findViewById(R.id.another_imageView);
        title = findViewById(R.id.titleText);
        description = findViewById(R.id.descriptionText);
        solution = findViewById(R.id.solusiText);

        if (position == 0) {
            Intent intent = getIntent();

            Bundle bundle = this.getIntent().getExtras();
            int pic = bundle.getInt("image");
            String aTitle = intent.getStringExtra("title");
            String aDescription = intent.getStringExtra("description");
            String aSolusi = intent.getStringExtra("solution");

            imageView.setImageResource(pic);
            title.setText(aTitle);
            description.setText(aDescription);
            solution.setText(aSolusi);

//            actionBar.setTitle(aTitle);
        }

        if (position == 1) {
            Intent intent = getIntent();

            Bundle bundle = this.getIntent().getExtras();
            int pic = bundle.getInt("image");
            String aTitle = intent.getStringExtra("title");
            String aDescription = intent.getStringExtra("description");
            String aSolusi = intent.getStringExtra("solution");

            imageView.setImageResource(pic);
            title.setText(aTitle);
            description.setText(aDescription);
            solution.setText(aSolusi);

//            actionBar.setTitle(aTitle);
        }
        if (position == 2) {
            Intent intent = getIntent();

            Bundle bundle = this.getIntent().getExtras();
            int pic = bundle.getInt("image");
            String aTitle = intent.getStringExtra("title");
            String aDescription = intent.getStringExtra("description");
            String aSolusi = intent.getStringExtra("solution");

            imageView.setImageResource(pic);
            title.setText(aTitle);
            description.setText(aDescription);
            solution.setText(aSolusi);

//            actionBar.setTitle(aTitle);
        }
        if (position == 3) {
            Intent intent = getIntent();

            Bundle bundle = this.getIntent().getExtras();
            int pic = bundle.getInt("image");
            String aTitle = intent.getStringExtra("title");
            String aDescription = intent.getStringExtra("description");
            String aSolusi = intent.getStringExtra("solution");

            imageView.setImageResource(pic);
            title.setText(aTitle);
            description.setText(aDescription);
            solution.setText(aSolusi);

//            actionBar.setTitle(aTitle);
        }
        if (position == 4) {
            Intent intent = getIntent();

            Bundle bundle = this.getIntent().getExtras();
            int pic = bundle.getInt("image");
            String aTitle = intent.getStringExtra("title");
            String aDescription = intent.getStringExtra("description");
            String aSolusi = intent.getStringExtra("solution");

            imageView.setImageResource(pic);
            title.setText(aTitle);
            description.setText(aDescription);
            solution.setText(aSolusi);

//            actionBar.setTitle(aTitle);
        }
        if (position == 5) {
            Intent intent = getIntent();

            Bundle bundle = this.getIntent().getExtras();
            int pic = bundle.getInt("solusi");
            String aTitle = intent.getStringExtra("solution");
            String aDescription = intent.getStringExtra("description");
            String aSolusi = intent.getStringExtra("solution");

            imageView.setImageResource(pic);
            title.setText(aTitle);
            description.setText(aDescription);
            solution.setText(aSolusi);

//            actionBar.setTitle(aTitle);
        }
        if (position == 6) {
            Intent intent = getIntent();

            Bundle bundle = this.getIntent().getExtras();
            int pic = bundle.getInt("solusi");
            String aTitle = intent.getStringExtra("solution");
            String aDescription = intent.getStringExtra("description");
            String aSolusi = intent.getStringExtra("solution");

            imageView.setImageResource(pic);
            title.setText(aTitle);
            description.setText(aDescription);
            solution.setText(aSolusi);

//            actionBar.setTitle(aTitle);
        }
        if (position == 7) {
            Intent intent = getIntent();

            Bundle bundle = this.getIntent().getExtras();
            int pic = bundle.getInt("solusi");
            String aTitle = intent.getStringExtra("solution");
            String aDescription = intent.getStringExtra("description");
            String aSolusi = intent.getStringExtra("solution");

            imageView.setImageResource(pic);
            title.setText(aTitle);
            description.setText(aDescription);
            solution.setText(aSolusi);

//            actionBar.setTitle(aTitle);
        }
    }
}