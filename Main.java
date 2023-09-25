import java.lang.reflect.Array;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        MapComparator comparator = new MapComparator();
        TreeMap<Integer,String> map = new TreeMap<>(comparator);
        map.put(2,"Adnan");
        map.put(50,"Peter");
        map.put(1,"Zack");
        map.put(5,"Sam");

        List<Map.Entry<Integer,String>> list = new ArrayList<>(map.entrySet());
        System.out.println(list);
        Collections.sort(list, new Comparator<Map.Entry<Integer, String>>() {
            @Override
            public int compare(Map.Entry<Integer, String> o1, Map.Entry<Integer, String> o2) {
                return o1.getValue().compareTo(o2.getValue());
            }
        });
        System.out.println(list);
        System.out.println(map);

//        String st1 = "ad";
//        String st2 = "ad";
//        System.out.println(st1.compareTo(st2));

    }
}
