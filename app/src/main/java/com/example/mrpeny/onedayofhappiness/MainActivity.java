package com.example.mrpeny.onedayofhappiness;

import android.content.Intent;
import android.net.Uri;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CollapsingToolbarLayout mycollapsingtoolbar = (CollapsingToolbarLayout) findViewById(R.id.collapsing_toolbar_layout);
        mycollapsingtoolbar.setTitle(getString(R.string.app_name));
    }

    public void buyTicket(View view) {
        Uri webpage = Uri.parse(getResources().getString(R.string.buy_ticket_link));
        Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
    }
}
