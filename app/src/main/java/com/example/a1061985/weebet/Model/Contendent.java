package com.example.a1061985.weebet.Model;

import com.google.gson.annotations.SerializedName;

public class Contendent {

    @SerializedName(value = "id", alternate = {"Id"})
    protected int id;
    @SerializedName(value = "name", alternate = {"Name"})
    private String name;
    @SerializedName(value = "country", alternate = {"Country"})
    private String country;


    public Contendent(){};

    public Contendent(int id, String name, String country) {
        this.id = id;
        this.name = name;
        this.country = country;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
