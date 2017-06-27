package com.example.android.booklisting;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private static final String URL_PREFIX = "https://www.googleapis.com/books/v1/volumes?q=";
    private static final String URL_POSTFIX = "&maxResults=15";

    public static String mFullUrl = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button searchButton = (Button) findViewById(R.id.search_button);

        // Set a click listener on that View
        searchButton.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the Search Button is clicked on.
            @Override
            public void onClick(View view) {
                EditText searchField = (EditText) findViewById(R.id.search_field);
                SearchURL searchURL = new SearchURL(URL_PREFIX, searchField.getText().toString(), URL_POSTFIX);
                mFullUrl = searchURL.getRequestUrlPrefix() + searchURL.getSearchQuery() + searchURL.getRequestUrlPostfix();
                Intent searchButtonIntent = new Intent(MainActivity.this, SearchResults.class);
                startActivity(searchButtonIntent);
            }
        });
    }

}