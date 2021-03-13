package com.example.youtubemusicclone.recyclerClasses;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.youtubemusicclone.R;

public class NewReleasesViewHolder extends RecyclerView.ViewHolder {

    private ImageView mIvSinger;
    private TextView mTvSingerName;
    private TextView mTvSingerSubs;

    public NewReleasesViewHolder(@NonNull View itemView) {
        super(itemView);
        initViews(itemView);
    }

    private void initViews(View itemView) {
        mIvSinger = itemView.findViewById(R.id.ivSinger);
        mTvSingerName = itemView.findViewById(R.id.tvSingerName);
        mTvSingerSubs = itemView.findViewById(R.id.tvSingerSubs);
    }

    public void setData(NewReleasesModel newModel) {
        mIvSinger.setImageResource(newModel.getImageTile());
        mTvSingerName.setText(newModel.getTileName()+"");
        mTvSingerSubs.setText(newModel.getSubs()+"");
    }

}
