package com.example.youtubemusicclone.recyclerClasses;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.youtubemusicclone.R;

import java.util.List;

public class FavouriteAdapter extends RecyclerView.Adapter<FavouriteViewHolder> {

    private List<FavouriteModel> favModelList;

    public FavouriteAdapter(List<FavouriteModel> favModelList) {
        this.favModelList = favModelList;
    }

    @NonNull
    @Override
    public FavouriteViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.favorites_item_layout,
                parent, false);
        return new FavouriteViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull FavouriteViewHolder holder, int position) {
        FavouriteModel favModel = favModelList.get(position);
        holder.setData(favModel);

    }

    @Override
    public int getItemCount() {
        return favModelList.size();
    }
}
