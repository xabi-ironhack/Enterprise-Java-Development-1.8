package com.ironhack.lab_1_8.classes.videoStreamingService;

public class Movie extends Video{

    private String director;

    public Movie(String title, int year, String genre, String producer, String director) {
        super(title, year, genre, producer);
        this.director = director;
    }

    public String getDirector() {return director;}
    public void setDirector(String director) {this.director = director;}

}
