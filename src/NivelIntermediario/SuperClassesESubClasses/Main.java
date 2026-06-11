package NivelIntermediario.SuperClassesESubClasses;

public class Main {

    public static void main(String[] args) {
        //Obj Uchiha com acesso aos construtores criados pela superclasse
        Uchiha Itachi = new Uchiha("Itachi", "Uchiha", "Aldeia da folha");

        System.out.println(Itachi.nome + "\n" + Itachi.sobrenome + "\n" + Itachi.aldeia);
    }

}
