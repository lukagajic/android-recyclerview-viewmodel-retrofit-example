package com.lgajic.retrofitexample.model;

import com.google.gson.annotations.SerializedName;

public class Hero {
    private String name;

    @SerializedName("realname")
    private String realName;
    private String team;

    @SerializedName("firstappearance")
    private String firstAppearance;

    @SerializedName("createdBy")
    private String createdby;
    private String publisher;

    @SerializedName("imageurl")
    private String imageURL;

    @SerializedName("bio")
    private String biography;

    public Hero(String name, String realname, String team, String firstAppearance, String createdby, String publisher, String imageURL, String biography) {
        this.name = name;
        this.realname = realname;
        this.team = team;
        this.firstAppearance = firstAppearance;
        this.createdby = createdby;
        this.publisher = publisher;
        this.imageURL = imageURL;
        this.biography = biography;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public String getFirstAppearance() {
        return firstAppearance;
    }

    public void setFirstAppearance(String firstAppearance) {
        this.firstAppearance = firstAppearance;
    }

    public String getCreatedby() {
        return createdby;
    }

    public void setCreatedby(String createdby) {
        this.createdby = createdby;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }

    public String getBiography() {
        return biography;
    }

    public void setBiography(String biography) {
        this.biography = biography;
    }
}
