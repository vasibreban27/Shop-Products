package utcn;

import java.util.List;

public class ProcesatorComenzi implements Runnable{
    private List<Produs> comenzi;

    public ProcesatorComenzi(List<Produs> comenzi) {
        this.comenzi = comenzi;
    }

    public void run(){
        for(Produs p : comenzi){
            System.out.printf("%s a procesat produsul %s%n",Thread.currentThread().getName(),p.getNume());
            try{
                Thread.sleep(50);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
