package com.example.a1061985.weebet.Model;

import com.google.gson.annotations.SerializedName;

public class Odds {

    private int id;
    private double Odds1;
    private double OddsX;
    private double Odds2;
    @SerializedName(value = "vendor", alternate = {"Vendor"})
    private Vendor vendor;

    public Odds(){};

    public Odds(int id, double odd_1, double odd_x, double odd_2, Vendor vendor) {
        this.id = id;
        this.Odds1 = odd_1;
        this.OddsX = odd_x;
        this.Odds2 = odd_2;
        this.vendor = vendor;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getOdds1() {
        return Odds1;
    }

    public void setOdds1(double odds1) {

        this.Odds1 = odds1;

    }

    public double getOddsX() {
        return OddsX;
    }

    public void setOddsX(double oddsX) {
        this.OddsX = oddsX;
    }

    public double getOdds2() {
        return Odds2;
    }

    public void setOdds2(double odds2) {
        this.Odds2 = odds2;
    }

    public Vendor getVendor() {
        return vendor;
    }

    public void setVendor(Vendor vendor) {
        this.vendor = vendor;
    }
}
