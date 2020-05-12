package com.example.cookies;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void eatCookie(View view) {
        ImageView im=(ImageView)findViewById(R.id.texteat);
        im.setImageResource(R.drawable.after_cookie);
        TextView tm=findViewById(R.id.textForEat);
        tm.setText("I am Full Bro");
    }
}
