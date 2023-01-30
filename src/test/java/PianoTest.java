import instruments.Piano;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PianoTest {
    Piano piano;

    @Before
    public void before(){
        piano = new Piano("keyboard", "wood", "pink", "upright");
    }
    @Test
    public void hasStyle(){
        assertEquals("upright", piano.getStyle());
    }
    @Test
    public void hasColour(){
        assertEquals("pink", piano.getColour());
    }
    @Test
    public void canBePlayed(){
        assertEquals("piano sounds", piano.play());
    }

}
