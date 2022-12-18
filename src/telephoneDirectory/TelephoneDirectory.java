package telephoneDirectory;

import java.util.HashMap;
import java.util.Objects;

public class TelephoneDirectory {

    private HashMap<String,String> map=new HashMap<>();

    public HashMap<String, String> getMap() {
        return map;
    }

    public TelephoneDirectory() {
    }

    @Override
    public String toString() {
        return "Справочник \n" + map +
                "\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TelephoneDirectory that = (TelephoneDirectory) o;
        return Objects.equals(map, that.map);
    }

    @Override
    public int hashCode() {
        return Objects.hash(map);
    }
}
