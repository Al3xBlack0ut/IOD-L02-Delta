package pl.put.poznan.transformer.model;

/**
 * Klasa do wysłania jsona z odpowiedzią
 * Zwraca po prostu przekształcony text
 */
public class TransformResponse {
    private float wynik;

    public TransformResponse() {
    }

    public TransformResponse(float wynik) {
        this.wynik = wynik;
    }

    public float getWynik() {
        return wynik;
    }

    public void setWynik(float wynik) {
        this.wynik = wynik;
    }

    @Override
    public String toString() {
        return "TransformResponse{" +
                "Wynik='" + Float.toString(wynik) + '\'' +
                '}';
    }
}
