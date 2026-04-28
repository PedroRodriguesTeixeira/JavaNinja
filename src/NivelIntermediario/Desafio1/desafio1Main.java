package NivelIntermediario.Desafio1;

public class desafio1Main {

    public static void main(String[] args) {
        Ninja qualquerNinja = new Ninja();
        qualquerNinja.nome = "Robson";
        qualquerNinja.idade = 18;
        qualquerNinja.missao = "Cuidar dos jovens ninjas";
        qualquerNinja.nivelDificuldade = "Fácil";
        qualquerNinja.statusMissao = "Em  andamento";
        qualquerNinja.mostrarInformacoes();

        Uchiha Itachi = new Uchiha();
        Itachi.nome = "Itachi";
        Itachi.idade = 18;
        Itachi.missao = "Eliminar os outros Uchihas";
        Itachi.nivelDificuldade = "Difícil";
        Itachi.statusMissao = "Finalizada";
        Itachi.habilidadeEspecial = "mangekyou sharingan";
        Itachi.mostrarInformacoes();
    }
}
