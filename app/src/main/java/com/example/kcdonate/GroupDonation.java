package com.example.kcdonate;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class GroupDonation extends AppCompatActivity {
    ListView listView;

    String[] groups = {"KC Hospital Blood Denotation", "KC Pet Rescue","Community Kitchen", "City Shelter"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_group_donation);
        listView =  findViewById(R.id.gourpDonationListView);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,groups);
        listView.setAdapter(arrayAdapter);

    }
}
