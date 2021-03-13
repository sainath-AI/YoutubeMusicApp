package com.example.youtubemusicclone.recyclerClasses;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.youtubemusicclone.R;

import java.util.List;

public class WelcomeAdapter extends RecyclerView.Adapter<WelcomeViewHolder> {

    private List<WelcomeModel> welcomeModelList;

    public WelcomeAdapter(List<WelcomeModel> welcomeModelList) {
        this.welcomeModelList = welcomeModelList;
    }

    @NonNull
    @Override
    public WelcomeViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.welcome_item_layout,
                parent, false);
        return new WelcomeViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull WelcomeViewHolder holder, int position) {
        WelcomeModel welcomeModel = welcomeModelList.get(position);
        holder.setData(welcomeModel);
    }

    @Override
    public int getItemCount() {
        return welcomeModelList.size();
    }
}
