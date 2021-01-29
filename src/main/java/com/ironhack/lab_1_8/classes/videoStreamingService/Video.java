package com.ironhack.lab_1_8.classes.videoStreamingService;

public abstract class Video {

    private String title;
    private int year;
    private String genre;
    private String producer;

    public Video(String title, int year, String genre, String producer) {
        this.title = title;
        this.year = year;
        this.genre = genre;
        this.producer = producer;
    }

    public void play() {
        System.out.println("Playing " + getTitle());
    }

    public String getTitle() {return title;}
    public void setTitle(String title) {this.title = title;}
    public int getYear() {return year;}
    public void setYear(int year) {this.year = year;}
    public String getGenre() {return genre;}
    public void setGenre(String genre) {this.genre = genre;}
    public String getProducer() {return producer;}
    public void setProducer(String producer) {this.producer = producer;}
}
