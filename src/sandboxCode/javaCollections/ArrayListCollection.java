
package sandboxCode.javaCollections;

import java.util.*;


public class ArrayListCollection {

    public static void main(String[] args) {

        ArrayList<String> List1 = new ArrayList<String>();

		  /*Elements added to Array List*/
        List1.add("Mariners");
        List1.add("Twins");
        List1.add("Cubs");
        List1.add("Marlins");
        List1.add("Mets");
        List1.add("Tigers");
        List1.add("Nationals");
        List1.add("Rockies");
        List1.add("Angels");

        //array list
        System.out.println("The remaining teams in the playoffs are the " + List1);

        // add teams to a specific place in the array
        List1.add(0, "Giants");
        List1.add(1, "Rangers");

        System.out.println("Two late wildcard teams were added to make the playoff race between the "
                + List1);

        //remove an item completely from the array
        List1.remove("Mariners");
        List1.remove("Giants");

        System.out.println("Two teams lost making the playoff race between the " + List1);

        //remove a specific index of the array
        //NOTE THIS IS THE INCORRECT WAY TO DO IT SINCE EVERYTIME SOMETHING IS ADDED
        //THE AUTO PLACEMENT OF THE NEXT LIST ENTRY IN THE ARRAY IS 0
        //List1.remove(0);
        //List1.remove(1);
        //List1.remove(3);
        //List1.remove(4);
        //List1.remove(5);
        //List1.remove(6);
        //List1.remove(7);
        //List1.remove(8);


        //Correct way is as such to make the cubs in the (2) index place the winner
        List1.remove(0);
        List1.remove(0);
        List1.remove(1);
        List1.remove(1);
        List1.remove(1);
        List1.remove(1);
        List1.remove(1);
        List1.remove(1);



        System.out.println("The " + List1 + " have won the World Series!");




    }

}
