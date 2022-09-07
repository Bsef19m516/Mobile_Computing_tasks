package com.example.quran_app;

import androidx.appcompat.app.AppCompatActivity;
import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import com.google.android.material.navigation.NavigationView;
import android.widget.TextView;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity {
//    NavigationView navigationView;
//    DrawerLayout drawerLayout;
//    Toolbar toolbar;
//    ActionBarDrawerToggle toggle;
//
//    @Override
//    public void onBackPressed(){
//        if(drawerLayout.isDrawerOpen(GravityCompat.START)){
//            drawerLayout.closeDrawer(GravityCompat.START);
//            Toast.makeText(getApplicationContext(),"Start",Toast.LENGTH_LONG).show();
//
//        }
//        else
//        {
//            Toast.makeText(getApplicationContext(),"End",Toast.LENGTH_LONG).show();
//        }
//    }
    TextView txt;
    Button surah_names;
    Button parah_names;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        toolbar = findViewById(R.id.toolbar);
//        setSupportActionBar(toolbar);
//
//        navigationView=findViewById(R.id.nav_view);
//        drawerLayout=findViewById(R.id.drawer);
//
//        toggle=new ActionBarDrawerToggle(this,drawerLayout,toolbar,R.string.open,R.string.close);
//        drawerLayout.addDrawerListener(toggle);
//        toggle.syncState();
//
//        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
//
//            @Override
//            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem)
//            {
//                switch (menuItem.getItemId())
//                {
//                    case R.id.all_surah :
//                        Toast.makeText(getApplicationContext(),"Retur is Clicked",Toast.LENGTH_LONG).show();
//                        //Intent intent = new Intent(MainActivity.this, BookActivity.class);
//                        //startActivity(intent);
//                        Intent intent=new Intent(MainActivity.this, activity_surah.class);
//                        startActivity(intent);
//                        //drawerLayout.closeDrawer(GravityCompat.START);
//                        break;
//
//                    case R.id.all_parah :
//                        Toast.makeText(getApplicationContext(),"Retur is Clicked",Toast.LENGTH_LONG).show();
//                        Intent intent1=new Intent(MainActivity.this, activity_parah.class);
//                        startActivity(intent1);
//                        //drawerLayout.closeDrawer(GravityCompat.START);
//                        break;
//
//
//
//
//                }
//
//                return true;
//            }
//        });
       /*txt=findViewById(R.id.txt);
        DatabaseAccess databaseAccess=DatabaseAccess.getInstance(getApplicationContext());
        databaseAccess.open();
        String translation=databaseAccess.getTranslation(1);
        txt.setText(translation);*/

        surah_names=findViewById(R.id.surah_names);
        parah_names=findViewById(R.id.parah_names);
        surah_names.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this, activity_surah.class);
                startActivity(intent);
            }
        });

        parah_names.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this, activity_parah.class);
                startActivity(intent);
            }
        });
    }


}