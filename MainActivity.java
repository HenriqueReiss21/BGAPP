package com.example.bgapp;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myButtonListenerMethod();
    }
    public void myButtonListenerMethod() {
        final Button colorButton = (Button) findViewById(R.id.mybutton);
       colorButton.setOnClickListener(new View.OnClickListener() {
            @Override //se vc já tiver um método onClick, ele vai sobreescrever
            public void onClick(View v) {
                ConstraintLayout bgElement = (ConstraintLayout) findViewById(R.id.activity_main);
                int color = ((ColorDrawable) bgElement.getBackground()).getColor();
                if (color == Color.RED) {
                    bgElement.setBackgroundColor(Color.BLUE);
                } else {
                    bgElement.setBackgroundColor(Color.RED);
                }
            }
        });
    }
}
