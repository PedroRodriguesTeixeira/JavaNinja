package NivelIntermediario.LinkedList;

import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<>();
        list.add("Naruto Uzumaki");
        list.add("Sasuke Uchiha");
        list.add("Sakura Haruno");

        System.out.println(list);

        list.add(1,"Kakashi Hatake");

        System.out.println(list);

        list.remove(2);

        System.out.println(list);
    }
}
