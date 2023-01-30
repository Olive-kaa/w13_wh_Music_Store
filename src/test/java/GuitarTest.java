import instruments.Guitar;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {
    Guitar guitar;

    @Before
    public void before(){
        guitar = new Guitar("string", "wood", "red", 6);
    }

    @Test
    public void hasNumberOfStrings(){
        assertEquals(6, guitar.getNumberOfStrings());
    }

    @Test
    public void hasMaterial(){
        assertEquals("wood", guitar.getMaterial());
    }
    @Test
    public void canBePlayed(){
        assertEquals("guitar sounds", guitar.play());
    }

}
