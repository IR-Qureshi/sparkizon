package com.example.dellpc.sparkizon;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ActivityStoreHome extends AppCompatActivity {

    Button btnMenu;
    Button btnOrderList;
    Button btnFindStore;
    Button btnInfo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_store_home);

        btnMenu = (Button) findViewById(R.id.Go_To_Menu);
        btnOrderList = (Button) findViewById(R.id.Go_To_Order_List);
        btnFindStore = (Button) findViewById(R.id.FindStore);
        btnInfo = (Button) findViewById(R.id.Info);

        btnMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(ActivityStoreHome.this, ActivityMenu.class);
                startActivity(intent);
            }
        });
        btnOrderList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ActivityStoreHome.this, OrderScreen.class);
                startActivity(intent);
            }
        });
        btnFindStore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ActivityStoreHome.this, ActivityFindStore.class);
                startActivity(intent);

            }
        });
        btnInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ActivityStoreHome.this, ActivityInfo.class);
                startActivity(intent);

            }
        });
    }
}
