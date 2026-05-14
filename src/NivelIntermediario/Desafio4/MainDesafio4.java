package NivelIntermediario.Desafio4;

public class MainDesafio4 {

    public static void main(String[] args) {
        NinjaBasico Naruto = new NinjaBasico("Naruto Uzumaki", 10, "Rasengan");
        Naruto.mostrarInformacoes();
        Naruto.executarHabilidade();

        System.out.println("----\n");

        NinjaAvancado Itachi = new NinjaAvancado("Itachi Uchiha", 27, "Genjutsu", "Mangekyo Sharingan");
        Itachi.mostrarInformacoes();
        Itachi.executarHabilidade();
    }
}
