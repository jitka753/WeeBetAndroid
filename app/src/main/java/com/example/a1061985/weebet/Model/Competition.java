package com.example.a1061985.weebet.Model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Competition {

    @SerializedName(value = "id", alternate = {"Id"})
    protected int id;
    @SerializedName(value = "name", alternate = {"Name"})
    private String name;
  //  @SerializedName(value = "sport", alternate = {"Sport"})
   // private Sport sport;
    @SerializedName(value = "matches", alternate = {"Matches"})
    private List<Match> matches;

    public Competition(){};

    public Competition(int id, String name, Sport sport, List<Match> matches) {
        this.id = id;
        this.name = name;
       // this.sport = sport;
        this.matches = matches;
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

    /*
    public Sport getSport() {
        return sport;
    }
    */

    /*public void setSport(Sport sport) {
        this.sport = sport;
    }*/

    public List<Match> getMatches() {
        return matches;
    }

    public void setMatches(List<Match> matches) {
        this.matches = matches;
    }

    @Override
    public String toString() {
        return getName();
    }
}
