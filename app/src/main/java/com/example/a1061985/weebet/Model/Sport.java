package com.example.a1061985.weebet.Model;

import java.util.List;

public class Sport {

    private int id;
    private String name;
    private List<Competition> competitions;

    public Sport(){};

    public Sport(List<Competition> competitions, int id, String name) {
        this.competitions = competitions;
        this.id = id;
        this.name = name;
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

    public List<Competition> getCompetitions() {
        return competitions;
    }

    public void setCompetitions(List<Competition> competitions) {
        this.competitions = competitions;
    }
}
