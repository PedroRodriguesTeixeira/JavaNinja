package NivelIntermediario.Polimorfismo;

public class MainPolimorfismo {
    public static void main(String[] args) {
        UzumakiPolimorfismo naruto = new UzumakiPolimorfismo();
        naruto.nome = "Naruto Uzumaki";
        naruto.habilidadeEspecial();

        UchihaPolimorfismo sasuke = new UchihaPolimorfismo();
        sasuke.nome = "Sasuke Uchiha";
        sasuke.habilidadeEspecial();
    }
}
