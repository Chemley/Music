import org.junit.Test;

import static org.junit.Assert.*;

public class PrinceTest {

    @Test
    public void testPrinceExtendsArtist(){
        Prince prince = new Prince();
        assertEquals(Artist.class, Prince.class.getSuperclass());
    }

}