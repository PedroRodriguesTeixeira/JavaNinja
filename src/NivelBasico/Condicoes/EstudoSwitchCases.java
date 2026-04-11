package NivelBasico.Condicoes;

import java.util.Scanner;

public class EstudoSwitchCases {

    public static void main(String[] args) {
        /*
        *
        * Switch case: Que servem para gerar casos específicos.
        * Objetivo: Pedir para usuario escolher entre os ninjas.
        *
        * */

        //Pedir para o usuário

        Scanner scanner = new Scanner(System.in);

        // Mostrar opções para o usuário
        System.out.println("Escolha um personagem: ");
        System.out.println("1- Naruto Uzumaki");
        System.out.println("2 - Sasuke Uchiha");
        System.out.println("3- Sakura Haruno");

        //Pedir para o usuario escolher uma das opcoes
        int escolhaDoUsuario = scanner.nextInt();
        System.out.println("Você digitou o número " + escolhaDoUsuario);

        //Reacao ao escolher um personagem

        switch (escolhaDoUsuario) {
            case 1:
                System.out.println("Usuário escolheu o Naruto Uzumaki.");
                break;
            case 2:
                System.out.println("O usuário escolheu o Sasuke Uchiha.");
                break;
            case 3:
                System.out.println("O usuário escolheu a Sakura Haruno.");
                break;
            default:
                System.out.println("Você não digitou uma resposta válida. Tente novamente.");
                break;
        }

        //fechar a caixa
        scanner.close();
    }
}
