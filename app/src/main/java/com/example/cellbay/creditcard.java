package com.example.cellbay;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class creditcard extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.credit_card);
    }

    public void displayToast(View v) {
        Toast.makeText(creditcard.this, "Order place successfully", Toast.LENGTH_SHORT).show();
    }
}
