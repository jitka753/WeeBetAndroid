package com.example.a1061985.weebet.Model;

import com.google.gson.annotations.SerializedName;

public class Odds {

    @SerializedName(value = "id", alternate = {"Id"})
    protected int id;
    @SerializedName(value = "odds1", alternate = {"Odds1"})
    private double odds1;
    @SerializedName(value = "oddsX", alternate = {"OddsX"})
    private double oddsX;
    @SerializedName(value = "odds2", alternate = {"Odds2"})
    private double odds2;
    @SerializedName(value = "vendor", alternate = {"Vendor"})
    private Vendor vendor;

    public Odds(){};

    public Odds(int id, double odd_1, double odd_x, double odd_2, Vendor vendor) {
        this.id = id;
        this.odds1 = odd_1;
        this.oddsX = odd_x;
        this.odds2 = odd_2;
        this.vendor = vendor;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getOdds1() {
        return odds1;
    }

    public void setOdds1(double odds1) {

        this.odds1 = odds1;

    }

    public double getOddsX() {
        return oddsX;
    }

    public void setOddsX(double oddsX) {
        this.oddsX = oddsX;
    }

    public double getOdds2() {
        return odds2;
    }

    public void setOdds2(double odds2) {
        this.odds2 = odds2;
    }

    public Vendor getVendor() {
        return vendor;
    }

    public void setVendor(Vendor vendor) {
        this.vendor = vendor;
    }
}
