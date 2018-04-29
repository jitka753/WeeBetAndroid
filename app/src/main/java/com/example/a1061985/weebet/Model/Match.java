package com.example.a1061985.weebet.Model;

import java.util.Date;
import java.util.List;

public class Match {

    private int id;
    private Contender contenderHome;
    private Contender contenderAway;
    private Date time;
    private List<Odd> odds;

    public Match(){};

    public Match(int id, Contender contenderHome, Contender contenderAway, Date time, List<Odd> odds) {
        this.id = id;
        this.contenderHome = contenderHome;
        this.contenderAway = contenderAway;
        this.time = time;
        this.odds = odds;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Contender getContenderHome() {
        return contenderHome;
    }

    public void setContenderHome(Contender contenderHome) {
        this.contenderHome = contenderHome;
    }

    public Contender getContenderAway() {
        return contenderAway;
    }

    public void setContenderAway(Contender contenderAway) {
        this.contenderAway = contenderAway;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public List<Odd> getOdds() {
        return odds;
    }

    public void setOdds(List<Odd> odds) {
        this.odds = odds;
    }
}
