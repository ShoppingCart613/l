public class Uczen extends Osoba{
    private String klasa;
    private boolean czyzdaje = false;


    public Uczen(String imie, String nazwisko, int PESEL, String klasa) {
        super(imie, nazwisko, PESEL);
        this.klasa = klasa;
    }

    public String getKlasa() {
        return klasa;
    }

    public void setKlasa(String klasa) {
        this.klasa = klasa;
    }

    public boolean isCzyzdaje() {
        return czyzdaje;
    }

    public void setCzyzdaje(boolean czyzdaje) {
        this.czyzdaje = czyzdaje;
    }
}
