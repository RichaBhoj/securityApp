package com.example.androidsecurity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class HomeScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);
    }
    public void goToAnActivity(View view) {
        Intent intent = new Intent(this, ScanActivity.class);
        startActivity(intent);
    }
    public void goToHistory(View view) {
        Intent intent = new Intent(this, ScanActivity.class);
        startActivity(intent);
    }
    public void goToAccount(View view) {
        Intent intent = new Intent(this, ScanActivity.class);
        startActivity(intent);
    }
}