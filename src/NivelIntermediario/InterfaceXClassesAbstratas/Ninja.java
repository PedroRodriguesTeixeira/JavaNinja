package NivelIntermediario.InterfaceXClassesAbstratas;

public abstract class Ninja implements estrategiaDeBatalha {
    String nome;
    String aldeia;
    int idade;

    //metodos abstratos
    public abstract void nomeDoNinja();

    public void tacarKunai() {
        System.out.println("Eu taquei um kunai.");
    }

    @Override
    public void estrategiaDeBatalha() {
        System.out.println("Essa é minha estratégia de batalha!");
    }
}
