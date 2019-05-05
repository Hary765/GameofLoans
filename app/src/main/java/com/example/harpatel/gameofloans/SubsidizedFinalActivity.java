package com.example.harpatel.gameofloans;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class SubsidizedFinalActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subsidized_final);

        findViewById(R.id.next).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SubsidizedFinalActivity.this, UnsubsidizedFinalActivity.class);
                SubsidizedFinalActivity.this.startActivityForResult(intent, 100);
            }

        });
    }
}
