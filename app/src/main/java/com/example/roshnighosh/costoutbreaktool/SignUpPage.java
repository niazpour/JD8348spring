package com.example.roshnighosh.costoutbreaktool;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import java.util.ArrayList;

public class SignUpPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up_page);

        final Button nextButton = findViewById(R.id.finishButton);
        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent(SignUpPage.this, SignUpPage2.class);
                startActivity(intent2);
            }
        });

        final String[] select_role = {
                "Select Role", "Administrative", "Agency Leadership",
               "Emergency Preparedness and Response", "Environmental Health",
                "Epidemiology", "Laboratory (see note in description)",
                "Legal", "Public Health Communications (media)",
                "Public Health Nurse", "Student Worker (unpaid)"};

        Spinner spinner = (Spinner) findViewById(R.id.roleSpinner);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
                this, android.R.layout.simple_spinner_item, select_role);

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
    }
}
