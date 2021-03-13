package com.example.youtubemusicclone.recyclerClasses;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.youtubemusicclone.R;

public class WelcomeViewHolder extends RecyclerView.ViewHolder {

    private ImageView mIvSinger;
    private TextView mTvSingerName;
    private TextView mTvSingerSubs;

    public WelcomeViewHolder(@NonNull View itemView) {
        super(itemView);
        initViews(itemView);
    }

    private void initViews(View itemView) {
        mIvSinger = itemView.findViewById(R.id.ivSinger);
        mTvSingerName = itemView.findViewById(R.id.tvSingerName);
        mTvSingerSubs = itemView.findViewById(R.id.tvSingerSubs);
    }

    public void setData(WelcomeModel welcomeModel) {
        mIvSinger.setImageResource(welcomeModel.getImageTile());
        mTvSingerName.setText(welcomeModel.getTileName()+"");
        mTvSingerSubs.setText(welcomeModel.getSubs()+"");
    }
}
