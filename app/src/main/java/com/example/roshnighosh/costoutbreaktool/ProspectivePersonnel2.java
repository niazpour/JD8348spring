package com.example.roshnighosh.costoutbreaktool;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.NumberPicker;
import android.widget.Spinner;

import java.util.ArrayList;

/**
 * Created by Abby on 2/13/19.
 */

public class ProspectivePersonnel2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prospective_personnel2);

        final Button finishButton = findViewById(R.id.finishButton);
        finishButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ProspectivePersonnel2.this, MainPage.class);
                startActivity(intent);
            }
        });

        final NumberPicker numPicker = findViewById(R.id.numberPicker);
        numPicker.setMaxValue(100);
        numPicker.setMinValue(0);

        final String[] select_task = {
                "Select Task", "Data Management", "Data Analysis", "Lab Methods", "EH Methods",
        "Epi Methods", "Information Gathering", "Communications(investigational partners)", "Material Development",
        "Public Communications", "Leadership", "Other Tasks", "Legal"};

        Spinner spinner = (Spinner) findViewById(R.id.taskSpinner);

        ArrayList<CheckSpinner> listTasks = new ArrayList<>();

        for (int i = 0; i < select_task.length; i++) {
            CheckSpinner role = new CheckSpinner();
            role.setTitle(select_task[i]);
            role.setSelected(false);
            listTasks.add(role);
        }
        MyAdapter myAdapter = new MyAdapter(ProspectivePersonnel2.this, 0,
                listTasks);
        spinner.setAdapter(myAdapter);
    }
}
