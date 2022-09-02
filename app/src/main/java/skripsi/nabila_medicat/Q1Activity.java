package skripsi.nabila_medicat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.service.controls.actions.ModeAction;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

import skripsi.nabila_medicat.model.MasterData;
import skripsi.nabila_medicat.model.ModelPenyakit;

public class Q1Activity extends AppCompatActivity {
    Button lanjut1, btnSangatPasti, btnPasti, btnMungkinIya, btnMungkinTidak, btnTidak, kembali1;
    TextView txtPertanyaan;
    public int numPertanyaan = 0;

    private void resetColor() {
        btnSangatPasti.setBackgroundColor(getResources().getColor(R.color.button_kuesioner));
        btnPasti.setBackgroundColor(getResources().getColor(R.color.button_kuesioner));
        btnMungkinIya.setBackgroundColor(getResources().getColor(R.color.button_kuesioner));
        btnMungkinTidak.setBackgroundColor(getResources().getColor(R.color.button_kuesioner));
        btnTidak.setBackgroundColor(getResources().getColor(R.color.button_kuesioner));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q1);

        Bundle extra = getIntent().getExtras();
        if (extra != null) {
            numPertanyaan = extra.getInt("q", 0);
        }

        lanjut1 = findViewById(R.id.Lanjut_1);
        kembali1 = findViewById(R.id.Kembali_1);

        txtPertanyaan = findViewById(R.id.txtPertanyaan);
        btnSangatPasti = findViewById(R.id.btnSangatPasti);
        btnPasti = findViewById(R.id.btnPasti);
        btnMungkinIya = findViewById(R.id.btnMungkinIya);
        btnMungkinTidak = findViewById(R.id.btnMungkinTidak);
        btnTidak = findViewById(R.id.btnTidak);


        txtPertanyaan.setText(MasterData.pertanyaan.get((numPertanyaan - 1)));

        kembali1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                if (numPertanyaan <= 1) {
                    Intent intentKembali = new Intent(Q1Activity.this, MainActivity.class);
                    startActivity(intentKembali);
                } else {
                    cekPenyakit(btnSangatPasti.isSelected(),
                            btnPasti.isSelected(),
                            btnMungkinIya.isSelected(),
                            btnMungkinTidak.isSelected(),
                            btnTidak.isSelected());
                    Intent intentKembali = new Intent(Q1Activity.this, Q1Activity.class);
                    intentKembali.putExtra("q", numPertanyaan - 1);
                    startActivity(intentKembali);
                }
            }
        });


        lanjut1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                    cekPenyakit(btnSangatPasti.isSelected(),
                            btnPasti.isSelected(),
                            btnMungkinIya.isSelected(),
                            btnMungkinTidak.isSelected(),
                            btnTidak.isSelected());
                }
//            }
        });

        btnPasti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resetColor();
                btnPasti.setBackgroundColor(getResources().getColor(R.color.colorAccent));
                btnPasti.setSelected(true);
                btnMungkinIya.setSelected(false);
                btnMungkinTidak.setSelected(false);
                btnSangatPasti.setSelected(false);
                btnTidak.setSelected(false);
            }
        });

        btnTidak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resetColor();
                btnTidak.setBackgroundColor(getResources().getColor(R.color.colorAccent));
                btnPasti.setSelected(false);
                btnMungkinIya.setSelected(false);
                btnMungkinTidak.setSelected(false);
                btnSangatPasti.setSelected(false);
                btnTidak.setSelected(true);
            }
        });

        btnSangatPasti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resetColor();
                btnSangatPasti.setBackgroundColor(getResources().getColor(R.color.colorAccent));
                btnPasti.setSelected(false);
                btnMungkinIya.setSelected(false);
                btnMungkinTidak.setSelected(false);
                btnSangatPasti.setSelected(true);
                btnTidak.setSelected(false);
            }
        });

        btnMungkinTidak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resetColor();
                btnMungkinTidak.setBackgroundColor(getResources().getColor(R.color.colorAccent));
                btnPasti.setSelected(false);
                btnMungkinIya.setSelected(false);
                btnMungkinTidak.setSelected(true);
                btnSangatPasti.setSelected(false);
                btnTidak.setSelected(false);
            }
        });

        btnMungkinIya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resetColor();
                btnMungkinIya.setBackgroundColor(getResources().getColor(R.color.colorAccent));
                btnPasti.setSelected(false);
                btnMungkinIya.setSelected(true);
                btnMungkinTidak.setSelected(false);
                btnSangatPasti.setSelected(false);
                btnTidak.setSelected(false);
            }
        });
    }

    void cekPenyakit(boolean sangatPasti, boolean mungkinIya, boolean mungkinTidak, boolean pasti, boolean tidak) {
        double nilai = 0.0;
        if (sangatPasti) {
            nilai = 1;
        } else if (mungkinIya) {
            nilai = 0.6;
        } else if (mungkinTidak) {
            nilai = 0.4;
        } else if (pasti) {
            nilai = 0.8;
        } else {
            nilai = 0;
        }

        ModelPenyakit modelPenyakit = new ModelPenyakit();
        if (numPertanyaan == 1) {
            modelPenyakit.setKodeGejala("G001");
            modelPenyakit.setNamaGejala("Bulu rontok dan kusam");
        } else if (numPertanyaan == 2) {
            modelPenyakit.setKodeGejala("G002");
            modelPenyakit.setNamaGejala("Batuk");
        } else if (numPertanyaan == 3) {
            modelPenyakit.setKodeGejala("G003");
            modelPenyakit.setNamaGejala("Buang air kecil berdarah");
        } else if (numPertanyaan == 4) {
            modelPenyakit.setKodeGejala("G004");
            modelPenyakit.setNamaGejala("Buang air kecil tidak pada tempatnya");
        } else if (numPertanyaan == 5) {
            modelPenyakit.setKodeGejala("G005");
            modelPenyakit.setNamaGejala("Bulu membotak");
        } else if (numPertanyaan == 6) {
            modelPenyakit.setKodeGejala("G006");
            modelPenyakit.setNamaGejala("Demam");
        } else if (numPertanyaan == 7) {
            modelPenyakit.setKodeGejala("G007");
            modelPenyakit.setNamaGejala("Diare");
        } else if (numPertanyaan == 8) {
            modelPenyakit.setKodeGejala("G008");
            modelPenyakit.setNamaGejala("Diare disertai cacing");
        } else if (numPertanyaan == 9) {
            modelPenyakit.setKodeGejala("G009");
            modelPenyakit.setNamaGejala("Flu");
        } else if (numPertanyaan == 10) {
            modelPenyakit.setKodeGejala("G010");
            modelPenyakit.setNamaGejala("Frekuensi buang air kecil meningkat");
        } else if (numPertanyaan == 11) {
            modelPenyakit.setKodeGejala("G011");
            modelPenyakit.setNamaGejala("Gatal dan ruam");
        } else if (numPertanyaan == 12) {
            modelPenyakit.setKodeGejala("G012");
            modelPenyakit.setNamaGejala("Kehilangan berat badan");
        } else if (numPertanyaan == 13) {
            modelPenyakit.setKodeGejala("G013");
            modelPenyakit.setNamaGejala("Keluar lendir dari hidung");
        } else if (numPertanyaan == 14) {
            modelPenyakit.setKodeGejala("G014");
            modelPenyakit.setNamaGejala("Koreng dan penebalan kulit ditelinga");
        } else if (numPertanyaan == 15) {
            modelPenyakit.setKodeGejala("G015");
            modelPenyakit.setNamaGejala("Frekuensi buang air kecil meningkat");
        } else if (numPertanyaan == 16) {
            modelPenyakit.setKodeGejala("G016");
            modelPenyakit.setNamaGejala("Frekuensi buang air kecil meningkat");
        } else if (numPertanyaan == 17) {
            modelPenyakit.setKodeGejala("G017");
            modelPenyakit.setNamaGejala("Lesu");
        } else if (numPertanyaan == 18) {
            modelPenyakit.setKodeGejala("G018");
            modelPenyakit.setNamaGejala("Luka didaerah tertentu");
        } else if (numPertanyaan == 19) {
            modelPenyakit.setKodeGejala("G019");
            modelPenyakit.setNamaGejala("Luka membentuk lingkaran");
        } else if (numPertanyaan == 20) {
            modelPenyakit.setKodeGejala("G020");
            modelPenyakit.setNamaGejala("Mata bengkak");
        } else if (numPertanyaan == 21) {
            modelPenyakit.setKodeGejala("G021");
            modelPenyakit.setNamaGejala("Mata berair dan belekan");
        } else if (numPertanyaan == 22) {
            modelPenyakit.setKodeGejala("G022");
            modelPenyakit.setNamaGejala("Mata bernanah");
        } else if (numPertanyaan == 23) {
            modelPenyakit.setKodeGejala("G023");
            modelPenyakit.setNamaGejala("Mata merah dan bengkak");
        } else if (numPertanyaan == 24) {
            modelPenyakit.setKodeGejala("G024");
            modelPenyakit.setNamaGejala("Muntah disertai cacing");
        } else if (numPertanyaan == 25) {
            modelPenyakit.setKodeGejala("G025");
            modelPenyakit.setNamaGejala("Perut membesar");
        } else if (numPertanyaan == 26) {
            modelPenyakit.setKodeGejala("G026");
            modelPenyakit.setNamaGejala("Sering menggaruk kepala");
        } else if (numPertanyaan == 27) {
            modelPenyakit.setKodeGejala("G027");
            modelPenyakit.setNamaGejala("Sering menjilat alat kelamin");
        } else if (numPertanyaan == 28) {
            modelPenyakit.setKodeGejala("G028");
            modelPenyakit.setNamaGejala("Sulit bernapas");
        } else if (numPertanyaan == 29) {
            modelPenyakit.setKodeGejala("G029");
            modelPenyakit.setNamaGejala("Sulit buang air kecil");
        } else if (numPertanyaan == 30) {
            modelPenyakit.setKodeGejala("G030");
            modelPenyakit.setNamaGejala("Tidak nafsu makan");
        }

        modelPenyakit.setCF(nilai);
        MasterData.Answer.add(modelPenyakit);
        if (numPertanyaan == 30) {
            hitung();
        }
        else {
            Intent intentLanjut = new Intent(Q1Activity.this, Q1Activity.class);
            intentLanjut.putExtra("q", numPertanyaan + 1);
            startActivity(intentLanjut);
        }
    }

    void hitung() {
        for (int k = 0; k < MasterData.P001.size(); k++) {
            ModelPenyakit model = MasterData.P001.get(k);
            for (int i = 0; i < MasterData.Answer.size(); i++) {
                if (model.getKodeGejala().equals(MasterData.Answer.get(i).getKodeGejala())) {
                    Log.e("A = ", "" + model.getCF());
                    Log.e("B = ", "" + MasterData.Answer.get(i).getCF());
                    double kali = model.getCF() * MasterData.Answer.get(i).getCF();
                    Log.e("hasil kali = ", "" + kali);
                    model.setStatus(true);
                    model.setCV(kali);
                }
            }
        }

        for (int k = 0; k < MasterData.P002.size(); k++) {
            ModelPenyakit model = MasterData.P002.get(k);
            for (int i = 0; i < MasterData.Answer.size(); i++) {
                if (model.getKodeGejala().equals(MasterData.Answer.get(i).getKodeGejala())) {

                    Log.e("A = ", "" + model.getCF());
                    Log.e("B = ", "" + MasterData.Answer.get(i).getCF());
                    double kali = model.getCF() * MasterData.Answer.get(i).getCF();
                    Log.e("hasil kali = ", "" + kali);
                    model.setStatus(true);
                    model.setCV(kali);
                }
            }
        }

        for (int k = 0; k < MasterData.P003.size(); k++) {
            ModelPenyakit model = MasterData.P003.get(k);
            for (int i = 0; i < MasterData.Answer.size(); i++) {
                if (model.getKodeGejala().equals(MasterData.Answer.get(i).getKodeGejala())) {

                    Log.e("A 003= ", "" + model.getCF());
                    Log.e("B 003= ", "" + MasterData.Answer.get(i).getCF());
                    double kali = model.getCF() * MasterData.Answer.get(i).getCF();
                    Log.e("hasil kali = ", "" + kali);
                    model.setStatus(true);
                    model.setCV(kali);
                }
            }
        }

        for (int k = 0; k < MasterData.P004.size(); k++) {
            ModelPenyakit model = MasterData.P004.get(k);
            for (int i = 0; i < MasterData.Answer.size(); i++) {
                if (model.getKodeGejala().equals(MasterData.Answer.get(i).getKodeGejala())) {
                    Log.e("A = ", "" + model.getCF());
                    Log.e("B = ", "" + MasterData.Answer.get(i).getCF());
                    double kali = model.getCF() * MasterData.Answer.get(i).getCF();
                    Log.e("hasil kali = ", "" + kali);
                    model.setStatus(true);
                    model.setCV(kali);
                }
            }
        }

        for (int k = 0; k < MasterData.P005.size(); k++) {
            ModelPenyakit model = MasterData.P005.get(k);
            for (int i = 0; i < MasterData.Answer.size(); i++) {
                if (model.getKodeGejala().equals(MasterData.Answer.get(i).getKodeGejala())) {

                    Log.e("A = ", "" + model.getCF());
                    Log.e("B = ", "" + MasterData.Answer.get(i).getCF());
                    double kali = model.getCF() * MasterData.Answer.get(i).getCF();
                    Log.e("hasil kali = ", "" + kali);
                    model.setStatus(true);
                    model.setCV(kali);
                }
            }
        }

        for (int k = 0; k < MasterData.P006.size(); k++) {
            ModelPenyakit model = MasterData.P006.get(k);
            for (int i = 0; i < MasterData.Answer.size(); i++) {
                if (model.getKodeGejala().equals(MasterData.Answer.get(i).getKodeGejala())) {

                    Log.e("A = ", "" + model.getCF());
                    Log.e("B = ", "" + MasterData.Answer.get(i).getCF());
                    double kali = model.getCF() * MasterData.Answer.get(i).getCF();
                    Log.e("hasil kali = ", "" + kali);
                    model.setStatus(true);
                    model.setCV(kali);
                }
            }
        }

        for (int k = 0; k < MasterData.P007.size(); k++) {
            ModelPenyakit model = MasterData.P007.get(k);
            for (int i = 0; i < MasterData.Answer.size(); i++) {
                if (model.getKodeGejala().equals(MasterData.Answer.get(i).getKodeGejala())) {

                    Log.e("A = ", "" + model.getCF());
                    Log.e("B = ", "" + MasterData.Answer.get(i).getCF());
                    double kali = model.getCF() * MasterData.Answer.get(i).getCF();
                    Log.e("hasil kali = ", "" + kali);
                    Log.e("hasil kali = ", "" + kali);
                    model.setStatus(true);
                    model.setCV(kali);
                }
            }
        }

        double temp001 = 0.0;
        ArrayList<Double> hasilp001 = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            ModelPenyakit model = MasterData.P001.get(i);
            ModelPenyakit model2 = MasterData.P001.get(i + 1);
            Log.e("status : ", "" + MasterData.P001.get(i).isStatus());
            Log.e("Kode :", "" + model.getKodeGejala());
            Log.e("hasil kali = ", "" + model.getCV());
            if (i == 0) {
                temp001 = model.getCV() + (model2.getCV() * (1 - model.getCV()));
            } else {
                temp001 = temp001 + (model2.getCV() * (1 - temp001));
            }
            Log.e("nilaiRumus = ", "" + temp001);
            hasilp001.add(temp001);
        }

        double temp002 = 0.0;
        ArrayList<Double> hasilp002 = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            ModelPenyakit model = MasterData.P002.get(i);
            ModelPenyakit model2 = MasterData.P002.get(i + 1);
            Log.e("status : ", "" + MasterData.P002.get(i).isStatus());
            Log.e("Kode :", "" + model.getKodeGejala());
            Log.e("hasil kali = ", "" + model.getCV());
            if (i == 0) {
                temp002 = model.getCV() + (model2.getCV() * (1 - model.getCV()));
            } else {
                temp002 = temp002 + (model2.getCV() * (1 - temp002));
            }

            Log.e("nilaiRumus = ", "" + temp002);
            hasilp002.add(temp002);
        }

        double temp003 = 0.0;
        ArrayList<Double> hasilp003 = new ArrayList<>();
        for (int i = 0; i < 4; i++) {

            ModelPenyakit model = MasterData.P003.get(i);
            ModelPenyakit model2 = MasterData.P003.get(i + 1);
            Log.e("status : ", "" + MasterData.P003.get(i).isStatus());
            Log.e("Kode :", "" + model.getKodeGejala());
            Log.e("hasil kali = ", "" + model.getCV());
            if (i == 0) {
                temp003 = model.getCV() + (model2.getCV() * (1 - model.getCV()));
            } else {
                temp003 = temp003 + (model2.getCV() * (1 - temp003));
            }


            Log.e("nilaiRumus 03= ", "" + temp003);
            hasilp003.add(temp003);
        }

        double temp004 = 0.0;
        ArrayList<Double> hasilp004 = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            ModelPenyakit model = MasterData.P004.get(i);
            ModelPenyakit model2 = MasterData.P004.get(i + 1);
            Log.e("status : ", "" + MasterData.P004.get(i).isStatus());
            Log.e("Kode :", "" + model.getKodeGejala());
            Log.e("hasil kali = ", "" + model.getCV());
            if (i == 0) {
                temp004 = model.getCV() + (model2.getCV() * (1 - model.getCV()));
            } else {
                temp004 = temp004 + (model2.getCV() * (1 - temp004));
            }
            Log.e("nilaiRumus = ", "" + temp004);
            hasilp004.add(temp004);
        }

        double temp005 = 0.0;
        ArrayList<Double> hasilp005 = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            ModelPenyakit model = MasterData.P005.get(i);
            ModelPenyakit model2 = MasterData.P005.get(i + 1);
            Log.e("status : ", "" + MasterData.P005.get(i).isStatus());
            Log.e("Kode :", "" + model.getKodeGejala());
            Log.e("hasil kali = ", "" + model.getCV());
            if (i == 0) {
                temp005 = model.getCV() + (model2.getCV() * (1 - model.getCV()));
            } else {
                temp005 = temp005 + (model2.getCV() * (1 - temp005));
            }
            Log.e("nilaiRumus = ", "" + temp005);
            hasilp005.add(temp005);
        }

        double temp006 = 0.0;
        ArrayList<Double> hasilp006 = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            ModelPenyakit model = MasterData.P006.get(i);
            ModelPenyakit model2 = MasterData.P006.get(i + 1);
            Log.e("status : ", "" + MasterData.P006.get(i).isStatus());
            Log.e("Kode :", "" + model.getKodeGejala());
            Log.e("hasil kali = ", "" + model.getCV());
            if (i == 0) {
                temp006 = model.getCV() + (model2.getCV() * (1 - model.getCV()));
            } else {
                temp006 = temp006 + (model2.getCV() * (1 - temp006));
            }
            Log.e("nilaiRumus = ", "" + temp006);
            hasilp006.add(temp006);
        }

        ArrayList<Double> hasilp007 = new ArrayList<>();
        double temp007 = 0.0;
        for (int i = 0; i < 4; i++) {

            ModelPenyakit model = MasterData.P007.get(i);
            ModelPenyakit model2 = MasterData.P007.get(i + 1);
            Log.e("status : ", "" + MasterData.P007.get(i).isStatus());
            Log.e("Kode :", "" + model.getKodeGejala());
            Log.e("hasil kali = ", "" + model.getCV());
            if (i == 0) {
                temp007 = model.getCV() + (model2.getCV() * (1 - model.getCV()));
            } else {
                temp007 = temp007 + (model2.getCV() * (1 - temp007));
            }


            Log.e("nilaiRumus = ", "" + temp007);
            hasilp007.add(temp007);
        }

        double nilaiTertinggi001 = Collections.max(hasilp001);
        double nilaiTertinggi002 = Collections.max(hasilp002);
        double nilaiTertinggi003 = Collections.max(hasilp003);
        double nilaiTertinggi004 = Collections.max(hasilp004);
        double nilaiTertinggi005 = Collections.max(hasilp005);
        double nilaiTertinggi006 = Collections.max(hasilp006);
        double nilaiTertinggi007 = Collections.max(hasilp007);

        for (int k = 0; k < 4; k++) {
            Log.e("nilai 001 =", "" + hasilp001.get(k));
        }

        for (int k = 0; k < 4; k++) {
            Log.e("nilai 002 =", "" + hasilp002.get(k));
        }

        for (int k = 0; k < 4; k++) {
            Log.e("nilai 003 =", "" + hasilp003.get(k));
        }

        for (int k = 0; k < 4; k++) {
            Log.e("nilai 004 =", "" + hasilp004.get(k));
        }

        for (int k = 0; k < 4; k++) {
            Log.e("nilai 005 =", "" + hasilp005.get(k));
        }

        for (int k = 0; k < 4; k++) {
            Log.e("nilai 006 =", "" + hasilp006.get(k));
        }

        for (int k = 0; k < 4; k++) {
            Log.e("nilai 007 =", "" + hasilp007.get(k));
        }

        Log.e("Hasil P001 : ", "" + nilaiTertinggi001);
        Log.e("Hasil P002 : ", "" + nilaiTertinggi002);
        Log.e("Hasil P003 : ", "" + nilaiTertinggi003);
        Log.e("Hasil P004 : ", "" + nilaiTertinggi004);
        Log.e("Hasil P005 : ", "" + nilaiTertinggi005);
        Log.e("Hasil P006 : ", "" + nilaiTertinggi006);
        Log.e("Hasil P007 : ", "" + nilaiTertinggi007);

        ArrayList<Double> data = new ArrayList<>();
        data.add(nilaiTertinggi001);
        data.add(nilaiTertinggi002);
        data.add(nilaiTertinggi003);
        data.add(nilaiTertinggi004);
        data.add(nilaiTertinggi005);
        data.add(nilaiTertinggi006);
        data.add(nilaiTertinggi007);

        int index=0;
        for(int k=0;k<data.size();k++){
            if(data.get(k)==Collections.max(data)){
                index = k;
            }
        }

        String[] namaPenyakit = {"FLUTD","Chlamydia","Helminthiasis","Ringworm","FIV","Scabies","Rhinotracheitis"};

        if(numPertanyaan==30) {
            Intent intentAkhir = new Intent(Q1Activity.this, ResultActivity.class);
            intentAkhir.putExtra("nilai", Collections.max(data));
            intentAkhir.putExtra("namapenyakit",namaPenyakit[index]);
            startActivity(intentAkhir);
        }
    }
}