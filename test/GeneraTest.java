import org.junit.Test;

import static org.junit.Assert.*;

public class GeneraTest {
    @Test
    public void testNumberOfGeneras() {
        assertEquals(8, Genera.values().length); //.values() returns an array
    }
}