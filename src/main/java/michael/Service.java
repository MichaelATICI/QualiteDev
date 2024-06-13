package michael;

import java.util.ArrayList;

public class Service implements Statistique {

    public ArrayList<Voiture> tab = new ArrayList<>();

    @Override
    public void ajouter(Voiture voiture) {
        tab.add(voiture);
    }

    public int prix() throws ArithmeticException {

        int[] prixTableau = new int[tab.size()];


        for (int i = 0; i < tab.size(); i++) {

            double promo = tab.get(i).getPrix() * 2 / 10;

            prixTableau[i] = (int) promo;
        }


        int totalPrix = 0;
        for (int prix : prixTableau) {
            totalPrix += prix;
        }

        return totalPrix;
    }

    public double prixMoyen() {
        if (tab.isEmpty()) {
            throw new ArithmeticException("La liste des voitures est vide.");
        }

        int totalPrix = 0;
        for (Voiture voiture : tab) {
            totalPrix += voiture.getPrix();
        }

        return (double) totalPrix / tab.size();
    }
}