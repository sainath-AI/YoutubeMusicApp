package com.example.youtubemusicclone;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private FragmentManager fragmentManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fragmentManager =getSupportFragmentManager();
        launchUpgradeFrag();
    }

    private void launchUpgradeFrag() {
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        UpgradeFragment fragment = new UpgradeFragment();
        transaction.add(R.id.flContainer, fragment,"upgradeFrag").commit();
    }
}