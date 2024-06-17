package michael;

public class ServiceTest {

    public static void main(String[] args) {
        ServiceTest test = new ServiceTest();

        test.testAjouter();
        test.testPrix();
        test.testPrixEmptyList();
    }

    public void testAjouter() {
        Service service = new Service();
        Voiture ferrari = new Voiture("ferrari",100000.00); // Prix de 100000 pour ferrair
        Voiture fiat = new Voiture("fiat",200000.00); // Prix de 200000 pour fiat

        service.ajouter(ferrari);
        service.ajouter(fiat);

        assertEqual(2, service.tab.size(), "testAjouter: Taille de la liste incorrecte");
        assertEqual(ferrari, service.tab.get(0), "testAjouter: ferrari incorrecte");
        assertEqual(fiat, service.tab.get(1), "testAjouter: fiat incorrecte");

        System.out.println("testAjouter ok");
    }

    public void testPrix() {
        Service service = new Service();
        Voiture ferrari = new Voiture("ferrari",100000.00); // Prix de 10000 pour voiture1
        Voiture fiat = new Voiture("fiat",200000.00); // Prix de 20000 pour voiture2

        service.ajouter(ferrari);
        service.ajouter(fiat);

        int expectedTotalPrix = (int) ((100000 * 2 / 10) + (200000 * 2 / 10));
        assertEqual(expectedTotalPrix, service.prix(), "testPrix: Prix total incorrect");

        System.out.println("testPrix ok");
    }

    public void testPrixEmptyList() {
        Service service = new Service();
        try {
            service.prix();
            System.out.println("testPrixEmptyList failed: Exception attendue");
        } catch (ArithmeticException e) {
            System.out.println("testPrixEmptyList ok");
        }
    }

    private void assertEqual(int expected, int actual, String message) {
        if (expected != actual) {
            throw new AssertionError(message + ". Expected: " + expected + ", but was: " + actual);
        }
    }

    private void assertEqual(Object expected, Object actual, String message) {
        if (!expected.equals(actual)) {
            throw new AssertionError(message + ". Expected: " + expected + ", but was: " + actual);
        }
    }
}