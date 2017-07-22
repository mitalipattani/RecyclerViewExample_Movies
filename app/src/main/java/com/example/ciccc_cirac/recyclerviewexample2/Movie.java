package com.example.ciccc_cirac.recyclerviewexample2;

import java.io.Serializable;

/**
 * Created by CICCC-CIRAC on 2017-07-17.
 */

public class Movie implements Serializable {
    private String title, genre, year;
    private int thumbnail;
    private boolean isSelected; //boolean varaiable for a movie

    public Movie(String title, String genre, String year, int thumbnail) {
        this.title = title;
        this.genre = genre;
        this.year = year;
        this.thumbnail = thumbnail;
        this.isSelected = false;
    }


    public int getThumbnail() {
        return thumbnail;
    }

    public String getTitle() {
        return title;
    }

    public String getYear() {

        return year;
    }

    public String getGenre() {
        return genre;
    }

    public boolean isSelected() {

        return isSelected;
    }

    public void setSelected(boolean selected) {

        isSelected = selected;
    }


}
