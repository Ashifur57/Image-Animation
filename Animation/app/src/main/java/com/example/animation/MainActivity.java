package com.example.animation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    Button btn;
    ImageView imageView1, imageView2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView1 = findViewById(R.id.image1);
        imageView2 = findViewById(R.id.image2);
        btn = findViewById(R.id.animBTN);

        imageView1.animate().rotation(360f).setDuration(5000);
        imageView2.animate().alpha(1f).setDuration(5000);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //imageView1.animate().alpha(0f).setDuration(5000);
                //imageView1.animate().rotation(360f).setDuration(5000);
                imageView1.animate().translationX(1000f).setDuration(5000);
                imageView2.animate().translationX(-1000f).setDuration(5000);
                //imageView1.animate().scaleX(0.5f).scaleY(0.5f).setDuration(5000);
                //imageView1.animate().translationXBy(1000f).translationY(1000f).rotation(90f).setDuration(5000);
            }
        });
    }
}