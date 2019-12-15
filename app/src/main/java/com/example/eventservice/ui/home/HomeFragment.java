package com.example.eventservice.ui.home;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.eventservice.MainActivity;
import com.example.eventservice.R;

import java.util.ArrayList;

import static androidx.recyclerview.widget.LinearLayoutManager.VERTICAL;

public class HomeFragment extends Fragment {

    RecyclerView restaurant_recyclerView;
    RecyclerView.LayoutManager restaurant_recyclerView_layoutManager;

    Restaurant_Adapter restaurant_adapter;
    ArrayList<restaurant> restaurantArrayList;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_restaurant, container, false);
        restaurantArrayList = new ArrayList<restaurant>();
        uploadtolist();
        restaurant_recyclerView = root.findViewById(R.id.recycler_select_restaurant);
        restaurant_recyclerView.setHasFixedSize(true);
        restaurant_recyclerView_layoutManager = new LinearLayoutManager(this.getContext(), VERTICAL,false);
        restaurant_recyclerView.setLayoutManager(restaurant_recyclerView_layoutManager);
        restaurant_adapter = new Restaurant_Adapter(this.getContext(),restaurantArrayList);
        restaurant_recyclerView.setAdapter(restaurant_adapter);
        return root;
    }
    void uploadtolist(){
        restaurantArrayList.add(new restaurant("CARAVAN",R.drawable.caravan));
        restaurantArrayList.add(new restaurant("JUMANJI",R.drawable.jumanji));
        restaurantArrayList.add(new restaurant("OLMAZOR",R.drawable.olmazor));
        restaurantArrayList.add(new restaurant("SIM-SIM",R.drawable.sim_sim));
        restaurantArrayList.add(new restaurant("SULTAN",R.drawable.sultan));
        restaurantArrayList.add(new restaurant("TRYUFEL",R.drawable.tryufel));
    }
}