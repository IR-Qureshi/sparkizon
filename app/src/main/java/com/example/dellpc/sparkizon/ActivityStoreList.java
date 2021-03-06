package com.example.dellpc.sparkizon;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class ActivityStoreList extends AppCompatActivity {
    private ListView mStoreListView;
    private AdapterStoreList mAdapterStoreList;
    Button BtnFeedBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_store_list);

        BtnFeedBack = (Button) findViewById(R.id.BtnFeedBack);
        BtnFeedBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ActivityStoreList.this,ActivityFeedBack.class);
                startActivity(intent);
            }
        });

        mStoreListView = (ListView) findViewById(R.id.storeList);
        List<ClassStore> classStoreList = new ArrayList<>();
        classStoreList.add(0,new ClassStore("KFC", "fast food", "$:0.00","10km",R.drawable.kfc));
        classStoreList.add(1,new ClassStore("KBC", "fast food", "$:15.00","15km",R.drawable.kbc));
        classStoreList.add(2,new ClassStore("Pizza hut", "pizza", "$:25.00","17km",R.drawable.pizzahut));
        classStoreList.add(3,new ClassStore("New york pizza", "pizza", "$:10.00","19km",R.drawable.newyork));
        classStoreList.add(4,new ClassStore("Domino pizza", "pizza", "$:0.00","25km",R.drawable.domino));
        classStoreList.add(5,new ClassStore("Dunkin Donuts", "fast food", "$:0.00","35km",R.drawable.dunkindonut));
        classStoreList.add(6,new ClassStore("Pizza Today", "pizza", "$:0.00","37km",R.drawable.pizzatoday));

        mAdapterStoreList = new AdapterStoreList(this,R.layout.custom_store_item,classStoreList);
        mStoreListView.setAdapter(mAdapterStoreList);

        mStoreListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(ActivityStoreList.this, ActivityStoreHome.class);
                startActivity(intent);
            }
        });

    }
}
