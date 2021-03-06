package me.andrewbruce.assessment3;


import java.util.Date;

public class Comment {
    // private attributes
    private String username;
    private String comment;
    private String date;
    private int attractionId;
    private int rating;

    // overloaded constructor
    public Comment(int attractionId, String username, String comment, int rating, String date) {
        this.username = username;
        this.comment = comment;
        this.attractionId = attractionId;
        this.rating = rating;
        this.date = date;
    }

    // default constructor
    public Comment() {
        username = "";
        comment = "";
        attractionId = 0;
        rating = 0;
        date = "";
    }

    // public setters
    public void setUsername(String username) {
        this.username = username;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setAttractionId(int attractionId) {
        this.attractionId = attractionId;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    // public getters
    public String getUsername() {
        return username;
    }

    public String getComment() {
        return comment;
    }

    public String getDate() {return date;}

    public int getAttractionId(){return attractionId;}

    public int getRating(){return rating;}


}
