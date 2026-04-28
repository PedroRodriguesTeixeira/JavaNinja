package NivelIntermediario.Desafio1;

public class Ninja {

    String nome;
    int idade;
    String missao;
    String nivelDificuldade;
    String statusMissao;


    public void mostrarInformacoes(){
        System.out.println("Nome: " + nome + "\n"
        + " Idade: " + idade + "\n"
        + " Missao: " + missao + "\n"
        + " Nivel dificuldade: " + nivelDificuldade + "\n"
        + " Status: " + statusMissao + "\n");
    }
}
