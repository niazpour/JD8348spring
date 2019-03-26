package com.example.roshnighosh.costoutbreaktool;

import android.content.Intent;
import android.os.Bundle;
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

                ArrayList<String> page2signin = getIntent().getStringArrayListExtra("page1");
                EditText lastnameInput = findViewById(R.id.lastnameInput);
                EditText phoneInput = findViewById(R.id.phoneInput);

                page2signin.add(3, lastnameInput.getText().toString());
                page2signin.add(4, phoneInput.getText().toString());

                Intent intent2 = new Intent(SignUpPage2.this, SignUpPage3.class);
                intent2.putExtra("page2", page2signin);
                startActivity(intent2);
            }
        });
    }
}
