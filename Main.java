package utcn;


import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Categorie electronice = new Categorie("Electronice");
        Magazin magazin = new Magazin();


        Carte c1 = new Carte(1,"Java pentru incepatori", 300, 0.5);
        Carte c2 = new Carte(2,"Algoritmi avansati",    500, 1.2);
        DVD   d1 = new DVD(3,"Tutorial Java Streams",  120, 0.8);
        magazin.adaugaProdus(electronice, c1);
        magazin.adaugaProdus(electronice, c2);
        magazin.adaugaProdus(electronice, d1);

        double totalPret = magazin.calculeazaValoareStoc(electronice);
        System.out.println("Pret total valoare stoc electronice : " + totalPret);

        double prag = 100.0;
        List<Produs> rezultate = magazin.filtreazaSiSorteaza(electronice, prag);

        System.out.println("=== Produse cu preț > " + prag + " sortate desc ===");
        rezultate.forEach(p ->
                System.out.printf("%s – %.2f%n", p.getNume(), p.calculeazaPret())
        );

        //
        System.out.println("\nInainte de swap: " +
                Arrays.toString(new String[]{
                        rezultate.get(0).getNume(), rezultate.get(1).getNume()
                })
        );
        // interschimb primele doua elemente
        Magazin.schimbaPozitii(rezultate, 0, 1);
        System.out.println("Dupa swap:   " +
                Arrays.toString(new String[]{
                        rezultate.get(0).getNume(), rezultate.get(1).getNume()
                })
        );


        // Pregatim doua liste de comenzi
        List<Produs> comenzi1 = Arrays.asList(c1, d1);
        List<Produs> comenzi2 = Arrays.asList(c2, c1, d1);


        Thread t3 = new Thread(new ProcesatorComenzi(comenzi1));
        Thread t4 = new Thread(new ProcesatorComenzi(comenzi2));
        // Pornim thread-urile simultan
        System.out.println("\nPornesc procesatorii de comenzi...");
        t3.start();
        t4.start();

        // Asteptam finalizarea lor
        try {
            t3.join();
            t4.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        System.out.println("Toate comenzile au fost procesate.");
    }
}
