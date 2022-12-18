package task3;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        Mapp mapp = new Mapp();
        System.out.println(mapp.getMap().size());
        mapp.add("str", 1);
        System.out.println(mapp.getMap().size());
        mapp.add("str2", 2);
        System.out.println(mapp.getMap().size());
        mapp.add("str3", 3);
        System.out.println(mapp.toString());
        System.out.println(mapp.getMap().size());
        mapp.add("str2", 5);
        System.out.println(mapp.toString());
        System.out.println(mapp.getMap().size());
        mapp.add("str2", 5);



    }

}
