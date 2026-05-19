package InterfaceXClassesAbstratas;

public abstract class Ninja {
    String nome;
    String aldeia;
    int idade;

    //metodos abstratos
    public abstract void nomeDoNinja();

    public void tacarKunai() {
        System.out.println("Eu taquei um kunai.");
    }

}
