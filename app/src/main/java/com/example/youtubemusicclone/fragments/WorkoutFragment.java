package com.example.youtubemusicclone.fragments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.youtubemusicclone.GetLists.GetsLists;
import com.example.youtubemusicclone.R;
import com.example.youtubemusicclone.recyclers.WorkoutModel;
import com.example.youtubemusicclone.recyclers.WorkoutViewHolderAdapterOne;
import com.example.youtubemusicclone.recyclers.WorkoutViewHolderAdapterThree;
import com.example.youtubemusicclone.recyclers.WorkoutViewHolderAdapterTwo;
import com.example.youtubemusicclone.recyclers.WorkoutViewHolderAdapterfour;

import java.util.List;


public class WorkoutFragment extends Fragment  {

    private RecyclerView mRecyclerView1;
    private RecyclerView mRecyclerView2;
    private RecyclerView mRecyclerView3;
    private RecyclerView mRecyclerView4;

    public WorkoutFragment(){

    }




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_workout, container, false);
    }


    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initview(view);
        buildRecyclerViewData_1();
        buildRecyclerViewData_2();
        buildRecyclerViewData_3();
        buildRecyclerViewData_4();

    }

    private void buildRecyclerViewData_4() {
        List<WorkoutModel> workoutModelList4= GetsLists.getWorkoutItemList4();
        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(getContext(),LinearLayoutManager.HORIZONTAL,false);
        mRecyclerView4.setLayoutManager(linearLayoutManager);
        WorkoutViewHolderAdapterfour workoutViewHolderAdapterfour= new WorkoutViewHolderAdapterfour(workoutModelList4);
        mRecyclerView4.setAdapter(workoutViewHolderAdapterfour);
    }

    private void buildRecyclerViewData_3() {
        List<WorkoutModel> workoutModelList3= GetsLists.getWorkoutItemList3();
        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(getContext(),LinearLayoutManager.HORIZONTAL,false);
        mRecyclerView3.setLayoutManager(linearLayoutManager);
        WorkoutViewHolderAdapterThree workoutViewHolderAdapterThree= new WorkoutViewHolderAdapterThree(workoutModelList3);
        mRecyclerView3.setAdapter(workoutViewHolderAdapterThree);
    }

    private void buildRecyclerViewData_2() {
        List<WorkoutModel> workoutModelList2= GetsLists.getWorkoutItemList2();
        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(getContext(),LinearLayoutManager.HORIZONTAL,false);
        mRecyclerView2.setLayoutManager(linearLayoutManager);
        WorkoutViewHolderAdapterTwo workoutViewHolderAdapterTwo= new WorkoutViewHolderAdapterTwo(workoutModelList2);
        mRecyclerView2.setAdapter(workoutViewHolderAdapterTwo);
    }

    private void buildRecyclerViewData_1() {
        List<WorkoutModel> workoutModelList1= GetsLists.getWorkoutItemList1();
        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(getContext(),LinearLayoutManager.HORIZONTAL,false);
        mRecyclerView1.setLayoutManager(linearLayoutManager);
        WorkoutViewHolderAdapterOne workoutViewHolderAdapterOne= new WorkoutViewHolderAdapterOne(workoutModelList1);
         mRecyclerView1.setAdapter(workoutViewHolderAdapterOne);
    }

    private void initview(View view) {
        mRecyclerView1 = view.findViewById(R.id.recyclerView_1);
        mRecyclerView2 = view.findViewById(R.id.recyclerView_2);
        mRecyclerView3 = view.findViewById(R.id.recyclerView_3);
        mRecyclerView4 = view.findViewById(R.id.recyclerView_4);
    }


}