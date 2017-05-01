package com.example.dellpc.sparkizon;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        try {
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {

                    Intent intent = new Intent(MainActivity.this, ActivityStoreList.class);
                    startActivity(intent);
                    MainActivity.this.finish();
                }
            }, 3000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
