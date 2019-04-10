package com.example.roshnighosh.costoutbreaktool;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class RetrospectivePersonnel1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_retrospective_personnel1);

        final Button nextButton = findViewById(R.id.finishButton);
        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(RetrospectivePersonnel1.this, RetrospectivePersonnel3.class);
                startActivity(intent);
            }
        });
    }
}
