package com.example.roshnighosh.costoutbreaktool;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by Abby on 2/18/19.
 */

public class RetrospectivePersonnel2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_retrospective_personnel2);

        final Button nextButton = findViewById(R.id.finishButton);
        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(RetrospectivePersonnel2.this, RetrospectivePersonnel3.class);
                startActivity(intent);
            }
        });
    }
}
