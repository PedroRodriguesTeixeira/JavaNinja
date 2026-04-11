package NivelBasico.Arrays;

public class Array {

    public static void main(String[] args) {


        /*
        *
        * */

        //Arrays são tipos referência
        String[] nomeNinja = new String[6];

        nomeNinja[0] = "Naruto Uzumaki";
        nomeNinja[1] = "Sasuke Uchiha";
        nomeNinja[2] = "Sakura Haruno";
        nomeNinja[3] = "Hinata Hyuga";
        nomeNinja[4] = "Kakshi Hataka";

        System.out.println(nomeNinja[5]);


        int[] idade = new int[2];
        idade[0] = 16;
        System.out.println(idade[1]);

        boolean[] verdadeiroOuFalto = new boolean[1];
        System.out.println(verdadeiroOuFalto[0]);


        double[] flutuante = new double[1];
        System.out.println(flutuante[0]);

        //Redeclarar array
        nomeNinja = new String[7];
        nomeNinja[0] = "Hashirama Senju";
        nomeNinja[1] = "Tobirama Senju";
        nomeNinja[2] = "Hiruzen Sarutobi";
        nomeNinja[3] = "Minato Namikaze";
        nomeNinja[4] = "Tsnuade";
        nomeNinja[5] = "Kakashi Hatake";
        nomeNinja[6] = "Naruto Uzumaki";


        //For para fazer LOOP no array
        for (int i = 0; i < 7; i++) {
            System.out.println("nomeNinja[" + i + "]: " + nomeNinja[i]);
        }


    }
}
