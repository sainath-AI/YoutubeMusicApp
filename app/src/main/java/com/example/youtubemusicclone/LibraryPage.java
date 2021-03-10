package com.example.youtubemusicclone;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ImageView;

import java.util.ArrayList;

public class LibraryPage extends AppCompatActivity {
    private ArrayList<Model>models;
    private RecyclerView recyclerView;
    private ImageView mIvRecentImage;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_library_page);
        recyclerView=findViewById(R.id.recyclerview);
        initview();
        buildData();
        setRecycler();



    }



    private void buildData() {
        models=new ArrayList<>();
        for (int i=0;i<100;i++){
            if (i%3==0){
               models.add(new Model(R.drawable.imagefour));
            }
            else if (i%3==1){
                models.add(new Model(R.drawable.imagetree));

            }else if (i%3==2){
                models.add(new Model(R.drawable.imagetwo));
            }
            else if (i%3==3){
                models.add(new Model(R.drawable.imageone));
            }
        }

    }
    private void setRecycler() {
        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);
        LibraryPageAdapter libraryPageAdapter=new LibraryPageAdapter(models);
        recyclerView.setAdapter(libraryPageAdapter);
    }

    private void initview() {
        mIvRecentImage=findViewById(R.id.ivRecentImage);

    }
}