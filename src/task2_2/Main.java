package task2_2;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Map<Integer, String> map = new LinkedHashMap<>();
        map.put(1, "1");
        map.put(12, "12");
        map.put(123, "123");
        map.put(1234, "1234");
        map.put(12345, "12345");
        map.put(123456, "123456");
        map.put(1234567, "1234567");
        map.put(12345678, "12345678");
        map.put(123456789, "123456789");
        map.put(1234567890, "1234567890");

        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }


    }
}
