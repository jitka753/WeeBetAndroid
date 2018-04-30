package com.example.a1061985.weebet.Model;

import com.google.gson.annotations.SerializedName;

import java.util.Date;
import java.util.List;

public class Match {

    private int Id;
    @SerializedName(value = "contendentHome", alternate = {"ContendentHome"})
    private Contendent contendentHome;
    private Contendent ContendentAway;
    private Date Time;
    private List<Odds> Odds;

    public Match(){};

    public Match(int id, Contendent contenderHome, Contendent contenderAway, Date time, List<Odds> odds) {
        this.Id = id;
        this.contendentHome = contenderHome;
        this.ContendentAway = contenderAway;
        this.Time = time;
        this.Odds = odds;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        this.Id = id;
    }

    public Contendent getContendentHome() {
        return contendentHome;
    }

    public void setContendentHome(Contendent contendentHome) {
        this.contendentHome = contendentHome;
    }

    public Contendent getContendentAway() {
        return ContendentAway;
    }

    public void setContendentAway(Contendent contendentAway) {
        this.ContendentAway = contendentAway;
    }

    public Date getTime() {
        return Time;
    }

    public void setTime(Date time) {
        this.Time = time;
    }

    public List<Odds> getOdds() {
        return Odds;
    }

    public void setOdds(List<Odds> odds) {
        this.Odds = odds;
    }
}
