package com.example.a1061985.weebet.Model;

import com.google.gson.annotations.SerializedName;

import java.util.Date;
import java.util.List;

public class Match {

    @SerializedName(value = "id", alternate = {"Id"})
    protected int id;
    @SerializedName(value = "contendentHome", alternate = {"ContendentHome"})
    private Contendent contendentHome;
    @SerializedName(value = "contendentAway", alternate = {"ContendentAway"})
    private Contendent contendentAway;
    @SerializedName(value = "time", alternate = {"Time"})
    private Date time;
    @SerializedName(value = "odds", alternate = {"Odds"})
    private List<Odds> odds;

    public Match(){};

    public Match(int id, Contendent contendentHome, Contendent contendentAway, Date time, List<Odds> odds) {
        this.id = id;
        this.contendentHome = contendentHome;
        this.contendentAway = contendentAway;
        this.time = time;
        this.odds = odds;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Contendent getContendentHome() {
        return contendentHome;
    }

    public void setContendentHome(Contendent contendentHome) {
        this.contendentHome = contendentHome;
    }

    public Contendent getContendentAway() {
        return contendentAway;
    }

    public void setContendentAway(Contendent contendentAway) {
        this.contendentAway = contendentAway;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public List<Odds> getOdds() {
        return odds;
    }

    public void setOdds(List<Odds> odds) {
        this.odds = odds;
    }
}
