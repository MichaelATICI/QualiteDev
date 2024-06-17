package michael;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.*;

public class ServiceTest {

    private Service service;

    @BeforeEach
    public void setUp() {
        service = new Service();
    }

    @Test
    public void testPrixMoyenAvecUneVoiture() {
        Voiture porsche = new Voiture("Porsche", 200000.00);
        service.ajouter(porsche);

        double expected = 200000.00;
        assertEquals(expected, service.prixMoyen(), 0.01);
    }

    @Test
    public void testPrixMoyenAvecPlusieursVoitures() {
        Voiture porsche = new Voiture("Porsche", 200000.00);
        Voiture audi = new Voiture("Audi", 250000.00);

        service.ajouter(porsche);
        service.ajouter(audi);

        double expected = (200000.00 + 250000.00) / 2.0;
        assertEquals(expected, service.prixMoyen(), 0.01);
    }


    @Test
    public void testPrixAvecUneVoiture() {
        Voiture porsche = new Voiture("Porsche", 200000.00);
        service.ajouter(porsche);

        int expected = (int) (200000.00 * 2 / 10);
        assertEquals(expected, service.prix());
    }

    @Test
    public void testPrixAvecPlusieursVoitures() {
        Voiture porsche = new Voiture("Porsche", 200000.00);
        Voiture audi = new Voiture("Audi", 250000.00);

        service.ajouter(porsche);
        service.ajouter(audi);

        int expected = (int) (200000.00 * 2 / 10 + 250000.00 * 2 / 10);
        assertEquals(expected, service.prix());
    }

}
