package com.example.a1061985.weebet.Model;

import java.util.List;

public class Competition {

    private int id;
    private String name;
    private Sport sport;
    private List<Match> matches;

    public Competition(){};

    public Competition(int id, String name, Sport sport, List<Match> matches) {
        this.id = id;
        this.name = name;
        this.sport = sport;
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

    public Sport getSport() {
        return sport;
    }

    public void setSport(Sport sport) {
        this.sport = sport;
    }

    public List<Match> getMatches() {
        return matches;
    }

    public void setMatches(List<Match> matches) {
        this.matches = matches;
    }
}
