package com.example.animation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    boolean isEgg=true;
    public void change(View view){
        ImageView imageView=findViewById(R.id.imageView);
        ImageView imageView4=findViewById(R.id.imageView4);
        if(isEgg){
            imageView.animate().alpha(1).setDuration(2000);
            imageView4.animate().alpha(0).setDuration(2000);
            isEgg=false;
        }else{
            imageView.animate().alpha(0).setDuration(2000);
            imageView4.animate().alpha(1).setDuration(2000);
            isEgg=true;

        }


    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView imageView=findViewById(R.id.imageView);
        imageView.animate().setDuration(4000).alpha(0);
    }
}