package com.example.a1061985.weebet.Model;

import com.google.gson.annotations.SerializedName;

import java.util.Date;
import java.util.List;

public class Match {

<<<<<<< HEAD
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
=======
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
>>>>>>> b9973e64a3f3a10edba666c5944113bfc549acfa
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
<<<<<<< HEAD
        return ContendentAway;
    }

    public void setContendentAway(Contendent contendentAway) {
        this.ContendentAway = contendentAway;
=======
        return contendentAway;
    }

    public void setContendentAway(Contendent contendentAway) {
        this.contendentAway = contendentAway;
>>>>>>> b9973e64a3f3a10edba666c5944113bfc549acfa
    }

    public Date getTime() {
        return Time;
    }

    public void setTime(Date time) {
        this.Time = time;
    }

    public List<Odds> getOdds() {
<<<<<<< HEAD
        return Odds;
    }

    public void setOdds(List<Odds> odds) {
        this.Odds = odds;
=======
        return odds;
    }

    public void setOdds(List<Odds> odds) {
        this.odds = odds;
>>>>>>> b9973e64a3f3a10edba666c5944113bfc549acfa
    }
}
