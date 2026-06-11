package NivelIntermediario.SuperClassesESubClasses;

public abstract class Ninja {
    String nome;
    String sobrenome;
    String aldeia;

    public Ninja() {}

    public Ninja(String nome, String sobrenome, String aldeia) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.aldeia = aldeia;
    }
}
