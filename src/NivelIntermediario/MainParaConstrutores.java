package NivelIntermediario;

public class MainParaConstrutores {

    public static void main(String[] args) {
        Hokage Hashirama = new Hokage();

        Hokage Tobirama = new Hokage("Tobirama");
        System.out.println(Tobirama.nome);

        Hokage Hiruzen = new Hokage(40);
        System.out.println(Hiruzen.idade);

        Hokage Minato = new Hokage("Minato Namikaze", 32, false);
        System.out.println(Minato.nome);
    }

}
