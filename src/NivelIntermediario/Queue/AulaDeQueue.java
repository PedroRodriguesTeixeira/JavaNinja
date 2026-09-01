package NivelIntermediario.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class AulaDeQueue {

    public static void main(String[] args) {


        //QUEUE ou FILAS

        Queue<String> filaDeNinjas = new LinkedList<>();
        filaDeNinjas.add("Naruto");
        filaDeNinjas.add("Sasuke");
        filaDeNinjas.add("Sakura");
        filaDeNinjas.add("Kakashi");
        filaDeNinjas.add("Shikamaru");


        //Mostrar a fila
        System.out.println("Ninjas na fila: " + filaDeNinjas);

        //Tirar um ninja da fila
        filaDeNinjas.poll();
        System.out.println("Ninjas na fila depois do POOL: " + filaDeNinjas);

        //Como ver quem é o primeiro (Vai procurar o head)
        System.out.println("Ninja do topo(head) da fila: " + filaDeNinjas.peek());

        //Esvaziar fila
        int tamanhoOriginalFila = filaDeNinjas.size();
        for (int i = 0; i < tamanhoOriginalFila; i++) {
            System.out.println(filaDeNinjas.peek());
            filaDeNinjas.poll();
        }

        //Verifcar se a fila está vaiza
        if(filaDeNinjas.isEmpty()){
            System.out.println("A fila está vaiza.");
        } else {
            System.out.println("Fila cheia.");
        }
    }
}
