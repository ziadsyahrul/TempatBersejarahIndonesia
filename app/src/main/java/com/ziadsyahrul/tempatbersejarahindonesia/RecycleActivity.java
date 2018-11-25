package com.ziadsyahrul.tempatbersejarahindonesia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class RecycleActivity extends AppCompatActivity {

    //TODO 1 mengenerate butterknife untuk recycleview
    @BindView(R.id.my_recycler_view)
    RecyclerView myRecyclerView;

    //TODO 2 membuat variable array untuk menampung data nama,detail dan gambar dari String Array pada
    String[] namaTempat;
    String[] detailTempat;
    int[] gambarTempat;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycle);
        ButterKnife.bind(this);

        //TODO 3 Mengisi variable array dari folder -> Strings,drawable
        namaTempat = getResources().getStringArray(R.array.name_tempat);
        detailTempat = getResources().getStringArray(R.array.detail_tempat);
        gambarTempat = new int[]{R.drawable.borubudur,R.drawable.prambanan,R.drawable.lawang_sewu, R.drawable.rotterdam,R.drawable.vredeburg,R.drawable.taman_sari,R.drawable.maimun,R.drawable.ma_demak,R.drawable.ma_palembang,R.drawable.asta_tinggi};

        //TODO 4 Membuat object adpater dan mengirim data nama,detail dan gambar ke adapter
        Adapter adapter = new Adapter(RecycleActivity.this,gambarTempat,namaTempat,detailTempat);
        //TODO 5 Mensetting recyclerview dan mengeset recycleview dengan adapter
        myRecyclerView.setHasFixedSize(true);
        myRecyclerView.setLayoutManager(new LinearLayoutManager(RecycleActivity.this));
        myRecyclerView.setAdapter(adapter);

    }
}