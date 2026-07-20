package NivelIntermediario.GettersESetters;

public abstract class Ninja {

    private String nome;
    private String aldeia;
    private int idade;
    private int numeroDeMissoesConcluidas;
    private double altura = 2.10;


    //tirar dados ou mostrar para o usuario eu uso o GET + NOME DA VARIAVEL
    public String getNome() {
        return nome;
    }

    //Setter recebe valores
    public void setNome(String nome) {
        this.nome = nome;
    }



}
