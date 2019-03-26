package com.example.kcdonate;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DropOffLocation extends AppCompatActivity {

    public Button dropOffLocBtn1;
    public Button dropOffLocBtn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drop_off_location);

        dropOffLocBtn1 = findViewById(R.id.dropOffLocBtn1);
        dropOffLocBtn2 = findViewById(R.id.dropOffLocBtn2);

        dropOffLocBtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String uri = "https://maps.google.com/maps?f=d&daddr=9107, MO-45, Parkville, MO 64152";
                Intent intent = new Intent(android.content.Intent.ACTION_VIEW, Uri.parse(uri));
                intent.setClassName("com.google.android.apps.maps", "com.google.android.maps.MapsActivity");
                startActivity(intent);

            }
        });

        dropOffLocBtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String uri = "https://maps.google.com/maps?f=d&daddr=301 E 51st st, Kansas City, MO 64112";
                Intent intent = new Intent(android.content.Intent.ACTION_VIEW, Uri.parse(uri));
                intent.setClassName("com.google.android.apps.maps", "com.google.android.maps.MapsActivity");
                startActivity(intent);
            }
        });


    }
}
