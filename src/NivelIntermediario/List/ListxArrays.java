package NivelIntermediario.List;

import java.util.ArrayList;
import java.util.List;

public class ListxArrays {

    public static void main(String[] args) {
        //Array
        //São estáticos, nçao alteram de tamanhno
        String[] ninjaArray = new String[4];
        ninjaArray[0] = "Naruto";
        ninjaArray[1] = "Sasuke";
        ninjaArray[2] = "Sakura";

        System.out.println("Pritando ninja 1: " + ninjaArray[0]);
        System.out.println("Pritando posição vazia: " + ninjaArray[3]);

        //Listas
        //Listas não são estáticas, elas podem aumentar ou diminuir
        List<String> ninjasList = new ArrayList<>();
        //Adicionar na lista
        ninjasList.add("Naruto Uzumaki"); //Index 0
        ninjasList.add("Sasuke Uchiha"); //Index 1
        ninjasList.add("Sakura Haruno"); //Index 2
        ninjasList.add("Tobirama Senju"); //Index 3
        ninjasList.add("Migth Guy"); //Index 4

        //soutv
        System.out.println("ninjasList = " + ninjasList);


        //Remover da lista
        ninjasList.remove("Migth Guy");
        System.out.println("ninjasList = " + ninjasList);


        //Trocar elementos
        ninjasList.set(3, "Kakashi Hatake");
        System.out.println("ninjasList troca de elementos = " + ninjasList);

        //Ver o tamanho da lista
        System.out.println("Tamanho lista =" + ninjasList.size() + " Elemento");
    }

}
