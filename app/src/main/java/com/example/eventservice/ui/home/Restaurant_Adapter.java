package com.example.eventservice.ui.home;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.eventservice.R;

import java.util.ArrayList;

public class Restaurant_Adapter extends RecyclerView.Adapter<Restaurant_Adapter.MainHolder> {
    Context context;
    ArrayList<restaurant> restaurants;

    public Restaurant_Adapter(Context context, ArrayList<restaurant> hotels) {
        this.context = context;
        this.restaurants = hotels;
    }

    @NonNull
    @Override
    public MainHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.restaurant_list, parent, false);
        MainHolder mainHolder = new MainHolder(view);
        return mainHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MainHolder holder, int position) {
        holder.restuarant_name.setText(restaurants.get(position).getName());
        holder.restuarant_images.setImageResource(restaurants.get(position).getPicture());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Context context = v.getContext();
            }
        });
    }

    @Override
    public int getItemCount() {
        return restaurants.size();
    }

    public class MainHolder extends RecyclerView.ViewHolder {
        TextView restuarant_name;
        ImageView restuarant_images;

        public MainHolder(@NonNull View itemView) {
            super(itemView);
            restuarant_name = itemView.findViewById(R.id.name_restaurant);
            restuarant_images = itemView.findViewById(R.id.images_restaurant);
        }
    }
}
