package com.ironhack.lab_1_8.classes.videoStreamingService;

public class TvShow extends Video{

    private int seasons;
    private float score;

    public TvShow(String title, int year, String genre, String producer, int seasons, float score) {
        super(title, year, genre, producer);
        this.seasons = seasons;
        this.score = score;
    }

    public int getSeasons() {return seasons;}
    public void setSeasons(int seasons) {this.seasons = seasons;}
    public float getScore() {return score;}
    public void setScore(float score) {this.score = score;}
}
