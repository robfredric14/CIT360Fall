package sandboxCode.javaCollections;

import java.util.*;

public class LinkedListCollection {

    public static void main(String[] args) {

        //adding a String of vehicles
        String[] vehicles = {"Cars", "Trucks", "Sedans", "Tanks", "Planes"};

        //creating an empty list1
        List<String> list1 = new LinkedList<String>();

        //populating list1 with vehicles String
        for(String x : vehicles)
            list1.add(x);

        //adding second string of car makes
        String[] VehicleBrand = {"Ford", "Toyota", "Chevy", "GMC", "Kia"};

        //creating an empty list2
        List<String> list2 = new LinkedList<String>();

        //populating list 2 with VehicleBrand
        for(String y : VehicleBrand)
            list2.add(y);

        //linking the contents of list2 to list1
        list1.addAll(list2);

        //emptying the contents of list2
        list2 = null;

        //printing the contents of list1 and list2
        System.out.println("List2 = " + list2);
        System.out.println("List1 = " + list1);



//CHECK OUT THE NEW BOSTONS VERSION OF THIS
    }

}
