package task3;

import java.util.HashMap;

public class Mapp {

    private HashMap<String, Integer> map = new HashMap<>();

    public HashMap<String, Integer> getMap() {
        return map;
    }

    public void add(String str, Integer integer){
        if (!map.containsKey(str)){
            map.put(str,integer);
        } else if (map.containsKey(str)&& map.get(str)==integer){
            throw new RuntimeException("не тупи, уже есть");
        } else {
            map.put(str,integer);
        }

    }

    @Override
    public String toString() {
        return "Mapp{" +
                "map=" + map +
                '}';
    }
}
