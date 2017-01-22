package com.example.quick.fitnessjourney;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class initial_2 extends AppCompatActivity{

// implements AdapterView.OnItemSelectedListener {
    Button finishBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_initial_2);

        Spinner spinDay1 = (Spinner) findViewById(R.id.movement1);
        ArrayAdapter <CharSequence> adapter1 = ArrayAdapter.createFromResource(this, R.array.movementArray, android.R.layout.simple_spinner_item);
        adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinDay1.setAdapter(adapter1);

        Spinner spinDay2 = (Spinner) findViewById(R.id.movement2);
        ArrayAdapter <CharSequence> adapter2 = ArrayAdapter.createFromResource(this, R.array.movementArray, android.R.layout.simple_spinner_item);
        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinDay2.setAdapter(adapter2);

        Spinner spinDay3 = (Spinner) findViewById(R.id.movement3);
        ArrayAdapter <CharSequence> adapter3 = ArrayAdapter.createFromResource(this, R.array.movementArray, android.R.layout.simple_spinner_item);
        adapter3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinDay3.setAdapter(adapter3);

        Spinner spinDay4 = (Spinner) findViewById(R.id.movement4);
        ArrayAdapter <CharSequence> adapter4 = ArrayAdapter.createFromResource(this, R.array.movementArray, android.R.layout.simple_spinner_item);
        adapter4.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinDay4.setAdapter(adapter4);

        finishBtn = (Button)findViewById(R.id.finishID);
        finishBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(initial_2.this, Continue_2.class);
                startActivity(intent);
            }
        });
    }
}

//    @Override
//    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
//
//    }
//
//    @Override
//    public void onNothingSelected(AdapterView<?> parent) {
//
//    }

