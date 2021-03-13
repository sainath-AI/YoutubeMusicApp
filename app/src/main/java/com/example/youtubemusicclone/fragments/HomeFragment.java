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

import com.example.youtubemusicclone.R;
import com.example.youtubemusicclone.recyclerClasses.FavouriteAdapter;
import com.example.youtubemusicclone.recyclerClasses.FavouriteModel;
import com.example.youtubemusicclone.recyclerClasses.NewReleasesAdapter;
import com.example.youtubemusicclone.recyclerClasses.NewReleasesModel;
import com.example.youtubemusicclone.recyclerClasses.WelcomeAdapter;
import com.example.youtubemusicclone.recyclerClasses.WelcomeModel;

import java.util.ArrayList;
import java.util.List;

public class HomeFragment extends Fragment {

    private RecyclerView mRvFavourites;
    private RecyclerView mRvWelcome;
    private RecyclerView mRvNewReleases;

    private List<WelcomeModel> welcomeModelList = new ArrayList<>();
    private List<NewReleasesModel> newModelList = new ArrayList<>();
    private List<FavouriteModel> favModelList = new ArrayList<>();


    public HomeFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        mRvFavourites = view.findViewById(R.id.rvYourFavourites);
        mRvWelcome = view.findViewById(R.id.rvWelcome);
        mRvNewReleases = view.findViewById(R.id.rvNewReleases);
        setRecyclerData();
        buildRecyclerData();
    }

    private void setRecyclerData() {
        LinearLayoutManager welcomeLayoutManager = new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false);
        mRvWelcome.setLayoutManager(welcomeLayoutManager);
        WelcomeAdapter welcomeAdapter = new WelcomeAdapter(welcomeModelList);
        mRvWelcome.setAdapter(welcomeAdapter);

        LinearLayoutManager newLayoutManager = new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false);
        mRvNewReleases.setLayoutManager(newLayoutManager);
        NewReleasesAdapter newReleasesAdapter = new NewReleasesAdapter(newModelList);
        mRvNewReleases.setAdapter(newReleasesAdapter);

        LinearLayoutManager favLayoutManager = new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false);
        mRvFavourites.setLayoutManager(favLayoutManager);
        FavouriteAdapter favAdapter = new FavouriteAdapter(favModelList);
        mRvFavourites.setAdapter(favAdapter);
    }

    private void buildRecyclerData() {
        welcomeModelList.add(new WelcomeModel(R.drawable.billie_eilish_1, "Billie Eilish", "39.1M subscribers"));
        welcomeModelList.add(new WelcomeModel(R.drawable.shawn_mendes_1, "Shawn Mandes", "27.7M subscribers"));
        welcomeModelList.add(new WelcomeModel(R.drawable.ariana_grande_1, "Ariana Grande", "47.3M subscribers"));
        welcomeModelList.add(new WelcomeModel(R.drawable.arijit, "Arijit Singh", "1.55M subscribers"));
        welcomeModelList.add(new WelcomeModel(R.drawable.imagine_dragnons1, "Imagine Dragons", "24.6M subscribers"));
        welcomeModelList.add(new WelcomeModel(R.drawable.bdadshah, "Badshah", "1.87M subscribers"));
        welcomeModelList.add(new WelcomeModel(R.drawable.dua_lipa_1, "Dua Lipa", "17M subscribers"));
        welcomeModelList.add(new WelcomeModel(R.drawable.drake_1, "Drake", "24.1 subscribers"));
        welcomeModelList.add(new WelcomeModel(R.drawable.ed_sheeran1, "Ed Sheeran", "47M subscribers"));
        welcomeModelList.add(new WelcomeModel(R.drawable.maroon_5_1, "Maroon 5", "33.4M subscribers"));

        newModelList.add(new NewReleasesModel(R.drawable.new_release_1, "Follow You / Cutthroat", "Single •Imagine Dragons"));
        newModelList.add(new NewReleasesModel(R.drawable.new_release_2, "Scary House 2", "Single •Drake"));
        newModelList.add(new NewReleasesModel(R.drawable.new_release_3, "Time To Dance", "EP •Vishal Mishra"));
        newModelList.add(new NewReleasesModel(R.drawable.new_release_4, "Ilomilo", "Single •Billie Eilish"));
        newModelList.add(new NewReleasesModel(R.drawable.new_release_5, "Songs of Love", "Album •AMit Trivedi"));
        newModelList.add(new NewReleasesModel(R.drawable.new_release_6, "PLAYBOY", "Album •Tory Lanez"));

        favModelList.add(new FavouriteModel(R.drawable.ed_sheeran_2, "Ed Sheeran", "47M subscribers"));
        favModelList.add(new FavouriteModel(R.drawable.arijit, "Arijit Singh", "1.55M subscribers"));
        favModelList.add(new FavouriteModel(R.drawable.billie_eilish_2, "Billie Eilish", "39.1M subscribers"));
        favModelList.add(new FavouriteModel(R.drawable.maroon_5_2, "Maroon 5", "33.4M subscribers"));
        favModelList.add(new FavouriteModel(R.drawable.ariana_grande_2, "Ariana Grande", "47.3M subscribers"));
        favModelList.add(new FavouriteModel(R.drawable.shawn_mendes_2, "Shawn Mandes", "27.7M subscribers"));
        favModelList.add(new FavouriteModel(R.drawable.imagine_dragnons2, "Imagine Dragons", "24.6M subscribers"));
        favModelList.add(new FavouriteModel(R.drawable.dua_lipa_2, "Dua Lipa", "17M subscribers"));
        favModelList.add(new FavouriteModel(R.drawable.bdadshah, "Badshah", "1.87M subscribers"));
        favModelList.add(new FavouriteModel(R.drawable.drake_2, "Drake", "24.1 subscribers"));


    }
}