package com.jonatan_vahlberg.gitasignment;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button topBtn = findViewById(R.id.topBtn);
        Button bottomBtn = findViewById(R.id.bottomBtn);

        topBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"You clicked the Top button",Toast.LENGTH_SHORT).show();
                Log.i("Info","The User Clicked the top button");
            }
        });

        bottomBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"You clicked the bottom button",Toast.LENGTH_LONG).show();
                Log.i("Info","The User Clicked the Bottom button");
            }
        });
    }
}
