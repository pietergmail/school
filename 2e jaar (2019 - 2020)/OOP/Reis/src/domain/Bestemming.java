package domain;
import domain.Bestemming;
import domain.Reis;

public class Bestemming {
    private String naam;
    private String locatie;
    private int capaciteit;

    public String getNaam() {
        return naam;
    }

    private void setNaam(String naam) {
        this.naam = naam;
    }

    public String getLocatie() {
        return locatie;
    }

    private void setLocatie(String locatie) {
        this.locatie = locatie;
    }

    public int getCapaciteit() {
        return capaciteit;
    }

    private void setCapaciteit(int capaciteit) {
        this.capaciteit = capaciteit;
    }

    public Bestemming(String naam, String locatie) {
        this.setNaam(naam);
        this.setLocatie(locatie);
    }

    public Bestemming(String naam, String locatie, int capaciteit) {
        this.setNaam(naam);
        this.setLocatie(locatie);
        this.setCapaciteit(capaciteit);
    }

    public String tostring(){
        return "Reis naar" + this.getLocatie() + "\n";
    }
}
