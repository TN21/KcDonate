package com.example.kcdonate;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ContactUs extends AppCompatActivity {

    private Button callBtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact_us);

        callBtn = findViewById(R.id.callBtn);
        //emailBtn = findViewById(R.id.emailBtn);

        callBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:8163724777"));
                startActivity(intent);

            }
        });


    }
}
