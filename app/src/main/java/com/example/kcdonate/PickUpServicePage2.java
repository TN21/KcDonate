package com.example.kcdonate;

import android.content.Intent;
import android.media.Image;
import android.net.Uri;
import android.provider.MediaStore;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class PickUpServicePage2 extends AppCompatActivity {
    private static final int RESULT_LOAD_IMAGE = 1;
    EditText enterClothingNum;
    EditText enterHouseWareNum;
    EditText enterFurniture;
    EditText enterOthers;
    EditText enterEleDevice;
    TextView totalItemsTx;
    ImageView uploadImage1;
    ImageView uploadImage2;


    Button requestBtn;
    Button addImage;
    int totalItems;
    int clothingNum = 0;
    int houseWareNum = 0;
    int furniture = 0;
    int eleDevice = 0;
    int others = 0;





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
        uploadImage1 = findViewById(R.id.upLoadImage1);

        addImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent galleryIntent = new Intent(Intent.ACTION_PICK, MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
                startActivityForResult(galleryIntent, RESULT_LOAD_IMAGE);
            }
        });




        requestBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clothingNum = Integer.parseInt(enterClothingNum.getText().toString());
                houseWareNum = Integer.parseInt(enterHouseWareNum.getText().toString());
                furniture = Integer.parseInt(enterFurniture.getText().toString());
                eleDevice = Integer.parseInt(enterEleDevice.getText().toString());
                others = Integer.parseInt(enterOthers.getText().toString());


                totalItems = clothingNum + houseWareNum + furniture + eleDevice + others;
                totalItemsTx.setText(new Integer(totalItems).toString());
            }
        });



    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == RESULT_LOAD_IMAGE && resultCode == RESULT_OK && data !=null){
            Uri selectedImage = data.getData();
            uploadImage1.setImageURI(selectedImage);
        }
    }
}
