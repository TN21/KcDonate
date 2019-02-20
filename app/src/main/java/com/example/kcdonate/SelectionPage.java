package com.example.kcdonate;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SelectionPage extends AppCompatActivity {

    public Button cashBtn;
    public Button groupBtn;
    public Button dropOffBtn;
    public Button pickUpBtn;
    public Button helpBtn;
    public Button contactBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selection_page);

        cashBtn = (Button) findViewById(R.id.cashBtn);
        groupBtn=  (Button)findViewById(R.id.groupBtn);
        dropOffBtn = (Button) findViewById(R.id.dropOffBtn);
        pickUpBtn =(Button) findViewById(R.id.pickUpBtn);
        helpBtn = (Button) findViewById(R.id.helpBtn);
        contactBtn = (Button)findViewById(R.id.contactBtn);

        cashBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMoneyDonation();}

        });

        groupBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openGroupDonation();
            }
        });

        dropOffBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openDropOffLocation();
            }
        });

        pickUpBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openPickUpService();
            }
        });

        helpBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openHelp();
            }
        });
        contactBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openContactUs();
            }
        });
    }
    public void openMoneyDonation(){
        Intent intent = new Intent(this,MoneyDonation.class);
                startActivity(intent);
    }

    public void openGroupDonation(){
        Intent intent = new Intent(this,GroupDonation.class);
                startActivity(intent);
    }

    public void openDropOffLocation(){
        Intent intent = new Intent(this,DropOffLocation.class);
                startActivity(intent);
    }

    public void openPickUpService(){
        Intent intent = new Intent(this, PickUpService.class);
                startActivity(intent);
    }

    public void openHelp(){
        Intent intent = new Intent(this, Help.class);
                startActivity(intent);
    }
    public void openContactUs(){
        Intent intent = new Intent(this, ContactUs.class);
                startActivity(intent);
    }
}
