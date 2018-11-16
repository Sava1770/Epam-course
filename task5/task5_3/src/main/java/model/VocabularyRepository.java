package model;

import java.util.HashMap;
import java.util.Map;

public class VocabularyRepository {

    private Map<String,String> map = new HashMap<>();

    public Map<String, String> getMap() {
        return map;
    }

    public void addPair(String key, String value){
        map.put(key,value);
    }

    public String getPair(String key){
        return map.get(key);
    }

    public void init(){
        map.put("divide","деление");
        map.put("plus","плюс");
        map.put("multiply","умножение");
        map.put("minus","минус");
    }
}
