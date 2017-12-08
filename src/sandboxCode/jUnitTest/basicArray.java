package sandboxCode.jUnitTest;

import java.util.Arrays;

public class basicArray {

    public String[] addingItems() {

        String[] bag = {"bats", "balls", "shoes"};

        System.out.println("the sports bag has " + Arrays.toString(bag));

        return bag;

    }
}