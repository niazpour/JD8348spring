package com.example.roshnighosh.costoutbreaktool;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;

/**
 * Created by Abby on 1/28/19.
 */

public class SignUpPage2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up_page2);

        final Button nextButton = findViewById(R.id.nextButton);
        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //DATABASE: get arraylist passed from last screen
                ArrayList<String> page2signin = getIntent().getStringArrayListExtra("page1");

                EditText lastnameInput = findViewById(R.id.lastnameInput);
                EditText phoneInput = findViewById(R.id.phoneInput);
                EditText emailInput = findViewById(R.id.emailInput);

                //DATABASE: add the new inputs to the arraylist
                page2signin.add(3, lastnameInput.getText().toString());
                page2signin.add(4, phoneInput.getText().toString());
                page2signin.add(5, emailInput.getText().toString());

                Intent intent2 = new Intent(SignUpPage2.this, SignUpPage3.class);

                //DATABASE: send the arraylist on to the next page
                intent2.putExtra("page2", page2signin);

                startActivity(intent2);
            }
        });

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
