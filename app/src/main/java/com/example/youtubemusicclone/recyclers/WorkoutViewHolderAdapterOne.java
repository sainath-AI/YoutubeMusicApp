package com.example.youtubemusicclone.recyclers;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.youtubemusicclone.R;

import java.util.List;

public class WorkoutViewHolderAdapterOne extends RecyclerView.Adapter<WorkoutViewHolderAdapterOne.ItemViewHolder> {

    List<WorkoutModel> workoutModelList;

    public WorkoutViewHolderAdapterOne(List<WorkoutModel> workoutModelList) {
        this.workoutModelList = workoutModelList;
    }

    @NonNull
    @Override
    public WorkoutViewHolderAdapterOne.ItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_workout,parent,false);
        return new WorkoutViewHolderAdapterOne.ItemViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ItemViewHolder holder, int position) {
     WorkoutModel workoutModel = workoutModelList.get(position);
     holder.setData(workoutModel);
    }

    @Override
    public int getItemCount() {
        return workoutModelList.size();
    }

    class  ItemViewHolder extends RecyclerView.ViewHolder {
        private ImageView mIvSongImg;
        private TextView mtvSongName;
        private TextView mTvAuthorName;

        public ItemViewHolder(@NonNull View itemView) {
            super(itemView);
            initview(itemView);
        }

        private void initview(View itemView) {
            mtvSongName=itemView.findViewById(R.id.tvItemName);
            mTvAuthorName=itemView.findViewById(R.id.tvPrice);
            mIvSongImg=itemView.findViewById(R.id.ivImageItemHF);

        }
        public void setData(WorkoutModel workoutModel){
            mIvSongImg.setImageResource(workoutModel.getImage());
            mtvSongName.setText(workoutModel.getSongName());
            mTvAuthorName.setText(workoutModel.getAuthorName());
        }
    }
}
