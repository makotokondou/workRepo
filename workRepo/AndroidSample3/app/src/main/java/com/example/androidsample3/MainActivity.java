package com.example.androidsample3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static com.example.androidsample3.R.id.textView;

public class MainActivity extends AppCompatActivity {

    private TextView textVw;
    private boolean flag = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        R.id.button
        Button button = findViewById(R.id.button1);

        textVw = findViewById(textView);

        button.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view) {
                // flagがtrueの時
                if (flag) {
//                    textVw.setText(R.string.hello);
                    textVw.setText("Hello");
                    flag = false;
                }
                // flagがfalseの時
                else {
//                    textVw.setText(R.string.world);
                    textVw.setText("World");
                    flag = true;
                }
            }
        });
    }
}
