public class Komputer {
    private int numer;
    private boolean czydziala;

    public Komputer(int numer, boolean czydziala) {
        this.numer = numer;
        this.czydziala = czydziala;
    }

    public int getNumer() {
        return numer;
    }

    public void setNumer(int numer) {
        this.numer = numer;
    }

    public boolean isCzydziala() {
        return czydziala;
    }

    public void setCzydziala(boolean czydziala) {
        this.czydziala = czydziala;
    }
}
