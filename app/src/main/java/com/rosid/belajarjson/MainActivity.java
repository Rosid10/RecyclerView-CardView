package com.rosid.belajarjson;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private MahasiswaAdapter adapter;
    private ArrayList<Mahasiswa> mahasiswaArrayList;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addData();
        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        adapter = new MahasiswaAdapter(mahasiswaArrayList);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(MainActivity.this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
    }

    void addData(){

        mahasiswaArrayList = new ArrayList<>();
        mahasiswaArrayList.add(new Mahasiswa("B4787NAR", "Muhammad Rosyid", "rosyid593@gmail.com"));
        mahasiswaArrayList.add(new Mahasiswa("B4565NJK", "Wawan Setyawan", "wawan77@gmail.com"));
        mahasiswaArrayList.add(new Mahasiswa("B8990NIR", "Ardiyan Pratama", "pratama022@gmail.com"));
        mahasiswaArrayList.add(new Mahasiswa("B2334NLP", "Rahmat Hidayat", "hidayat132@gmail.com"));
        mahasiswaArrayList.add(new Mahasiswa("B7668NEW", "Rizky Kurniawan", "rizky448@gmail.com"));
    }
}