package com.example.kcdonate;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MoneyDonation extends AppCompatActivity {
    public TextView donatePriceTx;
    public Button fiveDollarBtn;
    public Button tenDollarBtn;
    public Button twentyDollarBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_money_donation);

        fiveDollarBtn = (Button)findViewById(R.id.fiveDollarBtn);
        tenDollarBtn =(Button) findViewById(R.id.tenDollarBtn) ;
        twentyDollarBtn =(Button) findViewById(R.id.twentyDollarBtn) ;
        donatePriceTx = (TextView) findViewById(R.id.donatePriceTx);


        fiveDollarBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                donatePriceTx.setText("5");
            }
        });

        tenDollarBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                donatePriceTx.setText("10");

            }
        });

        twentyDollarBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                donatePriceTx.setText("20");
            }
        });


    }
}
