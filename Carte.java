package utcn;

public class Carte extends Produs{
    private int nrPagini;
    private double pretPerPagina;

    public Carte(int id,String nume,int nrPagini,double pretPerPagina){
        super(id,nume);
        this.nrPagini = nrPagini;
        this.pretPerPagina = pretPerPagina;
    }

    public int getNrPagini() {
        return nrPagini;
    }

    public void setNrPagini(int nrPagini) {
        this.nrPagini = nrPagini;
    }

    public double getPretPerPagina() {
        return pretPerPagina;
    }

    public void setPretPerPagina(double pretPerPagina) {
        this.pretPerPagina = pretPerPagina;
    }

    public double calculeazaPret(){
        return nrPagini*pretPerPagina;
    }


}
