package com.example.hw_3_4;

public class Country {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    private String capital;
    private String flag;

    public Country(String name, String capital, String flag) {
        this.name = name;
        this.capital = capital;
        this.flag = flag;
    }
}
