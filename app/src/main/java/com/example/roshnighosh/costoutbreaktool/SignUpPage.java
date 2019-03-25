package com.example.roshnighosh.costoutbreaktool;

import android.content.Intent;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
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

        final Button nextButton = findViewById(R.id.finishButton);
        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String jdbcUrl = "jdbc:mysql://10.0.2.2:3306/mydb";
                new SignUpDB().execute(jdbcUrl);

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

    private static class SignUpDB extends AsyncTask<String, String, String> {

        @Override
        protected String doInBackground(String[] objects) {

            try {
                Class.forName("com.mysql.jdbc.Driver");
            } catch(ClassNotFoundException ex) {
                System.err.println("Unable to load MySQL Driver");
            }
            System.out.println(Thread.currentThread().getName());

            try(Connection con = DriverManager.getConnection(objects[0], "root", "M65IUaa5cx")) {
                System.out.println("Connected!");
                String queryString = "select version()";
                Statement stmt = con.createStatement();
                ResultSet rset = stmt.executeQuery(queryString);
                while ( rset.next()) {
                    System.out.println("Version: " + rset.getString(1));
                }

                rset.close();
                stmt.close();
            } catch(SQLException e) {
                System.out.println("Failed");
            }
            return null;
        }
    }
}
