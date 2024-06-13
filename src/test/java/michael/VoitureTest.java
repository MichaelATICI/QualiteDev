package michael;

import michael.Voiture;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VoitureTest {
    @Test
    public void testMarque() {
        Voiture porsche = new Voiture("porsche", 200000.00);
        assertEquals(porsche.getMarque(), "porsche");
    }
}