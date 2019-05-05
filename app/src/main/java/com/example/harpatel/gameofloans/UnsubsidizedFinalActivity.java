package com.example.harpatel.gameofloans;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class UnsubsidizedFinalActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_unsubsidized_final);

        findViewById(R.id.next3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(UnsubsidizedFinalActivity.this, PrivateFinalActivity.class);
                UnsubsidizedFinalActivity.this.startActivityForResult(intent, 100);
            }

        });
        findViewById(R.id.back).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(UnsubsidizedFinalActivity.this, SubsidizedFinalActivity.class);
                UnsubsidizedFinalActivity.this.startActivityForResult(intent, 100);
            }

        });
    }
}
