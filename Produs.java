package utcn;

public abstract class Produs {
    private int id;
    private String nume;

    public Produs(int id,String nume) {
        this.id = id;
        this.nume = nume;
    }
    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public abstract double calculeazaPret();

    public String toString() {
        return "Produs "  + id + ", nume: " + nume;
    }
}
