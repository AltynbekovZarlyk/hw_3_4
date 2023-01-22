package com.example.hw_3_4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.hw_3_4.databinding.FragmentContinentBinding;
import com.example.hw_3_4.databinding.ItemContinentBinding;

import java.util.ArrayList;

public class ContinentAdapter extends RecyclerView.Adapter<ContinentVievHolder> {

    private ArrayList<Continent> continentList;
    private OnItemClick onItemClick;

    public ContinentAdapter(ArrayList<Continent> continentList, OnItemClick onItemClick) {
        this.continentList = continentList;
        this.onItemClick = onItemClick;
    }

    @NonNull
    @Override
    public ContinentVievHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ContinentVievHolder(ItemContinentBinding.inflate(LayoutInflater.
                from(parent.getContext()),parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull ContinentVievHolder holder, int position) {
        holder.bind(continentList.get(position));
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onItemClick.ocClick(position);
            }
        });
    }

    @Override
    public int getItemCount() {
        return continentList.size();
    }
}

class ContinentVievHolder extends RecyclerView.ViewHolder {

    private ItemContinentBinding binding;

    public ContinentVievHolder(ItemContinentBinding binding) {
        super(binding.getRoot());
        this.binding = binding;
    }

    public void bind(Continent continent) {
        binding.tvContinent.setText(continent.getName());
    }
}
