package com.q.Struct.Flyweight;

import java.util.HashMap;

public class Factory {

    private HashMap<String, Flyweight> flyweightHashMap = new HashMap<String, Flyweight>();

    public Flyweight getFlyweight(String key) {
        Flyweight flyweight = null;
        if (flyweightHashMap.containsKey(key)) {
            flyweight = flyweightHashMap.get(key);
            System.out.println("Key:" + key + " is exist.");
        } else {
            flyweight = new ConcreteFlyweight(key);
            flyweightHashMap.put(key, flyweight);
        }
        return flyweight;
    }


}
