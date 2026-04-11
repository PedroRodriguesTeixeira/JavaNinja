package NivelBasico.Desafios;

import java.util.Scanner;

public class Desafio2 {

    public static void main(String[] args) {

        //Opcoes de controle
        int opcao = 0;
        boolean loop = true;

        //Array
        String[] nomeNinja = new String[0];
        int qntNinjas = 0;


        Scanner sc = new Scanner(System.in);

        while (loop) {

            System.out.println("=== Bem vindo ao sistema de cadastro de Ninja! ===");
            System.out.println("O que você deseja fazer?\n" +
                    "(1) - Cadastrar ninjas\n" +
                    "(2) - Lista de ninjas cadastrados\n" +
                    "(3) - Encerrar programa\n");

            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Quantos ninjas você quer cadastrar? ");
                    qntNinjas = sc.nextInt();
                    sc.nextLine();
                    nomeNinja = new String[qntNinjas];
                    for (int i = 0; i < qntNinjas; i++) {
                        System.out.print("Digite o nome do ninja " + (i + 1) + ": ");
                        nomeNinja[i] = sc.nextLine();
                    }
                    break;
                case 2:
                    if (nomeNinja.length == 0){
                        System.out.println("Lista está vazia!");
                    } else{
                        System.out.println("Os ninjas cadastrados no sistema são: ");
                        for (int i = 0; i < nomeNinja.length; i++) {
                            System.out.println(nomeNinja[i]);
                        }

                    }
                    break;

                case 3:
                    System.out.println("Encerrando programa!");
                    loop = false;
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }
            System.out.println();
        }

        sc.close();
    }
}
