package michael;

public class Voiture {
    private String marque;
    private Double prix;

    public Voiture(String marque, Double prix) {
        this.marque = marque;
        this.prix = prix;
    }
    public String getMarque() {
        return marque;
    }
    public Double getPrix() {
        return prix;
    }
    public void setMarque(String marque) {
        this.marque = marque;
    }
    public void setPrix(Double prix) {
        this.prix = prix;
    }
    public String toString() {
        marque = getMarque();
        prix = getPrix();
        return("La Marque est : " + marque + ", son prix est de : " + prix + " €");
    }
}