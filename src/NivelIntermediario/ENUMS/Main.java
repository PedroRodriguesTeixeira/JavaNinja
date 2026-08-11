package NivelIntermediario.ENUMS;

public class Main {

    public static void main(String[] args) {
        Missoes missao1 = new Missoes("Regastar cachorro", RankDeMissoes.D);
        missao1.exibirDetalhes();

        Missoes missao2 = new Missoes("Derrotar Zabuza", RankDeMissoes.A);
        missao2.exibirDetalhes();

        //Obtendo as instãncias contantes da classe ENUM
        for(RankDeMissoes rank : RankDeMissoes.values()){
            System.out.println(rank);
        }
    }
}
