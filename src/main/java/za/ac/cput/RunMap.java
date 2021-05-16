package za.ac.cput;

import java.util.HashMap;
import java.util.Map;

public class RunMap {
    Map<String, Integer> studentMap = new HashMap<>();


    public Map<String, Integer> addMap(String info) {
        if (studentMap.containsKey(info)){
            studentMap.put(info, studentMap.get(info) + 1);
        }
        return studentMap;
    }

    public void removeMap(String name){
        if(studentMap.containsKey(name)){
            studentMap.remove(name);
        }

    }

    public boolean findMap(String name){
        if(studentMap.containsKey(name)){
            return true;
        }
        else{
            return false;
        }
    }

    public int mapSize(){
        return studentMap.size();
    }

}
