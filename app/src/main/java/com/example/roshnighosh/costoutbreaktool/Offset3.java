package com.example.roshnighosh.costoutbreaktool;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.NumberPicker;

/**
 * Created by Abby on 3/13/19.
 */

public class Offset3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_offset3);

        final Button nextButton = findViewById(R.id.nextButton);
        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Offset3.this, Overtime.class);
                startActivity(intent);
            }
        });

        final NumberPicker numPickerOW = findViewById(R.id.numberPickerOW);
        numPickerOW.setMaxValue(10);
        numPickerOW.setMinValue(0);

        String[] valueSet = {"0", "10", "20", "30", "40", "50", "60", "70", "80", "90", "100"};
        numPickerOW.setDisplayedValues(valueSet);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "For questions, please contact Hilary Whitham at #", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }
}
