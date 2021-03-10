package com.example.youtubemusicclone;

import android.view.View;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class LibraryPageHolder extends RecyclerView.ViewHolder {
    private ImageView mImage;
    public LibraryPageHolder(@NonNull View itemView) {
        super(itemView);
        initCiew(itemView);
    }

    private void initCiew(View itemView) {
        mImage=itemView.findViewById(R.id.ivRecentImage);

    }

    public void setdata(Model model) {
        mImage.setImageResource(model.getImage());

    }
}
