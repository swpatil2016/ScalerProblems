package DesignPattern.Prototype;

import java.util.HashMap;
import java.util.Map;

public class Ragistry {
    private Map<String, Student> map = new HashMap<>();

    public void add(String str, Student emp){
        map.put(str, emp);
    }

    public Student get(String str){
        return map.get(str);
    }
}
