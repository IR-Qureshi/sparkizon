package com.example.dellpc.sparkizon;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ActivityOrderList extends AppCompatActivity {

    Button btnSendOrder;
    Button btnMenu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_list);

        btnSendOrder = (Button) findViewById(R.id.PlaceOrder_btn);
        btnMenu = (Button) findViewById(R.id.gotomenu_btn);

        btnSendOrder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ActivityOrderList.this, ActivityLogin.class);
                startActivity(intent);
            }
        });

        btnMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ActivityOrderList.this, ActivityMenu.class);
                startActivity(intent);
            }
        });
    }
}
