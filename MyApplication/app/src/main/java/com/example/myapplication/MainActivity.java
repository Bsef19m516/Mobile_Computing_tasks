package com.example.myapplication;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void launchList(View v)
    {
        Intent intent = new Intent(this, alphabets.class);
        startActivity(intent);
    }

    public void launchAlpha(View v)
    {
        Intent intent = new Intent(this, alphabets.class);
        startActivity(intent);
    }



    public void launchRepo(View v)
    {
        Uri uri = Uri.parse("https://github.com/Bsef19m516/Mobile_Computing_tasks.git");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }
}