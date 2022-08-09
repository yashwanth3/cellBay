package com.example.cellbay;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class mobileList extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager layoutManager;
    private int[] images = {R.drawable.cell1, R.drawable.cell6, R.drawable.cell7, R.drawable.cell3, R.drawable.cell8};
    private String[] imageName = {"iPhone", "Samsung", "Moto G", "Asus", "Sony"};
    private String[] brand={"SE","Galaxy","Power","Zenfone","Xperia"};
    private  String[] price={"$ 399.99","$ 250.45","$ 540","$ 400.99","$ 1300"};


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mobile_list);

        recyclerView = findViewById(R.id.rView);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        mAdapter = new mobileAdapter(images, imageName,brand,price,this);
        recyclerView.setAdapter(mAdapter);

    }


}
