package com.example.roshnighosh.costoutbreaktool;

import android.content.Intent;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Spinner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class SignUpPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up_page);

        //DATABASE: recreate in the first input page of every data category
        final ArrayList<String> page1signin = new ArrayList<>();

        final Button nextButton = findViewById(R.id.nextButton);
        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText agencyInput = findViewById(R.id.agencyInput);
                Spinner roleSpinner = findViewById(R.id.roleSpinner);
                CheckBox yesBox = findViewById(R.id.leadCheckYes);

                //DATABASE: add inputs to the created arraylist
                page1signin.add(0, agencyInput.getText().toString());
                page1signin.add(1, roleSpinner.getSelectedItem().toString());
                if (yesBox.isChecked()) {
                    page1signin.add(2, "yes");
                } else {
                    page1signin.add(2, "no");
                }

                Intent intent2 = new Intent(SignUpPage.this, SignUpPage2.class);

                //DATABASE: send arraylist to the next page
                intent2.putExtra("page1", page1signin);

                startActivity(intent2);

            }
        });

        final String[] select_role = {
                "Select Role", "Administrative", "Agency Leadership",
               "Emergency Preparedness and Response", "Environmental Health",
                "Epidemiology", "Laboratory (see note in description)",
                "Legal", "Public Health Communications (media)",
                "Public Health Nurse", "Student Worker (unpaid)", "Interpreter"};

        Spinner spinner = (Spinner) findViewById(R.id.roleSpinner);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
                this, android.R.layout.simple_spinner_item, select_role);

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
    }
}
