package NivelIntermediario.Desafio1;

public class Uchiha extends Ninja {
    String habilidadeEspecial;

    public void mostrarHabilidadeEspecial(){
        System.out.println("Habilidade Especial: " + habilidadeEspecial);
    }

    @Override
    public void mostrarInformacoes(){
        System.out.println("Nome: " + nome + "\n"
                + "Habilidade Especial: " + habilidadeEspecial + "\n"
                + " Idade: " + idade + "\n"
                + " Missao: " + missao + "\n"
                + " Nivel dificuldade: " + nivelDificuldade + "\n"
                + " Status: " + statusMissao + "\n");
    }
}
