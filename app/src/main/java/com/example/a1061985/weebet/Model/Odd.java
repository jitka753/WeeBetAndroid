package com.example.a1061985.weebet.Model;

public class Odd {

    private int id;
    private double odd_1;
    private double odd_x;
    private double odd_2;
    private Vendor vendor;

    public Odd(){};

    public Odd(int id, double odd_1, double odd_x, double odd_2, Vendor vendor) {
        this.id = id;
        this.odd_1 = odd_1;
        this.odd_x = odd_x;
        this.odd_2 = odd_2;
        this.vendor = vendor;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getOdd_1() {
        return odd_1;
    }

    public void setOdd_1(double odd_1) {

        this.odd_1 = odd_1;

    }

    public double getOdd_x() {
        return odd_x;
    }

    public void setOdd_x(double odd_x) {
        this.odd_x = odd_x;
    }

    public double getOdd_2() {
        return odd_2;
    }

    public void setOdd_2(double odd_2) {
        this.odd_2 = odd_2;
    }

    public Vendor getVendor() {
        return vendor;
    }

    public void setVendor(Vendor vendor) {
        this.vendor = vendor;
    }
}
