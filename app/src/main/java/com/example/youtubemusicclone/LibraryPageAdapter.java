package com.example.youtubemusicclone;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class LibraryPageAdapter  extends RecyclerView.Adapter<LibraryPageHolder> {
    private ArrayList<Model> models;

    public LibraryPageAdapter(ArrayList<Model> models) {
        this.models = models;
    }

    @NonNull
    @Override
    public LibraryPageHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.library_recent_item,parent,false);
        return new LibraryPageHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull LibraryPageHolder holder, int position) {
        Model model=models.get(position);
        holder.setdata(model);

    }

    @Override
    public int getItemCount() {
        return models.size();
    }
}
