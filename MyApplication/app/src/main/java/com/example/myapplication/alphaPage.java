package com.example.myapplication;
import androidx.appcompat.app.AppCompatActivity;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.icu.text.AlphabeticIndex;
import android.media.Image;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

public class alphaPage extends AppCompatActivity {

    @SuppressLint("UseCompatLoadingForDrawables")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alpha_page);

        Intent i = getIntent();
        String alphabet = i.getStringExtra("Alphabet");

        if(alphabet.equals("Apple"))
        {
            ((TextView)findViewById(R.id.alphaTV)).setText("A");
            ((TextView)findViewById(R.id.transTV)).setText("a");

            ImageView imageview= (ImageView)findViewById(R.id.imgView);
            imageview.setImageDrawable(getResources().getDrawable(R.drawable.apple));
            ((TextView)findViewById(R.id.nameTV)).setText("Apple");

        }
        else if(alphabet.equals("Banana"))
        {
            ((TextView)findViewById(R.id.alphaTV)).setText("B");
            ((TextView)findViewById(R.id.transTV)).setText("b");

            ImageView imageview= (ImageView)findViewById(R.id.imgView);
            imageview.setImageDrawable(getResources().getDrawable(R.drawable.banana));
            ((TextView)findViewById(R.id.nameTV)).setText("Banana");
        }
        else if(alphabet.equals("Date"))
        {
            ((TextView)findViewById(R.id.alphaTV)).setText("D");
            ((TextView)findViewById(R.id.transTV)).setText("d");

            ImageView imageview= (ImageView)findViewById(R.id.imgView);
            imageview.setImageDrawable(getResources().getDrawable(R.drawable.date));

            ((TextView)findViewById(R.id.nameTV)).setText("Date");
        }
        else if(alphabet.equals("Grapes"))
        {
            ((TextView)findViewById(R.id.alphaTV)).setText("G");
            ((TextView)findViewById(R.id.transTV)).setText("g");

            ImageView imageview= (ImageView)findViewById(R.id.imgView);
            imageview.setImageDrawable(getResources().getDrawable(R.drawable.grapes));

            ((TextView)findViewById(R.id.nameTV)).setText("Grapes");
        }
        else if(alphabet.equals("Orange"))
        {
            ((TextView)findViewById(R.id.alphaTV)).setText("O");
            ((TextView)findViewById(R.id.transTV)).setText("o");

            ImageView imageview= (ImageView)findViewById(R.id.imgView);
            imageview.setImageDrawable(getResources().getDrawable(R.drawable.orange));

            ((TextView)findViewById(R.id.nameTV)).setText("Orange");
        }

        else if(alphabet.equals("Pear"))
        {
            ((TextView)findViewById(R.id.alphaTV)).setText("P");
            ((TextView)findViewById(R.id.transTV)).setText("p");

            ImageView imageview= (ImageView)findViewById(R.id.imgView);
            imageview.setImageDrawable(getResources().getDrawable(R.drawable.pear));

            ((TextView)findViewById(R.id.nameTV)).setText("Pear");
        }


    }

}