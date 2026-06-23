package NivelIntermediario.valorEmMemoria;

public class Main {

    public static void main(String[] args) {
        SubClasse subClasse = new SubClasse();
        Subclasse2 subclasse2 = new Subclasse2();
        System.out.println(subclasse2);
        System.out.println(subClasse.toString());


        //exemplo de objetos (referência de memória)
        String[] array1 = {"Naruto", "Sasuke"};
        String[] array2 = array1;

        System.out.println(array1);
        System.out.println(array1[0]);
        System.out.println(array2);
        array2[0] = "Sakura";
        System.out.println(array2[0]);
    }
}
