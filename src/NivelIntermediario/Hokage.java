package NivelIntermediario;

public class Hokage {

    String nome;
    int idade;
    boolean vivoOuNao;

    public Hokage() {
        //Construtor vazio
    }

    public Hokage(String nome) {
        this.nome = nome;
    }

    public Hokage(int idade){
        this.idade = idade;
    }

    //Allargs constructor = construtor com todos os argumentos.
    public Hokage(String nome, int idade,  boolean vivoOuNao) {
        this.nome = nome;
        this.idade = idade;
        this.vivoOuNao = vivoOuNao;
    }



}
