package com.example.roshnighosh.costoutbreaktool;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.NumberPicker;
import android.widget.Spinner;

import java.util.ArrayList;

/**
 * Created by Abby on 2/18/19.
 */

public class RetrospectivePersonnel4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_retrospective_personnel4);

        final Button finishButton = findViewById(R.id.finishButtonRP);
        finishButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(RetrospectivePersonnel4.this, MainPage.class);
                startActivity(intent);
            }
        });

        final NumberPicker numPicker = findViewById(R.id.numberPickerRP);
        numPicker.setMaxValue(10);
        numPicker.setMinValue(0);

        String[] valueSet = {"0", "10", "20", "30", "40", "50", "60", "70", "80", "90", "100"};
        numPicker.setDisplayedValues(valueSet);

        final String[] select_task = {
                "Select Task", "Data Collection (interviews, EH assessments, sample collection)", "Data Management/Analysis",
                "Material Development (compiling/drafting/clearing scientific or press materials",
                "Meetings (internal, industry, outbreak setting, etc.)", "Media Responses", "Administrative",
                "Legal"};

        Spinner spinner = (Spinner) findViewById(R.id.taskSpinnerRP);

        ArrayList<CheckSpinner> listTasks = new ArrayList<>();

        for (int i = 0; i < select_task.length; i++) {
            CheckSpinner role = new CheckSpinner();
            role.setTitle(select_task[i]);
            role.setSelected(false);
            listTasks.add(role);
        }
        MyAdapter myAdapter = new MyAdapter(RetrospectivePersonnel4.this, 0,
                listTasks);
        spinner.setAdapter(myAdapter);

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
