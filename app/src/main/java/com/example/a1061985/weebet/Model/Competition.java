package com.example.a1061985.weebet.Model;

import java.util.List;

public class Competition {

    private int Id;
    private String Name;
    private Sport Sport;
    private List<Match> Matches;

    public Competition(){};

    public Competition(int id, String name, Sport sport, List<Match> matches) {
        this.Id = id;
        this.Name = name;
        this.Sport = sport;
        this.Matches = matches;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        this.Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        this.Name = name;
    }

    public Sport getSport() {
        return Sport;
    }

    public void setSport(Sport sport) {
        this.Sport = sport;
    }

    public List<Match> getMatches() {
        return Matches;
    }

    public void setMatches(List<Match> matches) {
        this.Matches = matches;
    }
}
