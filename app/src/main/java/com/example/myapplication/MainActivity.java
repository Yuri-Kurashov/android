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
    TextView textView1;
    ImageView imageView1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1 = findViewById(R.id.button);
        button2 = findViewById(R.id.button2);
        textView1 = findViewById(R.id.textView);
        imageView1 = findViewById(R.id.imageView);
        imageView1.setImageDrawable(getResources().getDrawable(R.drawable.ic_account_circle_black_48dp));

        View.OnClickListener onClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (view.getId()) {
                    case R.id.button:
                        textView1.setText(R.string.hi);
                        imageView1.setImageDrawable(getResources().getDrawable(R.drawable.ic_account_circle_black_48dp));
                        break;
                    case R.id.button2:
                        textView1.setText(R.string.cool);
                        imageView1.setImageDrawable(getResources().getDrawable(R.drawable.ic_account_circle_black_48dp));
                        break;
                    case R.id.imageView:
                        textView1.setText(R.string.just_text);
                        imageView1.setImageDrawable(getResources().getDrawable(R.drawable.ic_account_box_black_48dp));
                        break;
                }
            }
        };

        button1.setOnClickListener(onClickListener);
        button2.setOnClickListener(onClickListener);
        imageView1.setOnClickListener(onClickListener);
    }
}
