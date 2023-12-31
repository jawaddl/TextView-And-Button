package com.example.textview;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.view.View;
import android.widget.TextView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private TextView tv;
    private TextView counter;

    int count = 0 ;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    tv = findViewById(R.id.textView);
    counter = findViewById(R.id.textView2);
    tv.setTextSize(70);//משנה את גודל המילה
    tv.setTextColor(Color.CYAN);//משנה את הצבע
    tv.setText("Hello");//משנה את הטקסט"המקורי"שנמצא בXML
    tv.setVisibility(0); //משאיר/מעלים את המילה...0 היא נשארת ו(1-)המילה נעלמת
    counter.setTextSize(50);
    }



    public void Click(View view) {
        count++;
        String str = count + " ";
        counter.setText(str);
    }

}