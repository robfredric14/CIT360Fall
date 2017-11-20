package sandboxCode.jUnitTest;

        import org.junit.*;
        import java.util.*;
        import static org.junit.Assert.*;

public class PoundTest {

    @Test
    public void dogTest() throws Exception {
        // Create new Dog objects
        Dog dog1 = new Dog(4, "brown", 10.5, "Husky", "Dogmeat");
        Dog dog2 = new Dog(3, "white", 10.5, "Chiwawa", "Chico");
        Dog dog3 = new Dog(4, "tan", 10.5, "Golden Retriever", "Keeper");

        // Asserts values are correct for dog1
        assertEquals(4, dog1.getLegCount());
        assertEquals("brown", dog1.getColor());
        assertEquals(10.5, dog1.getHeight(),0.5);
        assertEquals("Husky",dog1.getBreed());
        assertEquals("Dogmeat",dog1.getName());

        // Asserts values are correct for dog2
        assertEquals(3, dog2.getLegCount());
        assertEquals("white", dog2.getColor());
        assertEquals(10.5, dog2.getHeight(),0.5);
        assertEquals("Chiwawa",dog2.getBreed());
        assertEquals("Chico",dog2.getName());

        // Asserts values are correct for dog3
        assertEquals(4, dog3.getLegCount());
        assertEquals("tan", dog3.getColor());
        assertEquals(10.5, dog3.getHeight(),0.5);
        assertEquals("Golden Retriever",dog3.getBreed());
        assertEquals("Keeper",dog3.getName());
    }


    @Test
    public void mamTest() throws Exception {

        // Create new Mammal objects
        Mammal mam1 = new Mammal(2,"tan",6.0);
        Mammal mam2 = new Mammal(4,"brown",3.5);
        Mammal mam3 = new Mammal(3,"black",4.0);

        // Asserts values are correct for mam1
        assertEquals(2,mam1.getLegCount());
        assertEquals("tan",mam1.getColor());
        assertEquals(6.0,mam1.getHeight(),0.5);

        // Asserts values are correct for mam2
        assertEquals(4,mam2.getLegCount());
        assertEquals("brown",mam2.getColor());
        assertEquals(3.5,mam2.getHeight(),0.5);

        // Asserts values are correct for mam3
        assertEquals(3,mam3.getLegCount());
        assertEquals("black",mam3.getColor());
        assertEquals(4.0,mam3.getHeight(),0.5);

    }


    @Test
    public void mammalSetTest() {
        // Create new Mammal objects
        Mammal mam1 = new Mammal(3,"black",2.7);
        Mammal mam2 = new Mammal(4,"orange",12.0);
        Mammal mam3 = new Mammal(6,"purple",5.5);
        // Create a HashSet
        Set<Mammal> mammalHashSet = new HashSet<>();
        // Add new mammal objects to the Set
        mammalHashSet.add(mam1);
        mammalHashSet.add(mam2);
        mammalHashSet.add(mam3);
        // Assert that the correct objects are in the set
        assertTrue(mammalHashSet.contains(mam1));
        assertTrue(mammalHashSet.contains(mam2));
        assertTrue(mammalHashSet.contains(mam3));
        // Remove 2 objects from the HashSet
        mammalHashSet.remove(mam2);
        mammalHashSet.remove(mam3);
        // Assert the proper objects are or aren't in the set
        assertFalse(mammalHashSet.contains(mam2));
        assertFalse(mammalHashSet.contains(mam3));
        assertTrue(mammalHashSet.contains(mam1));

    }

    @Test
    public void dogMapTest() {

        // Create new Dog objects
        Dog dog1 = new Dog(4, "black", 7.5, "Doberman Pinscher", "Charlie");
        Dog dog2 = new Dog(3, "grey", 8.5, "Bulldog", "Spike");
        Dog dog3 = new Dog(2, "white", 9.5, "Poodle", "Fritz");

        // Create Map that can find Dog objects by name
        Map<String, Dog> dogMap = new HashMap<>();
        dogMap.put("Charlie",dog1);
        dogMap.put("Spike",dog2);
        dogMap.put("Fritz",dog3);

        // Assert that the correct Dog objects are in the dogMap
        assertTrue(dogMap.containsKey("Charlie"));
        assertTrue(dogMap.containsKey("Spike"));
        assertTrue(dogMap.containsKey("Fritz"));

        // Remove dog1 and dog2 from the dogMap
        dogMap.remove("Charlie",dog1);
        dogMap.remove("Spike",dog2);
        // Assert that correct Dog obects are or aren't in the dogMap
        assertFalse(dogMap.containsKey("Charlie"));
        assertFalse(dogMap.containsKey("Spike"));
        assertTrue(dogMap.containsKey("Fritz"));
    }

}