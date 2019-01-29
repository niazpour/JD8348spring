package com.example.roshnighosh.costoutbreaktool;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckedTextView;

public class LoginPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_page);

        final Button logButton = findViewById(R.id.loginButton);
        logButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                Intent intent = new Intent(LoginPage.this, MainPage.class);
                startActivity(intent);
            }
        });

        CheckedTextView cancelView = (CheckedTextView)findViewById(R.id.cancelButton);

        cancelView.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                Intent intent1 = new Intent(LoginPage.this, HomePage.class);
                startActivity(intent1);
            }
        });
    }
}
