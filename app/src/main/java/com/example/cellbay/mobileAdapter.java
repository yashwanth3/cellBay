package com.example.cellbay;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class mobileAdapter extends RecyclerView.Adapter<mobileAdapter.ImageViewHolder>{

    private  int[] images;
    private  String[] imageName;
    private String[] brand;
    private String[] price;
    private Context context;


    public mobileAdapter(int [] images,String[] imageName,String[] brand,String[] price,Context context){
        this.images=images;
        this.imageName=imageName;
        this.brand=brand;
        this.price=price;
        this.context=context;

    }
    @NonNull
    @Override
    public ImageViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(parent.getContext()).inflate(R.layout.mobile,parent,false);
        ImageViewHolder imageViewHolder=new ImageViewHolder(v,context,images,imageName,brand,price);
        return imageViewHolder;

    }

    @Override
    public void onBindViewHolder(@NonNull ImageViewHolder holder, int  position) {

        int image_id=images[position];
        holder.Mobile.setImageResource(image_id);
        holder.MobileName.setText(imageName[position]);

//        holder.itemView.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent=new Intent(view.getContext(),mobileDetails.class);
//                view.getContext().startActivity(intent);
//            }
//        });

    }

    @Override
    public int getItemCount() {
        return imageName.length;
    }

    public static  class  ImageViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

        ImageView Mobile;
        TextView MobileName;
        Context context;
        int[] images;
        String[] imageName,brand,price;
        Button btnView;

        public ImageViewHolder(@NonNull View itemView,Context context,int[] images,String[] imageName,String[] brand,String[] price) {
            super(itemView);
            Mobile=itemView.findViewById(R.id.imageView);
            MobileName=itemView.findViewById(R.id.txtName);
            btnView=itemView.findViewById(R.id.btnView);
            btnView.setOnClickListener(this);
            this.context=context;
            this.images=images;
            this.imageName=imageName;
            this.brand=brand;
            this.price=price;

        }

        @Override
        public void onClick(View view) {

            Intent intent=new Intent(context,mobileDetails.class);
            intent.putExtra("image_id",images[getAdapterPosition()]);
            intent.putExtra("imageName",imageName[getAdapterPosition()]);
            intent.putExtra("Brand",brand[getAdapterPosition()]);
            intent.putExtra("Price",price[getAdapterPosition()]);

            context.startActivity(intent);

        }
    }

}
