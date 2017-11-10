package sandboxCode.javaCollections;

import java.util.TreeMap;

public class TreeMapCollections {

    static TreeMap<String, Boolean> map = new TreeMap<>();
    public static void main(String[] args) {

        //Key is name and boolean is value
        //Creating values for the names
        map.put("Kenny", true);
        map.put("Robert", false);
        map.put("Samantha", false);
        map.put("Zorro", true);
        map.put("Aaron", false);
        map.put("Eduardo", false);

        //outputs by key and is ordered by key
        System.out.println(map);








    }

}
