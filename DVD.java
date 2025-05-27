package utcn;

public class DVD extends Produs {
    private int nrMinute;
    private double pretPerMinut;

    public DVD(int id, String nume, int nrMinute, double pretPerMinut) {
        super(id, nume);
        this.nrMinute = nrMinute;
        this.pretPerMinut = pretPerMinut;
    }

    public int getNrMinute() {
        return nrMinute;
    }

    public void setNrMinute(int nrMinute) {
        this.nrMinute = nrMinute;
    }

    public double getPretPerMinut() {
        return pretPerMinut;
    }

    public void setPretPerMinut(double pretPerMinut) {
        this.pretPerMinut = pretPerMinut;
    }

    public double calculeazaPret(){
        return nrMinute * pretPerMinut;
    }
}
