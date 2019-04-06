package com.example.myapplication;

import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button button1;
    Button button2;
    Button button3;
    TextView textView1;
    TextView textView2;
    ImageView imageView1;

    private static final String TAG = "myLogs";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d(TAG, "Найден View-элемент");

        button1 = findViewById(R.id.button);
        button2 = findViewById(R.id.button2);
        textView1 = findViewById(R.id.textView);
        textView2 = findViewById(R.id.textView2);
        imageView1 = findViewById(R.id.imageView);
        imageView1.setImageDrawable(getDrawable(R.drawable.ic_account_circle_black_48dp));



        View.OnClickListener onClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (view.getId()) {
                    case R.id.button:
                        textView1.setText(R.string.hi);
                        imageView1.setImageDrawable(getDrawable(R.drawable.ic_account_circle_black_48dp));
                        Log.d(TAG, "Обработка кнопки 1");
                        break;
                    case R.id.button2:
                        textView1.setText(R.string.cool);
                        imageView1.setImageDrawable(getDrawable(R.drawable.ic_account_circle_black_48dp));
                        Log.d(TAG, "Обработка кнопки 2");
                        break;
                    case R.id.imageView:
                        textView1.setText(R.string.just_text);
                        imageView1.setImageDrawable(getDrawable(R.drawable.ic_account_box_black_48dp));
                        Log.d(TAG, "Нажато imageView");
//                        Toast toast = Toast.makeText (MainActivity.this, "Нажато imageView", Toast.LENGTH_LONG);
//                        toast.setGravity(Gravity.TOP, 0, 150);
//                        LinearLayout toastImage = (LinearLayout) toast.getView();
//                        ImageView imageView2 = new ImageView(MainActivity.this);
//                        imageView2.setImageDrawable(getDrawable(R.drawable.ic_cloud_queue_black_48dp));
//                        toastImage.addView(imageView2, 1);
//                        toast.show();
                        Toast toast = Toast.makeText(MainActivity.this, "Pushed imageView", Toast.LENGTH_LONG);
                        toast.setGravity(Gravity.BOTTOM, 0 , 0);
                        toast.show();
                        break;
                }
            }
        };
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });


        button1.setOnClickListener(onClickListener);
        button2.setOnClickListener(onClickListener);
        imageView1.setOnClickListener(onClickListener);
    }
}


