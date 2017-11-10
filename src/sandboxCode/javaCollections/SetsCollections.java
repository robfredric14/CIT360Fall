package sandboxCode.javaCollections;
import java.util.*;

/**
 * Created by robfredric
 */
public class SetsCollections {



    public static void main(String args[]) {

        //creating the integer list count and
        int numbers[] = {100, 24, 20, 5, 54, 45, 20, 42, 87, 90, 43, 65, 40};

        //creating the hashset
        //hash table stores the information through hashing, the informational content of a key
        //is used to determine a unique value.
        Set<Integer> set = new HashSet<Integer>();
        try {
            //i is given place for each number, each time the try cycles it goes until 13 numbers are added from the hashset and adds it to set
            for (int i = 0; i < 13; i++) {
                set.add(numbers[i]);
            }
            System.out.println(set);


            // Iterating over the elements in the set
            Iterator combing = set.iterator();
            // conditional loop that says while there is a another number in the set take that and pass it to a string then
            // print and move to next line
            while (combing.hasNext()) {
                // Get element
                Object element = combing.next();
                System.out.println(element.toString());
            }

            //treeset  constructs an empty tree that will be assorted  an ascending order
            //linking the original set we made and calling the first and last number in that sorted list
            TreeSet<Integer> sortedSet = new TreeSet<Integer>(set);
            System.out.println("Sorted list is:" + " " + sortedSet);


            System.out.println("The First number is : " +
                    (Integer) sortedSet.first());


            System.out.println("The last last number is: " +
                    (Integer) sortedSet.last());



        }
        catch(Exception e){
        }



    }
}