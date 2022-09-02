package skripsi.nabila_medicat;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
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

public class EducatActivity extends AppCompatActivity {

    ListView listView;
    ImageButton back;

    String mTitle[] = {"FLUTD", "Chlamydia", "Helminthiasis", "Ringworm", "FIV","Scabies","Rhinotracheitis "};
    String mDescription[] = {"Merupakan penyakit yang mengganggu saluran kemih kucing. " +
            "\nKucing dengan yang terkena penyakit ini sering menunjukkan tanda-tanda kesulitan dan nyeri saat buang air kecil, peningkatan frekuensi buang air kecil, dan darah dalam urin. " +
            "\nHal ini terjadi karena system kemih kucing mengalami peradangan atau terjadi penyumbatan urin pada kandung kemih",

            "Merupakan penyakit menyebabkan infeksi konjungtivitis pada kucing yang disebabkan oleh organisme bakteri (Chlamydophila Felis). " +
                    "\nCiri-ciri chlamydia yang paling umum terlihat pada mata atau saluran pernapasan bagian atas (hidung atau tenggorokan). " +
                    "\nJika infeksi tidak segera diobati maka dapat menyebar hingga ke paru-paru.",

            "Merupakan penyakit cacingan yang terjadi pada kucing. " +
                    "\nPada kasus ringan, kucing jarang menunjukan gejala penyakit dan perlu dilakukan pemeriksaan pada dokter hewan untuk mengetahuinya. " +
                    "\nSedangkan pada kasus berat, kucing menunjukkan gejala diare disertai cacing.",

            "merupakan infeksi jamur yang disebabkan oleh jamur Microsporum Canis. " +
                    "\nKucing sering terinfeksi jamur ini karena mudah menular. " +
                    "\nPenyakit ini mempengaruhi lapisan atas kulit dan terjadi ketika jamur atau spora bersentuhan dengan kulit kucing. ",

            "Merupakan penyakit yang menginfeksi sel sistem kekebalan. \nPenyakit ini menyebabkan kucing mengalami sakit secara perlahan " +
                    "\nsehingga kucing yang terinfeksi dapat tetap terlihat sehat selama bertahun-tahun. ",

            "Merupakan penyakit yang disebabkan oleh kutu bernama Notoedres cati. " +
                    "\nKutu ini seringkali menyerang area khusus pada kulit kucing dan sangat membuat gatal. " +
                    "\nSehingga kuicng menggaruk bagian yang gatal dan akhirnya akan mengeras seperti kulit mati. ",

            "Merupakan penyakit gangguan pernapasan atas yang terjadi pada kucing yang disebabkan oleh virus FHV-1. " +
                    "\nPenyakit ini biasanya berlangsung selama 10-14 hari. " +
                    "\nVirus ini dapat menular kepada kucing segala usia tetapi lebih berisiko pada anak kucing."};

    String mSolusi[] = {"Emergency Case. Harus segera mendapatkan tindakan dokter hewan. \nJika terlambat dapat menyebabkan kematian",
                        "Bersihkan area mata dengan air hangat \nsetiap pagi dan sore",
                        "Berikan obat cacing sesuai dosis." +
                                "\nBerikan suplemen darah",
                        "Berikan salep anti jamur",
                        "Meningkatkan imunitas dengan memberikan Imun Booster. \nPastikan tetap makan dan minum agar tidak dehidrasi",
                        "Berikan salep Scabies atau \nobat semprot",
                        "Meningkatkan imunitas dengan memberikan Imun Booster. \nPastikan tetap makan dan minum agar tidak dehidrasi"};
    int images[] = {R.drawable.flutd, R.drawable.chlamydia, R.drawable.cacingan, R.drawable.ringworm, R.drawable.fiv, R.drawable.scabies, R.drawable.rhino2};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_educat);

        listView = findViewById(R.id.listView);
        back = findViewById(R.id.imgB_back);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentBack = new Intent(EducatActivity.this, MainActivity.class);
                startActivity(intentBack);
            }
        });

        MyAdapter adapter = new MyAdapter(this, mTitle, mDescription, images, mSolusi);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                if (position == 0) {
                    Intent intent = new Intent(getApplicationContext(), DetailEducatActivity.class);
                    // this intent put our 0 index image to another activity
                    Bundle bundle = new Bundle();
                    bundle.putInt("image", images[0]);
                    intent.putExtras(bundle);
                    // now put title and description to another activity
                    intent.putExtra("title", mTitle[0]);
                    intent.putExtra("description", mDescription[0]);
                    // also put your position
                    intent.putExtra("solusi", mSolusi[0]);
                    // also put your position
                    intent.putExtra("solution", mSolusi[0]);
                    intent.putExtra("position", ""+0);
                    startActivity(intent);
                }
                if (position == 1) {
                    Intent intent = new Intent(getApplicationContext(), DetailEducatActivity.class);
                    // this intent put our 0 index image to another activity
                    Bundle bundle = new Bundle();
                    bundle.putInt("image", images[1]);
                    intent.putExtras(bundle);
                    // now put title and description to another activity
                    intent.putExtra("title", mTitle[1]);
                    intent.putExtra("description", mDescription[1]);
                    // also put your position
                    intent.putExtra("solution", mSolusi[1]);
                    intent.putExtra("position", ""+1);
                    startActivity(intent);
                }
                if (position == 2) {
                    Intent intent = new Intent(getApplicationContext(), DetailEducatActivity.class);
                    // this intent put our 0 index image to another activity
                    Bundle bundle = new Bundle();
                    bundle.putInt("image", images[2]);
                    intent.putExtras(bundle);
                    // now put title and description to another activity
                    intent.putExtra("title", mTitle[2]);
                    intent.putExtra("description", mDescription[2]);
                    // also put your position
                    intent.putExtra("solution", mSolusi[2]);
                    intent.putExtra("position", ""+2);
                    startActivity(intent);
                }
                if (position == 3) {
                    Intent intent = new Intent(getApplicationContext(), DetailEducatActivity.class);
                    // this intent put our 0 index image to another activity
                    Bundle bundle = new Bundle();
                    bundle.putInt("image", images[3]);
                    intent.putExtras(bundle);
                    // now put title and description to another activity
                    intent.putExtra("title", mTitle[3]);
                    intent.putExtra("description", mDescription[3]);
                    // also put your position
                    intent.putExtra("solution", mSolusi[3]);
                    intent.putExtra("position", ""+3);
                    startActivity(intent);
                }
                if (position == 4) {
                    Intent intent = new Intent(getApplicationContext(), DetailEducatActivity.class);
                    // this intent put our 0 index image to another activity
                    Bundle bundle = new Bundle();
                    bundle.putInt("image", images[4]);
                    intent.putExtras(bundle);
                    // now put title and description to another activity
                    intent.putExtra("title", mTitle[4]);
                    intent.putExtra("description", mDescription[4]);
                    // also put your position
                    intent.putExtra("solution", mSolusi[4]);
                    intent.putExtra("position", ""+4);
                    startActivity(intent);
                }

                if (position == 5) {
                    Intent intent = new Intent(getApplicationContext(), DetailEducatActivity.class);
                    // this intent put our 0 index image to another activity
                    Bundle bundle = new Bundle();
                    bundle.putInt("image", images[5]);
                    intent.putExtras(bundle);
                    // now put title and description to another activity
                    intent.putExtra("title", mTitle[5]);
                    intent.putExtra("description", mDescription[5]);
                    // also put your position
                    intent.putExtra("solution", mSolusi[5]);
                    // also put your position
                    intent.putExtra("position", ""+5);
                    startActivity(intent);
                }
                if (position == 6) {
                    Intent intent = new Intent(getApplicationContext(), DetailEducatActivity.class);
                    // this intent put our 0 index image to another activity
                    Bundle bundle = new Bundle();
                    bundle.putInt("image", images[6]);
                    intent.putExtras(bundle);
                    // now put title and description to another activity
                    intent.putExtra("title", mTitle[6]);
                    intent.putExtra("description", mDescription[6]);
                    // also put your position
                    intent.putExtra("solution", mSolusi[6]);
                    // also put your position
                    intent.putExtra("position", ""+6);
                    startActivity(intent);
                }
                if (position == 7) {
                    Intent intent = new Intent(getApplicationContext(), DetailEducatActivity.class);
                    // this intent put our 0 index image to another activity
                    Bundle bundle = new Bundle();
                    bundle.putInt("image", images[7]);
                    intent.putExtras(bundle);
                    // now put title and description to another activity
                    intent.putExtra("title", mTitle[7]);
                    intent.putExtra("description", mDescription[7]);
                    // also put your position
                    intent.putExtra("solution", mSolusi[7]);
                    // also put your position
                    intent.putExtra("position", ""+7);
                    startActivity(intent);
                }
            }
        });
    }

    class MyAdapter extends ArrayAdapter<String> {

        Context context;
        String rTitle[];
        String rDescription[];
        int rImages[];

        MyAdapter(Context c, String[] title, String[] description, int[] imgs, String[] mSolusi) {
            super(c, R.layout.row_educat, R.id.textView1, title);
            this.context = c;
            this.rTitle = title;
            this.rDescription = description;
            this.rImages = imgs;
        }

        @NonNull
        @Override
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
            LayoutInflater layoutInflater = (LayoutInflater)getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);

            View row_educat = layoutInflater.inflate(R.layout.row_educat, parent, false);

            ImageView images = row_educat.findViewById(R.id.image);
            TextView myTitle = row_educat.findViewById(R.id.textView1);
//            TextView myDescription = row.findViewById(R.id.textView2);

            images.setImageResource(rImages[position]);
            myTitle.setText(rTitle[position]);
//            myDescription.setText(rDescription[position]);

            return row_educat;
        }
    }
}