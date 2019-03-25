package com.example.roshnighosh.costoutbreaktool;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.CheckedTextView;
import android.widget.ImageView;

public class HomePage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);

        final Button loginButton = findViewById(R.id.logInButton);
        final Button signupButton = findViewById(R.id.signUpButton);
        //final CheckedTextView registerView = findViewById(R.id.checkedTextView);
        //imageView = (ImageView) findViewById(R.id.imageView);

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                Intent intent = new Intent(HomePage.this, LoginPage.class);
                startActivity(intent);
            }
        });

        signupButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                Intent intent1 = new Intent(HomePage.this, SignUpPage.class);
                startActivity(intent1);
            }
        });
    }
}
