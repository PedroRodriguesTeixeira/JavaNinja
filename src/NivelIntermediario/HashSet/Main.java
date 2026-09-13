package NivelIntermediario.HashSet;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<String> ninjas = new ArrayList<>();
        ninjas.add("Naruto Uzumaki");
        ninjas.add("Sasuke Uchiha");
        ninjas.add("Sakura Haruno");
        ninjas.add("Naruto Uzumaki");

        System.out.println("ninjas = " + ninjas);


        Set<String> ninjasSet = new HashSet<>();
        ninjasSet.addAll(ninjas);
        System.out.println("ninjasSet = " + ninjasSet);
        // não funcionaria ninjas.remove(0) visto que não há index.
        ninjasSet.remove("Sakura Haruno");
        System.out.println("ninjasSet com elemento removido = " + ninjasSet);
    }
}
