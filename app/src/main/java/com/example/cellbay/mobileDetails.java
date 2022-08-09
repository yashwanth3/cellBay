package com.example.cellbay;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class mobileDetails extends AppCompatActivity {

    ImageView imageView;
    TextView textView,txtBrand,txtCellName,txtPrice;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mobile_details);
        imageView=findViewById(R.id.imageView2);
        textView=findViewById(R.id.txtcellName);
        txtBrand=findViewById(R.id.txtBrand);
        txtCellName=findViewById(R.id.txtcellName);
        txtPrice=findViewById(R.id.txtPrice);
        imageView.setImageResource(getIntent().getIntExtra("image_id",00));
        textView.setText(getIntent().getStringExtra("imageName"));
        txtBrand.setText(getIntent().getStringExtra("Brand"));
        txtPrice.setText(getIntent().getStringExtra("Price"));

        Button btnBuy=(Button) findViewById(R.id.btnBuy);

        btnBuy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(mobileDetails.this,checkout.class);
                startActivity(intent);
            }
        });



    }
}
