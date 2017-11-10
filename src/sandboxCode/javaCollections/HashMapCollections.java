package sandboxCode.javaCollections;

import java.util.HashMap;

//importing the static hashmap//hey//
public class HashMapCollections {

    //creating the parameters being string and boolean for hashmap
    //boolean is value and string is the key
    static HashMap<String, Boolean> map = new HashMap<>();
    public static void main(String[] args) {

        //name is key and boolean is value
        //Creating values for the names
        map.put("Kenny", true);
        map.put("Robert", false);

        //true will print since it is the value of Kenny
        //Return the value of the names
        System.out.println(map.get("Kenny"));

        //1000 will not print since Tim is not in the key
        if(map.containsKey("Tim")) System.out.println(1000);

        //500 will print since Robert is in the key
        if(map.containsKey("Robert")) System.out.println(500);

        //2 will print since false is a value of one fo the keys
        if(map.containsValue(Boolean.FALSE)) System.out.println(2);

        //print all values and keys in map
        System.out.println(map);
    }

}
