package com.example.youtubemusicclone.recyclers;

public class WorkoutModel {
    private int image;
    private String songName;
    private String AuthorName;

    public WorkoutModel(int image, String songName, String authorName) {
        this.image = image;
        this.songName = songName;
        AuthorName = authorName;
    }

    public int getImage() {
        return image;
    }

    public String getSongName() {
        return songName;
    }

    public String getAuthorName() {
        return AuthorName;
    }
}
