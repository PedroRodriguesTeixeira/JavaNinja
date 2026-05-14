package NivelIntermediario.Desafio4;

public class NinjaBasico implements Ninja {

    String nome;
    int idade;
    String habilidade;

    public NinjaBasico(String nome, int idade, String habilidade){
        this.nome = nome;
        this.idade = idade;
        this.habilidade = habilidade;
    }

    public void mostrarInformacoes() {
        System.out.println("Meu nome é " + nome + " e eu tenho " + idade);
    }
    public void executarHabilidade() {
        System.out.println("Minha habilidade é " + habilidade);
    }

}
