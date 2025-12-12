package HashMaps;

import java.util.HashMap;

public class MapBasics {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Raghav", 76);
        map.put("Himanshu", 83);
        map.put("Harsh", 21);
        map.put("Ayushi", 82);
        System.out.println(map);
        System.out.print(map.containsKey("Gagan"));
    }
}
