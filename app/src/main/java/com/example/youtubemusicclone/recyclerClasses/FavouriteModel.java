package com.example.youtubemusicclone.recyclerClasses;

public class FavouriteModel {

    private int imageTile;
    private String tileName;
    private String subs;

    public FavouriteModel(int imageTile, String tileName, String subs) {
        this.imageTile = imageTile;
        this.tileName = tileName;
        this.subs = subs;
    }

    public int getImageTile() {
        return imageTile;
    }

    public String getTileName() {
        return tileName;
    }

    public String getSubs() {
        return subs;
    }
}
