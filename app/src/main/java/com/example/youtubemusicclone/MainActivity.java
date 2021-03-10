package com.example.youtubemusicclone;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.youtubemusicclone.fragments.CommuteFragment;
import com.example.youtubemusicclone.fragments.ExploreFragment;
import com.example.youtubemusicclone.fragments.FocusFragment;
import com.example.youtubemusicclone.fragments.HomeFragment;
import com.example.youtubemusicclone.fragments.LibraryFragment;
import com.example.youtubemusicclone.fragments.RelaxFragment;
import com.example.youtubemusicclone.fragments.UpgradeFragment;
import com.example.youtubemusicclone.fragments.WorkoutFragment;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private  ImageView mUvSearch;
    private ImageView mIvHome;
    private ImageView mIvExplore;
    private ImageView  mIvLibrary;
    private ImageView mIvUpgrade;
    private TextView  mTvWorkout;
    private TextView mTvFocus;
    private TextView mTvRelax;
    private TextView mTvCommute;
    FragmentManager fragmentManager;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        HomeFragment homeFragment= new HomeFragment();
        LaunchFragments(homeFragment,"HomeFragment");

    }

    private void LaunchFragments(Fragment fragment,String tag) {

        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.flContainer,fragment,tag).addToBackStack(tag).commit();

    }

    private void initView() {
        mUvSearch=findViewById(R.id.ivSearch);
        mIvHome=findViewById(R.id.ivHome);
        mIvExplore=findViewById(R.id.ivExplore);
        mIvLibrary=findViewById(R.id.ivLibrary);
        mIvUpgrade=findViewById(R.id.ivUpgrade);
        mTvWorkout=findViewById(R.id.tvWorkout);
        mTvFocus=findViewById(R.id.tvFocus);
        mTvRelax=findViewById(R.id.tvRelax);
        mTvCommute=findViewById(R.id.tvCommute);
        fragmentManager=getSupportFragmentManager();
        mUvSearch.setOnClickListener(this);
        mIvHome.setOnClickListener(this);
        mIvExplore.setOnClickListener(this);
        mIvLibrary.setOnClickListener(this);
        mIvUpgrade.setOnClickListener(this);
        mTvWorkout.setOnClickListener(this);
        mTvFocus.setOnClickListener(this);
        mTvRelax.setOnClickListener(this);
        mTvCommute.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.ivSearch:

            case R.id.ivHome:
                HomeFragment homeFragment = new HomeFragment();
                LaunchFragments(homeFragment,"HomeFragment");
                break;
            case R.id.ivExplore:
                ExploreFragment exploreFragment = new ExploreFragment();
                LaunchFragments(exploreFragment,"ExploreFragment");
                break;
            case R.id.ivLibrary:
                LibraryFragment libraryFragment = new LibraryFragment();
                LaunchFragments(libraryFragment,"LibraryFragment");
                break;
            case R.id.ivUpgrade:
                UpgradeFragment upgradeFragment = new UpgradeFragment();
                LaunchFragments(upgradeFragment,"UpgradeFragment");
                break;
            case R.id.tvWorkout:
                WorkoutFragment workoutFragment= new WorkoutFragment();
                LaunchFragments(workoutFragment,"WorkoutFragment");
                break;
            case R.id.tvFocus:
                FocusFragment focusFragment= new FocusFragment();
                LaunchFragments(focusFragment,"FocusFragment");
                break;
            case R.id.tvRelax:
                RelaxFragment relaxFragment= new RelaxFragment();
                LaunchFragments(relaxFragment,"RelaxFragment");
                break;
            case R.id.tvCommute:
             CommuteFragment commuteFragment= new CommuteFragment();
                LaunchFragments(commuteFragment,"CommuteFragment");
                break;


        }
    }
}