import java.util.Scanner;

/**
 * Klasse voor het aanmaken van een offerte voor een klant
 */
abstract class Klant {
    private String naam;
    private String achternaam;
    private String email;
    private Integer telefoonNummer;
    private Schip schip;
    //private Hulpmenu Klanthulpmenu;
    Scanner scanner = new Scanner(System.in);
    Banner banner = new Banner();


    public Klant(String naam, String achternaam, String email, Integer telefoonNummer, Schip schip) {
        this.naam = naam;
        this.achternaam = achternaam;
        this.email = email;
        this.telefoonNummer = telefoonNummer;
        this.schip = schip;
    }

    public String getNaam() {
        return naam;
    }

    public String getAchternaam() {
        return achternaam;
    }

    public String getEmail() {
        return email;
    }

    public Integer getTelefoonNummer() {
        return telefoonNummer;
    }

    public Schip getSchip() {
        return schip;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public void setAchternaam(String achternaam) {
        this.achternaam = achternaam;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTelefoonNummer(Integer telefoonNummer) {
        this.telefoonNummer = telefoonNummer;
    }

    public void setSchip(Schip schip) {
        this.schip = schip;
    }
    abstract String getOverheid();
    abstract void setOverheid(String string);
    abstract String getBedrijfsnaam();
    abstract void setBedrijfsnaam(String string);

}
