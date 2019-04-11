package com.example.roshnighosh.costoutbreaktool;

import android.content.Intent;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.CheckedTextView;
import android.widget.ImageView;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class HomePage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);

        String jdbcUrl = "filler string";
        new HomePage.HomePageDB().execute(jdbcUrl);

        final Button loginButton = findViewById(R.id.logInButton);
        final Button signupButton = findViewById(R.id.signUpButton);

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                Intent intent = new Intent(HomePage.this, OutbreakChoice.class);
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

    private static class HomePageDB extends AsyncTask<String, String, String> {

        @Override
        protected String doInBackground(String[] objects) {

            try {
                Class.forName("com.mysql.jdbc.Driver");
            } catch(ClassNotFoundException ex) {
                System.err.println("Unable to load MySQL Driver");
            }
            return null;
        }
    }
}