package com.example.dellpc.sparkizon;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class OrderScreen extends AppCompatActivity {

    Button btnOrder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_screen);

        btnOrder = (Button) findViewById(R.id.Place_Order_btn);
        btnOrder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(OrderScreen.this, ActivityOrderList.class);
                startActivity(intent);
            }
        });
    }
}
