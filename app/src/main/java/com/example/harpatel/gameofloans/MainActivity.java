package com.example.harpatel.gameofloans;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.private_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, PrivateLoanActivity.class);
                MainActivity.this.startActivityForResult(intent, 100);
            }

        });

        findViewById(R.id.sub_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SubsidizedActivity.class);
                MainActivity.this.startActivityForResult(intent, 100);
            }

        });

        findViewById(R.id.unsub_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, UnsubsidizedActivity.class);
                MainActivity.this.startActivityForResult(intent, 100);
            }

        });

        findViewById(R.id.budgeting).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, BudgetingActivity.class);
                MainActivity.this.startActivityForResult(intent, 100);
            }

        });
        findViewById(R.id.definitions).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, DefinitionsActivity.class);
                MainActivity.this.startActivityForResult(intent, 100);
            }

        });
        findViewById(R.id.Calculations).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, CalculationsActivity.class);
                MainActivity.this.startActivityForResult(intent, 100);
            }

        });
        findViewById(R.id.paymentplan).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, PaymentPlanActivity.class);
                MainActivity.this.startActivityForResult(intent, 100);
            }

        });

    }
}