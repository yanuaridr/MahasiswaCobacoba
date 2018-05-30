package com.example.user.mahasiswacobacoba;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.StrictMode;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;

import com.example.user.mahasiswacobacoba.adapter.MahasiswaAdapter;
import com.example.user.mahasiswacobacoba.model.Mahasiswa;
import com.squareup.picasso.Picasso;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //coba gambar
        ImageView ivCobaGambar = (ImageView) findViewById(R.id.iv_coba_gambar);

        Picasso.with(this).load("https://picsum.photos/200/300?image=1").into(ivCobaGambar);

//    int SDK_INT = android.os.Build.VERSION.SDK_INT;
//    if (SDK_INT > 8) {
//        StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder()
//                .permitAll().build();
//        StrictMode.setThreadPolicy(policy);
//        try {
//            URL url = new URL("https://picsum.photos/200/300?image=1");
//            Bitmap bmp = BitmapFactory.decodeStream(url.openConnection().getInputStream());
//        } catch (MalformedURLException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }

//        //1. data
        String[] nama = new String[]{"Yanuar", "Indrawati",
                "Azalia", "Farda"}; /*menampilkan data statis */

        Mahasiswa mahasiswa1 = new Mahasiswa();
        mahasiswa1.setNama("Yanuar");
        mahasiswa1.setNim("3.34.15.1.24");
        mahasiswa1.setEmail("yanuaridr@gmail.com");
        mahasiswa1.setFoto("https://picsum.photos/200/300?image=1");

        Mahasiswa mahasiswa2 = new Mahasiswa(
                "Indrawati",
                "3,34,15,1,25",
                "indrawati@gmail.com",
                "https://picsum.photos/200/300?image=1"
        );

        ArrayList<Mahasiswa> mahasiswas = new ArrayList<>();
        mahasiswas.add(mahasiswa1);
        mahasiswas.add(mahasiswa2);

        //2.adapter
        ArrayAdapter<String> adapter = new ArrayAdapter<String>( this,
        android.R.layout.simple_list_item_1,
        nama); /* membuat array adapter */

        MahasiswaAdapter mahasiswaAdapter = new MahasiswaAdapter( this,
                R.layout.item_mahasiswa,
                mahasiswas);

        //3.activity (menampilkan data)
        ListView lvDaftarNama = (ListView) findViewById(R.id.list_mahasiswa);
        lvDaftarNama.setAdapter(mahasiswaAdapter);
    }
}
