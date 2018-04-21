import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class PrinceTest {

    @Test
    public void testPrinceExtendsArtist(){
        Prince prince = new Prince();
        assertEquals(Artist.class, Prince.class.getSuperclass());
    }

    @Test
    public void testGetPrep(){
        Prince prince = new Prince();
        assertEquals("Must have purp", prince.getPrep());
    }

    @Test
    public void testGreenRoom(){
        Prince prince = new Prince();
        assertEquals("Pancakes", prince.getGreenRoom());
    }

    @Test
    public void testGetVenue(){
        Prince prince = new Prince();
        assertEquals(Venue.STADIUM, prince.getVenue());

    }

    @Test
    public void testGetGenre(){
        Prince prince = new Prince();
        assertEquals(Genre.RNB, prince.getGenre());
    }


}