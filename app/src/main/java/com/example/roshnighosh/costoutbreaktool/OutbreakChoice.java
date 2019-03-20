package com.example.roshnighosh.costoutbreaktool;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by Abby on 3/15/19.
 */

public class OutbreakChoice extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_outbreak_choice);

        final Button outbreak1Button = findViewById(R.id.outbreak1_button);
        outbreak1Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(OutbreakChoice.this, ProspectivePersonnel1.class);
                startActivity(intent);
            }
        });

        final Button outbreak2Button = findViewById(R.id.outbreak2_button);
        outbreak2Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(OutbreakChoice.this, ProspectivePersonnel1.class);
                startActivity(intent);
            }
        });
    }
}
