package com.example.roshnighosh.costoutbreaktool;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

/**
 * Created by Abby on 1/28/19.
 */

public class SignUpPage3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up_page3);

        final Button nextButton = findViewById(R.id.finishButton);
        final CheckBox yesBox = findViewById(R.id.yesBox);
        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (yesBox.isChecked()) {
                    Intent intent = new Intent(SignUpPage3.this, RetrospectivePersonnel1.class);
                    startActivity(intent);
                } else {
                    Intent intent = new Intent(SignUpPage3.this, ProspectivePersonnel1.class);
                    startActivity(intent);
                }
            }
        });
    }
}
