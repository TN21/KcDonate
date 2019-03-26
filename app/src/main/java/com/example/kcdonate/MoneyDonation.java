package com.example.kcdonate;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.content.DialogInterface;

public class MoneyDonation extends AppCompatActivity {

    public Button fiveDollarBtn;
    public Button tenDollarBtn;
    public Button twentyDollarBtn;
    public Button moneyDonateBtn;
    EditText enterAmount;
    int donateAmount = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_money_donation);


        fiveDollarBtn = findViewById(R.id.fiveDollarBtn);
        tenDollarBtn = findViewById(R.id.tenDollarBtn);
        twentyDollarBtn = findViewById(R.id.twentyDollarBtn);
        enterAmount = findViewById(R.id.enterDonateAmount);
        moneyDonateBtn = findViewById(R.id.moneyDonateBtn);


        fiveDollarBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                donateAmount = 5;
                enterAmount.setText(new Integer(donateAmount).toString());

            }
        });

        tenDollarBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                donateAmount = 10;
                enterAmount.setText(new Integer(donateAmount).toString());
            }
        });

        twentyDollarBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                donateAmount = 20;
                enterAmount.setText(new Integer(donateAmount).toString());

            }
        });

        moneyDonateBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                        donateAmount = Integer.parseInt(enterAmount.getText().toString());
                        AlertDialog.Builder builder = new AlertDialog.Builder(MoneyDonation.this);
                        builder.setTitle("You will be donate $" + donateAmount);
                        builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                donateAmount = 0;
                            }
                        });
                        builder.show();




                }
            });


    }

}