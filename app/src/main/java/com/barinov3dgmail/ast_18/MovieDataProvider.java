package com.barinov3dgmail.ast_18;

/**
 * Created by User on 09.06.2017.
 */

public class MovieDataProvider {

    private int movie_poster_resourse;
    private String movie_title;
    private String movie_rating;

    public MovieDataProvider(int movie_poster_resourse, String movie_title, String movie_rating) {
        this.setMovie_poster_resourse(movie_poster_resourse);
        this.setMovie_title(movie_title);
        this.setMovie_rating(movie_rating);
    }


    public int getMovie_poster_resourse() {
        return movie_poster_resourse;
    }

    public void setMovie_poster_resourse(int movie_poster_resourse) {
        this.movie_poster_resourse = movie_poster_resourse;
    }

    public String getMovie_title() {
        return movie_title;
    }

    public void setMovie_title(String movie_title) {
        this.movie_title = movie_title;
    }

    public String getMovie_rating() {
        return movie_rating;
    }

    public void setMovie_rating(String movie_rating) {
        this.movie_rating = movie_rating;
    }
}
