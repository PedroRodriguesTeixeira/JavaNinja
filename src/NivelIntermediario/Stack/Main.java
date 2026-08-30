package NivelIntermediario.Stack;


import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        //Array
        //Sao estaticos e tem referencia de memoria
        String[] ninjaArray = new String[10];
        //Adicionado elemento
        ninjaArray[0] = "Orochimaru";


        //Listas
        // Sao dinamicas, ou seja, tamanho aumenta/diminuem quando precisam
        List<String> ninjasList = new ArrayList<>();
        //Adicionadno elemento
        ninjasList.add("Lee");

        //Stack
        // O ultimo elemento que entrou é obrigatoriamente o primeiro a sair
        Stack<String> ninjasStack = new Stack<>();
        //Adicionando elemento
        ninjasStack.push("Naruto Uzumaki");
        ninjasStack.push("Sasuke Uchiha");
        ninjasStack.push("Sakura Haruno");
        ninjasStack.push("Gaara");
        System.out.println("Minha Stack atual: " + ninjasStack);
        //Removendo elemento
        ninjasStack.pop();
        System.out.println("Minha Stack atualizada com pop: " + ninjasStack);
        //Verificar qual o próximo elemento da pilha
        System.out.println("Minha Stack com o próximo elemento do topo: " + ninjasStack.peek());
        //Size
        System.out.println("Tamanho da minha stack: " + ninjasStack.size() + "elementos" + ninjasStack);


    }
}
