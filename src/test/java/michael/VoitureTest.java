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

    @Test
    public void testSetMarque() {
        Voiture voiture = new Voiture("porsche", 200000.00);
        voiture.setMarque("audi");
        assertEquals("audi", voiture.getMarque());
    }

    @Test
    public void testSetPrix() {
        Voiture voiture = new Voiture("porsche", 200000.00);
        voiture.setPrix(250000.00);
        assertEquals(250000.00, voiture.getPrix());
    }

    @Test
    public void testToString() {
        Voiture voiture = new Voiture("porsche", 200000.00);
        String expected = "La Marque est : porsche, son prix est de : 200000.0 €";
        assertEquals(expected, voiture.toString());
    }

    @Test
    public void testGetPrix() {
        Voiture voiture = new Voiture("porsche", 200000.00);
        assertEquals(200000.00, voiture.getPrix());
    }
    @Test
    public void testGetMarque() {
        Voiture porsche = new Voiture("porsche", 200000.00);
        assertEquals("porsche", porsche.getMarque());
    }

    @Test
    public void testVoiture() {
        Voiture voiture = new Voiture("porsche", 200000.00);


        assertEquals("porsche", voiture.getMarque());


        voiture.setMarque("audi");
        assertEquals("audi", voiture.getMarque());


        assertEquals(200000.00, voiture.getPrix());


        voiture.setPrix(250000.00);
        assertEquals(250000.00, voiture.getPrix());


        String expectedToString = "La Marque est : audi, son prix est de : 250000.0 €";
        assertEquals(expectedToString, voiture.toString());
    }
}
