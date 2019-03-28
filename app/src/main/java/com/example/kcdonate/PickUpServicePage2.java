package com.example.kcdonate;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class PickUpServicePage2 extends AppCompatActivity {
    EditText enterClothingNum;
    EditText enterHouseWareNum;
    EditText enterFurniture;
    EditText enterOthers;
    EditText enterEleDevice;
    TextView totalItemsTx;
    Button requestBtn;
    Button addImage;
    int totalItems;
    int clothingNum=0;
    int houseWareNum=0;
    int furniture =0;
    int eleDevice=0;
    int others=0;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pick_up_service_page2);

        enterClothingNum = findViewById(R.id.enterClothing);
        enterHouseWareNum = findViewById(R.id.enterHouseWare);
        totalItemsTx = findViewById(R.id.totalItemsTx);
        requestBtn = findViewById(R.id.requestButton);
        enterEleDevice = findViewById(R.id.enterEleDevice);
        enterFurniture = findViewById(R.id.enterFurniture);
        enterOthers = findViewById(R.id.enterOthers);
        addImage = findViewById(R.id.addImage);



        requestBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clothingNum =  Integer.parseInt(enterClothingNum.getText().toString());
                houseWareNum = Integer.parseInt(enterHouseWareNum.getText().toString());
                furniture = Integer.parseInt(enterFurniture.getText().toString());
                eleDevice = Integer.parseInt(enterEleDevice.getText().toString());
                others = Integer.parseInt(enterOthers.getText().toString());


                totalItems = clothingNum + houseWareNum + furniture + eleDevice + others;
                totalItemsTx.setText(new Integer(totalItems).toString());
            }
        });


    }
}
