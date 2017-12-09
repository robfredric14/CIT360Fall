package sandboxCode.jUnitTest;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.junit.Test;


// Class called Addition
public class jUnitBasic {

    String Test1 = "Sammy Sosa";
    String Test2 = "Sammy Sosa";
    String Test3 = "Ricky Bobby";
    String Test4 = null;



    //array for array equals
    basicArray sportsBag = new basicArray();

    String[] bag = {"bats", "balls", "shoes"};


    @Test
    public void assertSame1() {
        assertSame(Test1, Test2);
    }

    @Test
    public void assertNotSame1() {
        assertNotSame(Test2, Test3);
    }

    @Test
    public void assertNotNull1() {
        assertNotNull(Test1);
    }

    @Test
    public void assertNull1() {
        assertNull(Test4);
    }

    //core matchers needed for is equalto
    @Test
    public void assertThat1() {
        assertThat(Test1, is(equalTo(Test2)));

    }

    @Test
    public void assertArrayEquals1() {

        assertArrayEquals(bag, sportsBag.addingItems());
    }





}
