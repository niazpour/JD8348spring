package com.example.roshnighosh.costoutbreaktool;

import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 * Created by Abby on 1/28/19.
 */

public class SignUpPage3 extends AppCompatActivity {

    static ArrayList<String> page3signin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up_page3);

        final Button finishButton = findViewById(R.id.finishsuButton);
        final CheckBox yesBox = findViewById(R.id.yesBox);
        finishButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                //DATABASE: get arraylist from previous screen
                page3signin = getIntent().getStringArrayListExtra("page2");

                EditText dateInput = findViewById(R.id.dateInput);

                //DATABASE: add this screen's inputs to the arraylist
                page3signin.add(6, dateInput.getText().toString());

                //DATABASE: ONLY INCLUDE IF FINAL SCREEN OF DATA CATEGORY
                new SignUpDB().execute();

                if (yesBox.isChecked()) {
                    Intent intent = new Intent(SignUpPage3.this, RetrospectivePersonnel1.class);
                    startActivity(intent);
                } else {
                    Intent intent = new Intent(SignUpPage3.this, ProspectivePersonnel1.class);
                    startActivity(intent);
                }
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
    //DATABASE: ONLY INCLUDE IF FINAL SCREEN OF DATA CATEGORY
    // Async Task runs outside of the main thread (database work cannot be done on main thread)
    private static class SignUpDB extends AsyncTask<Void, Void, Void> {

        @Override
        protected Void doInBackground(Void[] objects) {

            //FOR FUTURE WORK: change the below 3 parameters to match the database that is being used
            try(Connection con = DriverManager.getConnection("jdbc:mysql://academic-mysql.cc.gatech.edu", "cs3312_group", "_tADAn4D")) {
                System.out.println("Connected!");// irrelevant line (just for testing)

                //points connection to our database in the system
                String queryString1 = "USE cs3312_group;";

                //INSERT query using the inputs from the arraylist
                String queryString2 = "INSERT INTO user_info (agency, role, lead, last_name, phone_number, email, start_date) " +
                        "VALUES ('"+page3signin.get(0)+"', '"+page3signin.get(1)+"', '"+page3signin.get(2)+"', '"+page3signin.get(3)+
                        "', '"+page3signin.get(4)+"', '"+page3signin.get(5)+"', '"+page3signin.get(6)+"');";

                //System.out.println(queryString2); (just for testing)

                //run below 4 lines to execute the queries in the database
                Statement stmt = con.createStatement();
                stmt.executeUpdate(queryString1);
                stmt.executeUpdate(queryString2);
                stmt.close();

            } catch(SQLException e) { //just in case something goes wrong
                System.out.println("Failed");
            }
            return null;
        }
    }
}
