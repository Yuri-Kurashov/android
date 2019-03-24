package com.example.myapplication;

import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

Button button1;
Button button2;
TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1 = findViewById(R.id.button);
        button2 = findViewById(R.id.button2);
        text = findViewById(R.id.textView);

        View.OnClickListener onClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (view.getId()) {
                    case R.id.button:
                        text.setText(R.string.Pushed_back);
                        break;
                    case R.id.button2:
                        text.setText(R.string.Pushed_change);
                        break;

                }
            }

        };
        button1.setOnClickListener(onClickListener);
        button2.setOnClickListener(onClickListener);


    }

}
