package NivelIntermediario.Desafio4;

public class NinjaAvancado implements Ninja{

    String nome;
    int idade;
    String habilidade;
    String especialidade;

    public NinjaAvancado(String nome, int idade, String habilidade,  String especialidade){
        this.nome = nome;
        this.idade = idade;
        this.habilidade = habilidade;
        this.especialidade = especialidade;
    }

    public void mostrarInformacoes() {
        System.out.println("Meu nome é " + nome + " e eu tenho " + idade);
    }
    public void executarHabilidade() {
        System.out.println("Minha habilidade é " + habilidade + ". Porém eu tenho uma habilidade especial que é " + especialidade);
    }
}
