package com.example.quran_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import android.graphics.Color;

public class activity_surah extends AppCompatActivity {
    ListView surah_list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_surah);
        surah_list=findViewById(R.id.surah_list);
//        Intent intent=getIntent();
        QDH qdh=new QDH();
        ArrayAdapter<String> arrayadapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,qdh.GetSurahNames());
        surah_list.setAdapter(arrayadapter);
        surah_list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent=new Intent(getApplicationContext(), activity_surahtext.class);
                intent.putExtra("Surah_no",position+1); //position+1 because positions start from 0 but Surahs start from 1
                //intent.putExtra("image",imgs[position]);


                startActivity(intent);

            }
        });
    }
}
