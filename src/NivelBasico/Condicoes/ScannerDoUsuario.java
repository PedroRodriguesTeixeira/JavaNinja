package NivelBasico.Condicoes;

import java.util.Scanner;

public class ScannerDoUsuario {

    public static void main(String[] args) {
        /*
         * Scanner = é um jeito de trazer o usuario para dentro da aplicacao.
         * Objetivo: O usuario vai criar um ninja e vamos validar os dados.
         * */

        Scanner caixaDeTexto = new Scanner(System.in);

        //Receber o nome do ninja:
        System.out.println("Digite o nome do ninja: ");
        String nomeDoNinja = caixaDeTexto.nextLine();
        System.out.println("Nome: " + nomeDoNinja);

        //Receber a idade do ninja:
        System.out.println("Escreva aqui a idade do seu ninja: ");
        int idadeNinja = caixaDeTexto.nextInt();
        System.out.println("A idade do ninja é: " + idadeNinja + " anos");

        //tratamento de dados
        if(idadeNinja >= 18) {
            System.out.println("Esse ninja já é maior de idade e pode ir para missões fora da aldeia.");
        } else {
            System.out.println("Esse ninja é muito novo ainda, precisa terinar mais ainda.");
        }

        //Sempre fechar o Scanner
        caixaDeTexto.close();
    }
}
