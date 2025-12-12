package HashMaps;

import java.util.HashMap;

public class iterateMaps {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Raghav", 76);
        map.put("Himanshu", 83);
        map.put("Harsh", 21);
        map.put("Ayushi", 82);
        map.put("Prachi", 88);
        System.out.println(map);
//        for(String ele : map.keySet()){
//            System.out.println(ele);
//        }
//        {Raghav=76, Prachi=88, Himanshu=83, Harsh=21, Ayushi=82}
//        Raghav
//        Prachi
//        Himanshu
//        Harsh
//        Ayushi
        // but this isn't a good idea to write ele

//        so we write key instead of ele

        for(String key : map.keySet()){
            int val = map.get(key);
            System.out.println(key + " " + val);
        }
        System.out.println();
        for(int val : map.values()){
            System.out.println(val);
        }
        System.out.println();
        // Use of entrySet()
        for(Object pair : map.entrySet()){
            System.out.println(pair);
        }
    }
}
