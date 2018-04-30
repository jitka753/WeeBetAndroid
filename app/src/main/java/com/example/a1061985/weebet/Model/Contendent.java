package com.example.a1061985.weebet.Model;

public class Contendent {

    private int Id;
    private String Name;
    private String Country;


    public Contendent(){};

    public Contendent(int id, String name, String country) {
        this.Id = id;
        this.Name = name;
        this.Country = country;
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

    public String getCountry() {
        return Country;
    }

    public void setCountry(String country) {
        this.Country = country;
    }
}
