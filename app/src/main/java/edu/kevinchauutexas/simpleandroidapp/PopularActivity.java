package edu.kevinchauutexas.simpleandroidapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class PopularActivity extends AppCompatActivity {
    private String[] places;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        places = new String[]{"Bangkok", "London", "Paris", "Singapore", "New York",
        "Istanbul", "Dubai", "Kuala Lumpur", "Hong Kong", "Barcelona"};

        // Get the message from the intent
        Intent intent = getIntent();

        // Create the text view
        String allPlaces = "";
        for(String s : places) {
            allPlaces += s + "\n";
        }

        TextView textView = new TextView(this);
        textView.setTextSize(40);
        textView.setText(allPlaces);

        // Set the text view as the activity layout
        setContentView(textView);
    }
}
