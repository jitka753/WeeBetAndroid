package com.example.a1061985.weebet.Model;

import com.google.gson.annotations.SerializedName;

public class Vendor {
    @SerializedName(value = "id", alternate = {"Id"})
    protected int id;
    @SerializedName(value = "name", alternate = {"Name"})
    private String name;
    @SerializedName(value = "url", alternate = {"Url"})
    private String url;

    public Vendor(){};

    public Vendor(int id, String name, String url) {
        this.id = id;
        this.name = name;
        this.url = url;
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

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
