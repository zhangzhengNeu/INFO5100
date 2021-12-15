package zheng;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Movie {
    private String title;
    private Date date;
    private List<String> actors;
    private String director;

    public Movie(String title, Date date, List<String> actors, String director) {
        this.title = title;
        this.date = date;
        this.actors = actors;
        this.director = director;
    }

//    Write a method which that will add release year in the title of the movie and return the title and
//    then use this method for all the movies.

    public String addReleaseYear (){
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String dateString = formatter.format(this.date);
        String s = dateString.substring(0,4);
        this.title = this.title + s;
        return this.title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public List<String> getActors() {
        return actors;
    }

    public void setActors(List<String> actors) {
        this.actors = actors;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }


}
