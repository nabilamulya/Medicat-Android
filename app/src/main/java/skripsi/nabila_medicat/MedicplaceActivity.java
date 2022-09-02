package skripsi.nabila_medicat;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MedicplaceActivity extends AppCompatActivity {

    ListView listView;
    ImageButton back;

    String mTitle[] = {"Alana Vet",
                        "Petsmile Dok Nyom",
                        "Gusta Vet",
                        "Groovy Vetcare Clinic",
                        "Jakarta Vet",
                        "Klinik Hewan Awal Care"};
    String mDescription[] = {"Jl. Banowati No.638, RT.7/RW.3, Halim Perdana Kusumah, Makasar, Kota Jakarta Timur, DKI Jakarta 13610 \n0852-1898-8829",
                            "Jl. Rawa Domba No.60, RT.2/RW.16, Duren Sawit, Jakarta, Kota Jakarta Timur, DKI Jakarta 13440 \n0856-3944-907",
                            "Jl. Raya Kebayoran Lama No.7, RT.3/RW.1, Sukabumi Utara, Kebon Jeruk, DKI Jakarta 11540 \n(021)5306790",
                            "Jl. Radio Dalam Raya No.49, RT.1/RW.15, Gandaria Utara, Kebayoran Baru, Jakarta Selatan, DKI Jakarta 12140 \n(021)72800617",
                            "Jl. Cempaka Putih Tengah No.5, RT.9/RW.7, Cempaka Putih Timur, Jakarta Pusat, DKI Jakarta 10510 \n(021)4241880",
                            "Jl. Waru No.20 AB, RT.6/RW.7, Rawamangun, Pulo Gadung, Jakarta Timur, DKI Jakarta 13220 \n(021)22473081"};
    int images[] = {R.drawable.alanavet, R.drawable.petsmile, R.drawable.gustavet, R.drawable.grov, R.drawable.dok, R.drawable.awalvet};
    // images and other things are set in array

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_medicplace);

        listView = (ListView) findViewById(R.id.listView1);
        back = findViewById (R.id.imgB_back);
        // create an adapter class

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentBack = new Intent(MedicplaceActivity.this, MainActivity.class);
                startActivity(intentBack);
            }
        });

        MyAdapter adapter = new MyAdapter(this, mTitle, mDescription, images);
        listView.setAdapter(adapter);
    }

    class MyAdapter extends ArrayAdapter<String> {

        Context context;
        String rTitle[];
        String rDescription[];
        int rImgs[];

        MyAdapter (Context c, String title[], String description[], int imgs[]) {
            super(c, R.layout.row_medicplace, R.id.textView1, title);
            this.context = c;
            this.rTitle = title;
            this.rDescription = description;
            this.rImgs = imgs;
        }

        @NonNull
        @Override
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
            LayoutInflater layoutInflater = (LayoutInflater)getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View row = layoutInflater.inflate(R.layout.row_medicplace, parent, false);
            ImageView images = row.findViewById(R.id.image);
            TextView myTitle = row.findViewById(R.id.textView1);
            TextView myDescription = row.findViewById(R.id.textView2);

            // set resources on views
            images.setImageResource(rImgs[position]);
            myTitle.setText(rTitle[position]);
            myDescription.setText(rDescription[position]);

            return row;
        }
    }
}