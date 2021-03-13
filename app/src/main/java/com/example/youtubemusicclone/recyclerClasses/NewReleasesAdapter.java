package com.example.youtubemusicclone.recyclerClasses;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.youtubemusicclone.R;

import java.util.List;

public class NewReleasesAdapter extends RecyclerView.Adapter<NewReleasesViewHolder> {

    private List<NewReleasesModel> newModelList;

    public NewReleasesAdapter(List<NewReleasesModel> newModelList) {
        this.newModelList = newModelList;
    }

    @NonNull
    @Override
    public NewReleasesViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.new_release_item_layout,
                parent, false);
        return new NewReleasesViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull NewReleasesViewHolder holder, int position) {
        NewReleasesModel newModel = newModelList.get(position);
        holder.setData(newModel);

    }

    @Override
    public int getItemCount() {
        return newModelList.size();
    }
}
