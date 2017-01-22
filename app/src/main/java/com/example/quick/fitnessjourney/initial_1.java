package com.example.quick.fitnessjourney;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;

public class initial_1 extends AppCompatActivity {

    Button cutBtn;
    Button bulkBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_initial_1);

        cutBtn = (Button) findViewById(R.id.cutID);
        cutBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(initial_1.this,initial_2.class);
                startActivity(intent1);
            }
        });
        bulkBtn = (Button) findViewById(R.id.bulkID);
        bulkBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(initial_1.this,initial_2.class);
                startActivity(intent2);
            }
        });

    }
}
