import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by mattstep on 10/12/16.
 */
public class SimpleTest {

    public static final int NAP_TIME_SECS = 10;

    @Test
    public void testBasicArithmetic() {
        assertEquals(1+1, 2);
    }

    @Test(expected=RuntimeException.class)
    public void testThrowRuntimeException() {
        throw new RuntimeException("Exceptions are great, and so nice to use to return meaningful information.");
    }

    @Test
    public void testAbsolutelyNothing() throws InterruptedException {
        for(int i = 0; i < NAP_TIME_SECS; i++) {
            System.out.println("Sleeping for a second...");
            Thread.sleep(1000);
        }
        System.out.println("Slept for " + NAP_TIME_SECS + " seconds");
    }
}
