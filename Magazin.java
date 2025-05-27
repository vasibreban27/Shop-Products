package utcn;

import java.util.*;
import java.util.stream.Collectors;

public class Magazin {
    private Map<Categorie, List<Produs>> stoc;

    public Magazin(){
        stoc = new HashMap<Categorie, List<Produs>>();
    }

    public void adaugaProdus(Categorie cat,Produs prod){
        stoc.computeIfAbsent(cat, x->new ArrayList<>())
                .add(prod);
    }

    public double calculeazaValoareStoc(Categorie cat){
        return stoc.getOrDefault(cat, Collections.emptyList())
                .stream()
                .mapToDouble(Produs::calculeazaPret)
                .sum();
    }

    public void adaugaProduse(Categorie cat,List<? extends Produs> prods){
        stoc.computeIfAbsent(cat, x->new ArrayList<>())
                .addAll(prods);
    }

    public List<Produs> filtreazaSiSorteaza(Categorie cat,double pretPrag){
        return stoc.getOrDefault(cat, Collections.emptyList())
                .stream()
                .filter(p -> p.calculeazaPret() > pretPrag)
                .sorted(Comparator.comparing(Produs::calculeazaPret).reversed())
                .collect(Collectors.toList());

    }

    public static <T> void schimbaPozitii(List<T> list, int i, int j){
        int size = list.size();

        T temp = list.get(i);    //interschimbare
        list.set(i, list.get(j));
        list.set(j, temp);
    }
}
