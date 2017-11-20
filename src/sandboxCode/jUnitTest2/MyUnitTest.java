package sandboxCode.jUnitTest2;


import org.junit.Test;
        import static org.junit.Assert.*;


        ////Super Basic Example for Testing////

public class MyUnitTest {

    @Test
    public void testConcatenate() {
        MyUnit myUnit = new MyUnit();

        String result = myUnit.concatenate("one", "two");

        assertEquals("onetwo", result);

    }
}