package pl.put.poznan.transformer.model;

/**
 * Klasa do wysłania jsona z odpowiedzią
 * Zwraca po prostu przekształcony text
 */
public class TransformResponse {
    private float wynik;

    // For test compatibility
    private String transformedText;

    public TransformResponse() {
    }

    public TransformResponse(float wynik) {
        this.wynik = wynik;
    }

    // Constructor for test compatibility
    public TransformResponse(String transformedText) {
        this.transformedText = transformedText;
    }

    public float getWynik() {
        return wynik;
    }

    public void setWynik(float wynik) {
        this.wynik = wynik;
    }

    // Getter and setter for test compatibility
    public String getTransformedText() {
        return transformedText;
    }

    public void setTransformedText(String transformedText) {
        this.transformedText = transformedText;
    }

    @Override
    public String toString() {
        return "TransformResponse{" +
                "Wynik='" + Float.toString(wynik) + '\'' +
                ", transformedText='" + transformedText + '\'' +
                '}';
    }
}
