package com.example.kcdonate;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;


public class GroupDonation extends AppCompatActivity {
    ListView listView;

    String[] groups = {"KC Hospital Blood Donation", "KC Pet Rescue","Community Kitchen", "City Shelter"}; //groups name for list

    Integer[] picture = {R.drawable.hospital, R.drawable.pet,R.drawable.kitchen,R.drawable.shelter}; //groups icon

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_group_donation);

        listView =  findViewById(R.id.listView); //listview ID
        CustomAdaptor customAdaptor = new CustomAdaptor(); //custom list view
        listView.setAdapter(customAdaptor);

    }

    class CustomAdaptor extends BaseAdapter{    //create Custom listview class

        @Override
        public int getCount() {
            return picture.length;
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {

            View view=getLayoutInflater().inflate(R.layout.group_donation_custom,null);

            ImageView mImageView = view.findViewById(R.id.imageView);
            TextView mTextView = view.findViewById(R.id.textView);

            mImageView.setImageResource(picture[position]);
            mTextView.setText(groups[position]);

            return view;
        }
    }

}
