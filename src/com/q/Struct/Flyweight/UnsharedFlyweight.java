package com.q.Struct.Flyweight;

public class UnsharedFlyweight {

    private String info;

    UnsharedFlyweight(String info) {
        this.info = info;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
