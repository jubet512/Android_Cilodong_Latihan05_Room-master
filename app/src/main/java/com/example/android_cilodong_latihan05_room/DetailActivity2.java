package com.example.android_cilodong_latihan05_room;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class DetailActivity2 extends AppCompatActivity {

    EditText et_detail_Nama, et_detail_Kelas;
    Button bt_ubah, bt_hapus;


    Bundle b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail2);

        //ambil bundle
        Bundle b = null;
        b = this.getIntent().getExtras();

        et_detail_Nama = (EditText) findViewById(R.id.et_detail_nama);
        et_detail_Kelas = (EditText) findViewById(R.id.et_detail_kelas);

        //taruh bundle
        final int id = b.getInt("b_id", 0);
        et_detail_Nama.setText(b.getString("b_nama"));
        et_detail_Kelas.setText(b.getString("b_kelas"));

        bt_ubah = (Button) findViewById(R.id.btUbah);
        bt_hapus = (Button) findViewById(R.id.btHapus);

        bt_ubah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        bt_hapus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

    }
}
