package ru.otus.main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StrangeObject {

    public int type;
    public float range;
    public String message;
    public List<Integer> list;
    public Map<String, Boolean> myMap;

    public StrangeObject(int type, String message, float range){
        this.type = type;
        this.message = message;
        this.range = range;
        this.list = new ArrayList<>();
        this.myMap = new HashMap<>();
    }

    public void addToList(Integer val){
        this.list.add(val);
    }

    public void addToMap(String key, Boolean val){
        this.myMap.put(key, val);
    }

}
