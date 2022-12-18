package task2_1;

import java.awt.*;
import java.util.*;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //создаем МАР с коллекцией значений
        HashMap<String, List<Integer>> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        StringBuilder sB = new StringBuilder("one");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 3; j++) {
                list.add((int) (Math.random() * 1000));
            }
            sB.append(i);
            String str = sB.toString();
            map.put(str, List.copyOf(list));
            list.removeAll(list);
        }



        HashMap<String, Integer> map1 = new HashMap<>();
        int sum = 0;
        List<String> name = new ArrayList<>(List.copyOf(map.keySet()));
        List<List<Integer>> number = new ArrayList<>(Set.copyOf(map.values()));
        List<Integer> numberEnd = new ArrayList<>();
        for (int i = 0; i < number.size(); i++) {
            for (int j = 0; j < number.get(i).size(); j++) {
                sum+=number.get(i).get(j);
            }
            map1.put(name.get(i),sum);
            numberEnd.add(sum);
            sum=0;
        }
        System.out.println(name);
        System.out.println(number);
        System.out.println(numberEnd);
        System.out.println(map1);
    }


}
