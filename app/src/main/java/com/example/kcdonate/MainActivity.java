package com.example.kcdonate;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    public Button donateNowBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        donateNowBtn = (Button) findViewById(R.id.donateNowBtn);

        donateNowBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSelectionPage();
                /* Donate Now Button - takes to the next page for selection page
                   捐款按钮 用户进入捐款选择页面
                */

            }
        });
    }
    public void openSelectionPage() {
        Intent intent = new Intent(this, SelectionPage.class);
        startActivity(intent);
        //activity selection page 激活选择页面
    }
}