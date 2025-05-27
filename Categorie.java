package utcn;

public class Categorie {

    private String denumire;

    public Categorie(String denumire) {
        this.denumire = denumire;
    }

    public String getDenumire() {
        return denumire;
    }
    public void setDenumire(String denumire) {
        this.denumire = denumire;
    }

    public boolean equals(Object o) {
        if(this == o) return true;
        if(!(o instanceof Categorie)) return false;
        Categorie cat = (Categorie) o;
        return denumire.equals(cat.denumire);
    }

    public int hashCode() {
        return denumire.hashCode();
    }
}
