package com.example.harpatel.gameofloans;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class PrivateLoanActivity extends AppCompatActivity {
    private String[] makeArray(String filename) throws Exception

    {
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(getAssets().open(filename))
        );
        List<String> OCCUPATIONS = new ArrayList<String>();
        String mLine;
        while ((mLine = reader.readLine()) != null) {
            OCCUPATIONS.add(mLine);

        }
        String[] arr = OCCUPATIONS.toArray(new String[0]);
        return arr;
    }

    private static String[] Occupations;
    private static String[] Locations;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_private_loan);

        try {
            Occupations = makeArray("occupations.txt");
        } catch (Exception e) {
        }

        AutoCompleteTextView editText = findViewById(R.id.occupation_filed3);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, Occupations);
        editText.setAdapter(adapter);

        try {
            Locations = makeArray("locations.txt");
        } catch (Exception e) {
        }

        editText = findViewById(R.id.location_filed3);
        adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, Locations);
        editText.setAdapter(adapter);

        findViewById(R.id.backbutton3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PrivateLoanActivity.this, MainActivity.class);
                PrivateLoanActivity.this.startActivityForResult(intent, 100);
            }

        });
        Button btn1 = (Button) findViewById(R.id.add1);
        btn1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v)  {
                Toast.makeText(getBaseContext(), "Saved to my loans" , Toast.LENGTH_SHORT ).show();
            }
        });
    }
    }