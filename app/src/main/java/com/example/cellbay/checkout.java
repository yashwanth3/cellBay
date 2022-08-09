package com.example.cellbay;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class checkout extends AppCompatActivity {
    TextView firstName,LastName,emailId,add1,add2,city,country,PostalAddress;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.checkout_form);

        firstName=(TextView)findViewById(R.id.FirstName);
        LastName=(TextView)findViewById(R.id.LastName);
        emailId = (TextView) findViewById(R.id.idMail);
        add1=(TextView)findViewById(R.id.idAdd01);
        add2=(TextView)findViewById(R.id.add_2);
        city=(TextView)findViewById(R.id.city);
        country=(TextView)findViewById(R.id.country);
        PostalAddress=(TextView)findViewById(R.id.editTextTextPostalAddress);
        Button btnnavtocc = (Button) findViewById(R.id.Next);
        btnnavtocc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(firstName.getText().toString().isEmpty()) {
                    Toast.makeText(checkout.this, "Please fill First Name Details", Toast.LENGTH_SHORT).show();
                }
                else if(LastName.getText().toString().isEmpty()){
                    Toast.makeText(checkout.this, "Please fill Last Name Details", Toast.LENGTH_SHORT).show();
                }
                else if(emailId.getText().toString().isEmpty()){
                    Toast.makeText(checkout.this, "Enter  mail address", Toast.LENGTH_SHORT).show();

                }
                else if(add1.getText().toString().isEmpty()){
                    Toast.makeText(checkout.this, "Enter address1 details", Toast.LENGTH_SHORT).show();
                }
                else if(add2.getText().toString().isEmpty()){
                    Toast.makeText(checkout.this, "Enter address2 details", Toast.LENGTH_SHORT).show();
                }
                else if(city.getText().toString().isEmpty()){
                    Toast.makeText(checkout.this, "Enter city details", Toast.LENGTH_SHORT).show();
                }
                else if(country.getText().toString().isEmpty()){
                    Toast.makeText(checkout.this, "Enter country details", Toast.LENGTH_SHORT).show();
                }
                else if(PostalAddress.getText().toString().isEmpty()){
                    Toast.makeText(checkout.this, "Enter PostalAddress details", Toast.LENGTH_SHORT).show();
                }
                else{
                    Intent intent = new Intent(checkout.this, creditcard.class);
                    startActivity(intent);
                }
            }
        });
    }

}
