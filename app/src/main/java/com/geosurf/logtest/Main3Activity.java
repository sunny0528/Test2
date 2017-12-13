package com.geosurf.logtest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main3Activity extends AppCompatActivity {

    Button button,button1;
    private int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        button = (Button) findViewById(R.id.button3);
        button1 = (Button) findViewById(R.id.button4);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count++;
                CustomToast.INSTANCE.showToast(Main3Activity.this,"点击次数："+count);
            }
        });

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CustomToast.INSTANCE.showToast(Main3Activity.this,"插一脚");
            }
        });
    }
}
