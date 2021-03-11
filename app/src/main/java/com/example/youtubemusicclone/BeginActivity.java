package com.example.youtubemusicclone;

import androidx.appcompat.app.AppCompatActivity;



import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ImageView;

public class BeginActivity extends AppCompatActivity {
    private ImageView mIvLogo;
    private Handler handler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_begin);
        handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(BeginActivity.this,Login.class);
                startActivity(intent);
                finish();
            }

        }, 2000);
    }
}
